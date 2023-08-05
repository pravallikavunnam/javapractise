package encapsulation;

public class Selenium {

	private Selenium() { //private constructor
		
	}
	
//	if we try to create object for this class we get error because of private constructor
	
	//so i will make use static ---as with static we can use methods with classname without object creation like Selenium.click()
	
	public static void click() {
	
		System.out.println();//here System is a class which has private constructor
		                     //out is a object reference variable of PrintStream class
		                     //println is a method of PrintStream Class
		
	}
	
	//when we use private constructor?
	//i have to use private constructor-- when no need to create the object
	 //                     ---when all the properties are static in nature
	//example : System class with the private constructor
	
	
}
