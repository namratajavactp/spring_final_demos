package training.web.spring;

import javax.servlet.ServletException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

public class UserLoginFormController extends SimpleFormController {

	public ModelAndView onSubmit(Object command) throws ServletException {
		User user = (User) command;
		if(user.getUsername().equals("chand") && user.getPassword().equals("ali123456"))
			return new ModelAndView(new RedirectView(getSuccessView()));
		else return new ModelAndView("errohhr");
	}
}
