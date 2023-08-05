package inheritance;

public class BMW extends Car { // We use extends keyword to create parent and child relationship
								// 1. BMW Class is child of Car Class
								// 2. Car class is parent of BMW Class
								// 3. Car class is superclass of BMW Class
								// 4. BMW class is subclass of Car Class

    //Method Overriding is always Runtime Polymorphism or Dynamic Polymorphism
	//when we have same method in parent and child class complier gets confused so allowing methods without giving error 
	//so lets decide  at run time which method to call 
	//JVM will check okay method is overridden ---at the runtime it is decided which method to call
	//Method Overriding: When we have a method in parent class and same method in the child class with :
	//--Same name
	//--the same number of parameters
	//--the same sequence/order of parameters
	//---the same return type
	
	@Override    
	public void start() { //Overridden Method from car class
		
		System.out.println("BMW ----Start");
	}
	
	//if we have same method in parent class and grandparent class ---parent class method gets overrriden
	@Override 
	public void enginee() {
		System.out.println("BMW----Enginee Method");
	}
	
	//we can override methods from Grand parents class and parents class also
	
	
	//Individual Method
	public void autoParking() {
		
		System.out.println("BMW----autoParking");
	}
	
	//can we override static method in the child class?no we cannot override static method in Java
	//this concept is called also as Method Hiding: when we try to have the same parent class static method in child class
  public static void billing() { 
	System.out.println("Car -----billing");
	}
	
	//Private methods cannot be overriden  or cannot be called outside the class
	//only way to call to private methods ,need to create public method and then call private method via public method internally --
	//and can give access via public method---ie with the help of encapsulation
	//@Override
	//Individual Private method
	private static void testing() { 
		System.out.println("Car ----------testing");
	}
	
	//we cannot even have the method in the child class 
//	public final void power() {
//		System.out.println("Car------Power");
//	}
	
	
	
	


	
}
