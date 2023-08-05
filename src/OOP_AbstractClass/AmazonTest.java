package OOP_AbstractClass;

public class AmazonTest {

	public static void main(String[] args) {

		//create object of Login class
		
		LoginPage lp=new LoginPage(10); //calls parent class constructor
		
		lp.title();
		lp.url();
		lp.defaultPageTimeOut(); //child class method will be called
	//	lp.displayFooters(); //gives warning because it is static method which should be called with className
		Page.displayFooters();
		lp.displayLogo();
		lp.doLogin();
		
		System.out.println("-----------");
		//can we do Top casting with abstract classes
		//child class object referred by parent abstract class reference variable
		Page p=new LoginPage(); //calls parent class constructor
		p.title(); 
		p.url();
		p.displayLogo();
		p.defaultPageTimeOut();
		Page.displayFooters();
	//	p.doLogin(); //cannot access child class individual method
		
		//can we do down casting at complie time ---No
		//LoginPage lp=new Page(); //gives error because we cannot create object of abstract class
		
		
		
		
		
		
		
		
		
		

	}

}
