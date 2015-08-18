package springConfigEx;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView; 

import springConfigEx.Person;

@Controller  
public class PersonController {  
  
    @RequestMapping(value="/person-form")  
    public ModelAndView personPage() {  
    	System.out.println("inside person-age");
        return new ModelAndView("person-page", "person-entity", new Person());  
    }  
      
    @RequestMapping(value="/process-person")  
    public ModelAndView processPerson(@ModelAttribute Person person) {  
    	System.out.println("inside processperson");
        ModelAndView modelAndView = new ModelAndView();  
        modelAndView.setViewName("person-result-page");  
          
        modelAndView.addObject("pers", person);  
        System.out.println("inside processperson-after addObject");
          
        return modelAndView;  
    }     
}  
