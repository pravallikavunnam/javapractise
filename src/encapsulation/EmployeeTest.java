package encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {


		Employee e1=new Employee();
		//e1.name;//we cannot access because they are declared privately
		e1.setName("Tom"); //i can call setName method because it is publicly available
//		String n=e1.getName();  //whatever method is returning storing in string			
//		System.out.println(n); //whatever value we have set thorough setName method same value we will get with getName method
		e1.setAge(20);
		e1.setSalary(2000);
		
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
		System.out.println(e1.getAmount(100)); //we can use getAmount but output will be default value 0
		//we cannot access set amount method as we have not created that method for amount var
	
	//	e2.setAmount//no method is available we cannot set as there is no public method
	
	//	e2.amount//we cannot access amount var directly;
		
		
		//we have only one method available getAmount
		
		
		//without setting the values if we try to get the values we get default values null for string ,o for int ,0.0 for double in the console
		Employee e2=new Employee();
		System.out.println(e2.getName());
		System.out.println(e2.getAge());
		System.out.println(e2.getSalary());
		System.out.println(e2.getAmount(5));
		
		/*-------------------------------LoginPageTest---------------*/
		LoginPage lp=new LoginPage();
		lp.setUsername("abc@123.com");
		lp.setPassword("123456");
		lp.doLogin();
		
		//other user coming --so object lp1 will be different
		LoginPage lp1=new LoginPage();
		lp1.doLogin(); //without setting username and password if we try to call the method it will return default null values for string
		
		
		//other user 
		LoginPage lp2=new LoginPage();
		lp2.setUsername("customer@123.com");
		lp2.setPassword("customer123456");
		lp2.doLogin();
		
}
	
	
	
	

}
