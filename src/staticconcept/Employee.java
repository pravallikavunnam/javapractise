package staticconcept;

public class Employee {
	
	//we can create same class names in different packages but not in same package
	//Why main method static in nature 
	//why main method void in nature
	
	String name;    //Instance/local variable//Non-static variable
	static int age; //class static variable ---these are static variables which are having static keyword
	
	//Non-Static Method
	public void getEmail() {  
		System.out.println("get Email Method");
	}
	
	//Static Method
	public static void sendEmail() {
		System.out.println("Send Email Method");
	}
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		//how to access non-static variable: using object ref name--by creating object of the class--which will be created in heap memory
		// how many photo copies will be created ?
		// two var are there ---in object ,object will never hold any static variable
		// java will create copy of non-static var and will be given to object
		// only one copy of static variable will be stored inside CMA[Common Memory Allocation]/Permanent Generation/Meta Space(JDK 1.8)after
		//Instance variable will take more space
		
		//Accessing Instance variable using object 
		e.name="Tom"; 
		System.out.println(e.name);
		
		//Employee.name---we cannot access instance var using class name
		//name="tom"; ----we cannot directly call intance var
		
		//How to access static variable
		
		//1.Using the class Name //always use this way to access static var
		Employee.age=80;
		System.out.println(Employee.age);
		
		//2. Can access directly without using classname
		//	age=30;
		
		//3. can access using object reference name of the object
	//	e.age=40; //Gives warning ----so never use static var access using object reference name---not recommended
		
		//*****************************//
		
		//How to Access non-static method : Using Object ref name
		e.getEmail();
		
		//How to access static method
		//1. Using class name
		Employee.sendEmail(); 
		
		//2. Calling the method directly
		sendEmail();
		
		
		//3. Calling using object reference name
		e.sendEmail(); //gives warning ---never uses static with object reference name
			
	}

}
