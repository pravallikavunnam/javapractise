package constructorconcept;

public class Employee {
	
	//class variables
	String name;
	int age;
	String city;
	//*****Constructor definition
	//1. constructor name should be same as class Name
	//2. constructor cannot return anything,constructor can be never void
	//3. Constructor can be overloaded ---yes its possible ,we can pass parameters to the constructor
	//4. How to call constructor ----we need to create the object of the class and respective constructor will be called
	//who will call constructor ---main method
	
	//this is a constructor --if constructor name matches with class name then it is constructor 
	public Employee() {   //this is a zero parameter constructor  or default constructor
		System.out.println("Default constructor");
	}
	
//	public int Employee() {  //this is function/method but gives warning method has constructor name
//		   return 100;       //ideally same class name and same method name --it is not as per standard so gives warning
//	}
	
	public void Employee() { //this is a void type of function 
		
	}
	
	public void test() { //this is a function
		
		
	}
	
	public Employee(int a) {   // this is a one parameter constructor
		System.out.println(a);
	}
	
	
	public Employee(int a ,String b) {   //this is a two parameter constructor  
		System.out.println(a+b);
	}
	

	public Employee(String a ,int b) {   //this is a two parameter constructor with sequence difference
	}
	
	public static void main(String[] args) {
//		Employee e1=new Employee(); //creating object
//		e1.name="tom"; //supply values for class variables
//		e1.age=20;
//		e1.city="Hyd";
//
//		Employee e2=new Employee();
//		e2.name="Rose";
//		e2.age=50;
//		e2.city="Ban";
//		
//		Employee e3=new Employee();
//		e3.name="Ron";
//		e3.age=40;
//		e3.city="Pune";
//		
		//The issue with above code is
		//1. Quite lengthy
		// tomorrow if we have 10 variables we need to write employee e=new employee also 10 times with each variable
		//2. Anyone can create object of this class  --creating one more object with e4 reference
//		Employee e4=new Employee(); //but not assigning any value ,this object will be created inside heap memory with proper reference e4 in the stack
		
		//3. Not correct way of writing program
 
		//always try to restrict unnecessary object creation,for that purpose we are going to use constructor of the class
		//--constructor-construct the object--help me in order to construct the object
		//constructor name will be same as class name
		
	
		Employee e=new Employee(10,"tom");//after creating object which constructor will be called----default constructor will be called first
		
		//difference between constructor calling and function calling
		//In function calling --we need to write e.methodname/function name 
		//In constructor calling --the moment i create object immediately the respective constructor will be called
		
		
		
	}

}
