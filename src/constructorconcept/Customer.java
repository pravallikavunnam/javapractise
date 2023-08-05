package constructorconcept;

public class Customer {

	//what should we write in constructor?

	//properties of customer class 
	String name;
	int custID;
	String city;
	long phoneNumber;
	
	//create a constructor
	public Customer(String name, int custID, String city, long phoneNumber) {
		
		this.name = name;
		this.custID = custID;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	
	//creating a Function/Method
	public int getSalary(int totalCTC,int bonus) {
		
		return totalCTC+bonus;
	}
	
	//1.what will you write in function ?
	//----whenever we have to write business logic,implementation,feature logic it has to written inside function
	
	//2. what will you write in constructor ---Do you really want to write salary calculation ,CTC Calculation---
	//bonus calculation inside constructor ---No
	//constructor is helping me to initialize the object and then passing the values
	//Initialize the class variables with the help of this keyword
	
	//if we write complex business scenarios in constructor----we cannot return anything from constructor 
	
	

	

}
