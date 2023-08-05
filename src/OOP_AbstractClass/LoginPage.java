package OOP_AbstractClass;

public class LoginPage extends Page{  //gives error because Normal class is child of abstract class

	//As soon as we create object of the class LoginPage default constructor will be called
	//if default constructor is not available then --java will create one hidden default constructor internally in LoginPage class
	//then it will go to Page class ,checks for default constructor ,if it is available executes
	
	//creating one default constructor
	public LoginPage() {
		System.out.println("Login Page default Constructor ");
	}
	
	//can we overload default constructor--yes
	//1. Parent class constructor
	//2.Child class paramterized cosntructor will be called
	//3. Methods
	
	public LoginPage(int i) {
		System.out.println("Login Page Constructor " + i);
	}
	
	//if we have default constructors in parent class and child class --it will consider parent class constructor first 
	//and then child class constructor will be called in terms of constructor concept
	//1. Parent class constructor
	//2. child class constructor
	//3. methods
	
	
	//child class responsibility is to implement abstract methods of parent class
	@Override
	public void title() {

		System.out.println("child class title");
		
	}

	@Override
	public void url() {
		System.out.println("child class url");
		
	}
	//Method overding       Runtime polymorphism
	//can we override non-abstract methods--- child class can override from parent class non-abstract methods
	@Override
	public void defaultPageTimeOut() {
		System.out.println("Page time out is 5 sec");
		
	}
	//but cannot override parent class non-abstract static and non-abstract final methods
	
//	@Override
//	public static void displayFooters() {
//		System.out.println("Page will display footers");
//		
//	}
//	public final void displayLogo() {
//		
//		
//	}
	
	//Individual method of login class
	public void doLogin() {
		System.out.println("Login");
		
	}
	
	

}
