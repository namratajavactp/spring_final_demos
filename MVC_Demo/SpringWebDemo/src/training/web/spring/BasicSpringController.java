package training.web.spring;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.HashMap;

public class BasicSpringController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		String now = new java.util.Date().toString();
		HashMap<String,User> hs=new HashMap<String, User>();
		
		User u=new User();
		u.setUsername("amit");
		User u2=new User();
		u2.setUsername("amitkumar");
		hs.put("u1",u);
		hs.put("u2", u2);
		
		return new ModelAndView("hello","modelname",hs);
		//return new ModelAndView("hello","modelname",now);
	}
};