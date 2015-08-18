package training.spring.annotation;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;


@Controller
public class AddUserFormController {

	
	@RequestMapping(value = "/AddUser", method = RequestMethod.GET)
	public String displayForm(Model model,HttpServletRequest request) {
			
		model.addAttribute("user",new User());
		ArrayList<String> st=new ArrayList<String>();
		st.add(new String("Amit"));
		
		model.addAttribute("l1", st);
	return "addUser";
	}
	
	
	@RequestMapping(value = "/ProcessUser")
	public String processForm(@Valid User user, BindingResult bindingResult) {
		System.out.println("in process user");
		System.out.println(bindingResult.hasErrors());
		System.out.println(user.getUsername() + "   " + user.getPassword());
		if (bindingResult.hasErrors()) {
			return "addUser";
		}
		else {
			// some logic to persist user
			return "success";
		}
	}
}
