
package inheritance;

//If a class is declared as final then the class cannot be parent
public class Car extends Vehicle{

	//use case of final
	//1. Constant values ie final int i=10;---no one can change the i value
	//2. to prevent method overriding---logo example
	//3. to prevent Inheritance----if a class cannot be parent at all
	
	//final method cannot be overriden
	//final method can be Inherited --yes
	
	//Static method cannot be overriden---but same static method can be parent class and child class --this is Method Hiding
	//Static method can be inherited using classname
	
	//Private cannot be overriden
	
	
	
	public void start() {

		System.out.println("Car---- Start");
	}

	public void stop() {

		System.out.println("Car----Stop");
	}

	public void refuel() {

		System.out.println("Car----refuel");
	}
	
	public static void billing() { //can we override static method in the child class----No
		System.out.println("Car -----billing");
	}
	
	//Private methods cannot be overriden  or cannot be called outside the class
		//only way to call to private methods ,need to create public method and then call private method via public method internally --
		//and can give access via public method---ie with the help of encapsulation
	private static void testing() {
		System.out.println("Car ----------testing");
	}
	
	
	//If a method is declared with final keyword ---cannot be overriden
	
	public final void power() {
		System.out.println("Car------Power");
	}
	
	//Cannot be overidden
	public final static void ABC() {
		System.out.println("Car-------ABC");
	}
	
	

}
