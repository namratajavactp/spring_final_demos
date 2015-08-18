package com.citi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.citi.domain.User;
import com.citi.service.UserService;

@Controller
@RequestMapping("/userRegistration.htm")
@SessionAttributes("user")
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
		
	
	
	@RequestMapping( method = RequestMethod.GET)
	public String showUserForm(ModelMap model)
	{System.out.println("showuserformCalled");
		User user = new User();
		model.addAttribute("user",user);
		return "userForm";
	}
	
	
	
	@RequestMapping( method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("user") User user) {
		userService.add(user);
		System.out.println("output from onSubmit"+user.getName());
		return "redirect:userSuccess.htm";
	}
	
	
	
}
/*Model attributes are persisted at the end of request handling by
AnnotationMethodHandlerAdapter, after calling your handler
method responsible for request handling and after determining 
the ModelAndView for the response. Their names in Model are used 
as their names in the persistent storage,
ex. @SessionAttributes("form") will trigger persisting Model
attribute named "form" as HttpSession attribute named "form".*/
/*Persisted Model attributes will be removed only if you'll 
call SessionStatus.setComplete() method in some of your 
handler methods.*/