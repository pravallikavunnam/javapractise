package OOP_Abstraction;

//UNMedical is not only extending WHO Interface it is also extending UN Interface
public interface USMedical extends WHO,UN{
	
	//we can create variable in the interface
	//Interface variables are static and final by default
	//why static: 
	
	
	int min_fee=10;
	
	
	//A method has no body
	//only have method declaration or method prototype or no business logic
	//we cannot have business logic in Interface
	//these methods are  called Abstract Methods
	//we can add abstract keyword also---but in interface methods are by default abstract in nature 
	//Abstract methods----Static is not allowed
	
	
	//Abstraction----Hiding the implementation because there is no implementation
	
	//Interfaces are always 100% Abstraction upto JDK 1.7 --As methods have no body
	//Now partial abstraction from JDK 1.8 --As we have static method and default non-static methods with body
	//Partial Abstraction can be achieved with abstract classes also
	
	
	
	public void physioServices();  //Method body is not allowed { }
	
	public abstract void  cardioServices();
	
	public void ENTServices();
	
	public void emergencyServices();
	
	//more method with parameters
	
	public void test(int a);
	
	public String get(int a);
	
	//overloading the methods
	public String get(int a,int b);
	
	//Method overloading is possible in Interfaces
	//I can tell the child class to how to implement particular methods
	//Business logic we cannot write in interface but signature i can define for the methods
	
	//can we create a static abstract method ---no ,If we create static abstract method we have to overridden 
	//----where static method cannot be overridden
	
	//Abstract methods cannot be static
	//but variables can be static
	
	@Override
	public void covidVaccination(); //Overriding method from WHO parent Interface in USMedical interface
	
	//Abstract methods won't have body
	//static methods are not abstract
	//Static methods cannot be overidden
	//Static method in parent class and child class--this concept is Method Hiding
	
	//from JDK 1.8  onwards there are two imp things got added to Interface
	
	//1.Now we can have static method with method body(Business logic) in interface
	public static void USMedPharmcy() { //method body is allowed in Interface
		System.out.println("US medical pharmacy");
	}
	
	//we can overload static method
	public static void USMedPharmcy(int a ) { //method body is allowed in Interface
		System.out.println("US medical pharmacy");
	}
	
	//2. Default method which is non-static with method body
		//use default keyword we create a method with method body in Interface
		//default is a special keyword in Interface from JDK 1.8
	
		default void billing() {
			System.out.println("USMedical Billing");
			
		}
		//we can overload default method
		default void billing(int b) {
			System.out.println("USMedical Billing");
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}  
