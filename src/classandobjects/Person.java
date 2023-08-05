package classandobjects;

public class Person {
	
	// Method Overloading --is also called as ---PolyMorphism 
	// when asked Polymorphism in Java --It is method overloading and Method Overriding 
	// Poly + Morphism ---poly means Many ---Morphism means Forms of methods /feature
	// It is compile time polymorphism also called as Static Polymorphism or Static binding
	// Compile time polymorphism is method Overloading
	// Runtime time Polymorphism is method overriding
	//why it is called Compile time polymorphism --the momemt we write p.search we get the list of methods and we call required methods
	//because which method has to be called is already decided at the compile time
	//it won't decide at runtime
	//JVM will compile code from .java to .class --in the.class it is clear which method need be called at compile time
	//Compile time polymorphism is faster when compared to runtime polymorphism
	
	//we cannot create two same methods with same method name,same number of parameters with same data type
	//Method Overloading : Always happens within the same class if you have multiple methods with the following conditions
	//1. with the same methods name
	//2. with the different parameter
	//3. with the different types of parameter
	//4. With the different sequence/order of the parameters
	//5. return does not type matter
	
	public void test() {//0 parameter
		
	}
	
	public void test(int a) { //1 parameter with integer data type
		System.out.println("0 Parameter");
	}
	public void test(String a,int b) { //2 parameters String,int
		
	}
	
	public void test(String a) { // 1 parameter with String Data type
		
	}
	public void test(int a,String b) { //2 parameters int,String
		
	}
	
	//Search
	public void search() {
		
	}
	public void search(String Name) {
		System.out.println("Macbook");
	}
	public void search(String Name,int price) {
		System.out.println("Mi");
	}
	public void search(String Name,int price,String color) {
	}
	
	//Login
	public void login() {
		
	}
	public void login(String un,String pwd) {
		
	}
	public void login(String un,String pwd,String role) {
		
	}
	public void login(int phone,int OTP) {
		
	}
	//Payment
	public void doPayment(String cc,int cvv) {
		
	}	
	public void doPayment(String upi) {
		
	}
	public void doPayment(String cc,int cvv,int OTP) {
		
	}
	
	//UberBooking
	
	public void carBooking(String stPoint,String enPoint) {
		
	}
	public void carBooking(String stPoint,String enPoint,String carType) {
		
	}
	public void carBooking(String stPoint,String enPoint,String carType,int numberOfPassengers) { 
		
	}
	//we can define 255 parameters for a particular methods
	
	
	public void pop(Integer a) { //Integer is class which is no-primitive type
		System.out.println("hi"); //here we use call by reference/pass by reference
	}
	public int pop(int a) { //int is primitive data types
		System.out.println("Bye"); //we use call by value
		return 100; //when we call this method and want to see what it is returning we need to store it in a var and then print it
	}
	public static void main(String[] args) {
		
		//how to call methods ---create object
				Person p =new Person();
				p.search("Macbook");
				p.search("mi", 10000);
				
				int u=p.pop(10); //it considers as primitive integer value and goes to pop method with int as parameter
				System.out.println(u+10);            //if we want to call Integer parameter from pop method --we use Call by reference /Pass by Reference
				
				
		//why are we overloading all the methods?Advantages of Method overloading
		//	1. Readability ----In future we can know easily in which method we can fix the code or bug
		//  2. Maintenance will be easy----in future if we want to add any feature we can go to particular method and update 
				//without this approach then we need to use many if-else condition and switch conditions
		//  3. Usability(User point of view who is calling this methods)---
				//p.search --we can these are varieties of search I can perform on this application
				
	
	}
	
}
	//Real time use cases of Method Overloading
	//1. Search feature should be overloaded
	//2. Login feature
	//3. Payment feature
	//4. Car Booking feature
	//5. Add to cart



	//1.Method Overloading is a part of Polymorphism.object oriented programming concept.
	//2.It is also called as compile time or static binding polymorphism.
	//3.Method Overloading will happen always within the same class when we have n number of methods.the condition like 
	//1-- with the same methods name
	//2-- with the different parameter
	//3-- with the different types of parameter
	//4-- With the different sequence/order of the parameters
	//5-- return does not type matter

	//why it is called Compile time polymorphism
 	//because complier is already aware of it ,when we call it which method has to be called--am looking for booking methods
	//So java will get less burden at the runtime ,immediately it will be calling ,it is already predefined which method we call





