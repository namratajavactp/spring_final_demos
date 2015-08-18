package training.spring.annotation;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Person {

	@Size(min=3,max=20,message="Firstname must be between 3 and 20 characters long.")
	@Pattern(regexp="^[a-zA-Z0-9]+$", message = "Firstname must be alphanumeric with no spaces")
	 private String firstName;  
	
	
	    private Integer age;  
	      
	    public String getFirstName() {  
	        return firstName;  
	    }  
	      
	    public void setFirstName(String firstName) {  
	        this.firstName = firstName;  
	    }  
	      
	    public Integer getAge() {  
	        return age;  
	    }  
	      
	    public void setAge(Integer age) {  
	        this.age = age;  
	    }  
	
	
}
