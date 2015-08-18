package training.spring.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.*;
import javax.servlet.http.*;

@Controller
@RequestMapping("/welcome")
public class HelloController2 {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		System.out.println("inside controller");

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello1";

	}
	
}