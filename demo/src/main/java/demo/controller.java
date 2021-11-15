package demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	
	@RequestMapping("/")
	public String home() {
		return "homepage";
	}
	
	@GetMapping("/orderpage")
	public String showForm(Model model) {
		Order ord = new Order();
		model.addAttribute("order", ord);
		return "order_form";
		
	}
	
	@PostMapping("/orderpage")
	public String submitForm(@ModelAttribute("ord") Order ord) {
		return "order_success";
	}

}
