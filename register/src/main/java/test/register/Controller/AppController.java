package test.register.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import test.register.Model.Order;
import test.register.Repository.UserRepository;

import test.register.Model.*; 
@Controller
public class AppController {
 
    @Autowired
    private UserRepository userRepo;

    @Autowired
	private JdbcTemplate jdbcTemplate;
     
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

    @GetMapping("/menu")
	public String menu() {
		return "menu";
	}

    @GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {

		// use BCryptPasswordEncoder to encode the user’s password 
		// so the password itself it not stored in database (for better security)
		// only the hash value of the password is stored.
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		return "users";
	}

	@GetMapping("/history")
	public String history() {
		return "order_history";
	}

	@GetMapping("/orderpage")
	public String showForm(Model model) {
		Order ord = new Order();
		model.addAttribute("order", ord);
		return "order";
	}
	
	@PostMapping("/orderpage")
	public String submitForm(@ModelAttribute("ord") Order ord) {
		String sql = "INSERT INTO coffeeOrder (drink_name, size, temperature, milk, topping, price) VALUES(?,?,?,?,?,?)";
		ord.calculatePrice();
		int result = jdbcTemplate.update(sql, ord.getDrinkName(),ord.getSize(),ord.getTemp(),ord.getMilk(),ord.getTopping(),ord.getPrice());
		
		if (result>0) {
			System.out.println("new entry has been added");
		}
		return "order_success";
	}
}
