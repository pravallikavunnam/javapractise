package constructorconcept;

public class LoginTest {
	//runner class or caller class

	public static void main(String[] args) {

		//we have created one object referred by lp and a copy of username and password will be given to object
		//the doogin and resetPwd-- two non-static methods also given a copy to the object
		
		//create one single object and access all data members either it is class or method they can  talk to each other without creating new object
		
		LoginPage lp=new LoginPage("abc@gmail.com", "123456");
		lp.doLogin();  //call the method --these methods can access username and password?
		
		//if we have one more user
	//	LoginPage lp=new LoginPage("pk@gmail.com", "1265456");  ---this user cannot use previous user reference var---need to create one more object
		
		LoginPage lp1=new LoginPage("plll@gmail.com", "123456");
		lp1.doLogin();
		lp1.resetPwd();
		
		//if we have multiple users multiple objects we have to create
		//object creation --with the help of constructor we have to use new keyword and class name and supply data
		//but in the Login page we won't change anything tomorow if we have n number of customers also.
		//because login page behaves like a template  ---global var are like templates to define login page ,constructor like to define object,
		//----methods to define functions any user can login and reset password
		//same constructor should fulfill the requirement of login page
		
		
		//when we try to call them from main method class(runner/caller class)
		//here caller has to create the object because we have different varieties of user
		
		//constructor is part of class it is not part of object 
		//constructor won't be stored anywhere like in heap memory or stack memory they are part of class loaders
		//
		

		
		

	}

}
