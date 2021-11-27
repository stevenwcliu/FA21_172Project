package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@GetMapping("/home") //guide page to homepage
	public String home() {
		return "homepage";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/orderpage")
	public String showForm(Model model) {
		Order ord = new Order();
		model.addAttribute("order", ord);
		return "order_form";
		
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
