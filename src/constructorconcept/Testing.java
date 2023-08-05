package constructorconcept;

public class Testing {
	
	//Requirement is----
	//No one can create the object of this class----we can create a constructor using private keyword
	//outside of the class if any one try to create object of the class they cannot create the object of the class
	
	private Testing() {
		
	}
	
	
	
//	public void getApp() { //what is the use of this method?---No
//		                   //because outside  of the class we cannot create the object of testing class 
//							//i cannot call any method of testing class
//		
//	}
	
	//can we call above method?
	//if we have main method in this class then only we can create object of the class and call the getApp method
	//within the class we can create the object of the class even we used private keyword for constructor
	//within the class everything is possible
	
	//testing class is already there by selenium  ,where the  private constructor is already defined ,i cannot go to that class and create main method over there
	//main method should be created in your caller class in some other class,
	//In some other class m going to use and then create object of testing class which is not possible
	
		//If a particular class is having a private constructor?
		//No one can  create object of the class?-----then what type of method we need to define in class----Static
		//Static ---create all methods static in nature like public static void getApp.............
		//so now no need to create the object of testing class
		//if i want to call the methods i can call with the help of classname like Testing.getApp in caller class where have main method
	
	
	public static void getApp() {
		
	}
	
	public static void getAppNumber() {
		
	}
	public static void getBrowserVerison() {
		
	}
	
	//-------in which case we go for private constructor
	//1. we don't want anyone to create object of the class
	//2. If any private constructor is available in the class then all the methods in the class are static in nature
	//Example : which class having private constructor in java  -----System Class
	//System class methods and variables are static in nature
	//no Non-static property there in system class because of private constructor
	
	
	
	
	
	
	
	
	
	
}



