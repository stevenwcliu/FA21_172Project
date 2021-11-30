package test.register;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
 
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

    // @GetMapping("") 
	// public String home() {
	// 	return "homepage";
	// }

    @GetMapping("/menu")
	public String menu() {
		return "menu";
	}

    @GetMapping("/order")
	public String showForm(Model model) {
		Order ord = new Order();
		model.addAttribute("order", ord);
		return "order";
	}

    @GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}

	@GetMapping("/history")
	public String history() {
		return "order_history";
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
