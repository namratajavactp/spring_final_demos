package constructordi.constructorarg;

public class Employee 
{
	private String firstname="dude";
	private String lastname="dude";
	private MyDate d;
	
	public Employee()
	{
		System.out.println("inside default constructor of Employee()");
	}

    public Employee(String firstname)
	{
		System.out.println("inside constructor Employee(String)");
		this.firstname = firstname;
	}

	public Employee(String firstname,String lastname)
	{
		System.out.println("inside constructor Employee(String,String)");
		this.firstname = firstname;
		this.lastname = lastname;
	} 
    
    
	public Employee(String firstname,String lastname,MyDate d)
	{
		System.out.println("inside constructor Employee(String,String,d)");
		this.firstname = firstname;
		this.lastname = lastname;
		this.d=d;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
    
	public MyDate getD() {
		return d;
	}

	public void setD(MyDate d) {
		this.d = d;
	}
}