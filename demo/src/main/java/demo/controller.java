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
	
	
	@GetMapping("/") //guide page to homepage
	public String home() {
		return "/WEB-INF/views/homepage.jsp";
	}
	
	@GetMapping("/menu") // guide page to menu
	public String menu() {
		return "/WEB-INF/views/menu.jsp";
	}
	
	@GetMapping("/orderpage") //guide page to order page
	public String showForm(Model model) {
		Order ord = new Order();
		model.addAttribute("order", ord);
		return "/WEB-INF/views/order_form.jsp";
		
	}

	@PostMapping("/orderpage") // after order is submitted we get order information and inserted into database
	public String submitForm(@ModelAttribute("ord") Order ord) {
		String sql = "INSERT INTO coffeeOrder (drink_name, size, temperature, milk, topping, price) VALUES(?,?,?,?,?,?)";
		ord.calculatePrice();
		int result = jdbcTemplate.update(sql, ord.getDrinkName(),ord.getSize(),ord.getTemp(),ord.getMilk(),ord.getTopping(),ord.getPrice());
		
		if (result>0) {
			System.out.println("new entry has been added");
		}
		return "/WEB-INF/views/order_success.jsp";
	}
	
	
	
	
	

}
