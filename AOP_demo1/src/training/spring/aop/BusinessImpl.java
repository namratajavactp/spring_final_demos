package training.spring.aop;

public class BusinessImpl implements Business {
	 public String name="ALi";
    public void doBusiness(int x) {
            System.out.println("I do what I do best, i.e sleep.");
            try {
            	name="kashish";
                    Thread.sleep(2000);
            } catch (InterruptedException e) {
                    System.out.println("How dare you to wake me up?");
            }
            System.out.println("Done with sleeping.");
    }
    
   public void test(){
	   System.out.println(" hi i am in test method()");
	   
   }
}
