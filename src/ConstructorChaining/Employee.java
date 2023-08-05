package ConstructorChaining;

public class Employee {

	// Variables
	String name;
	int age;
	double salary;

	public Employee() { // default constructor
		this("kapil",20); //whenever we want to call one constructor from other constructor it should be the first statement

	}
	//constructor chaining is possible in Java using this keyword where this should be the first statement

	public Employee(String name,int age) {
		this(name,age,90.0);
		this.name = name;
		this.age=age;
		//this.name = "Mitaj";
		//this.age=35;
		
	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		Employee e=new Employee(); //as soon as object is created if default constructor is available it is called 
		System.out.println(e.age);
		System.out.println(e.name);
		System.out.println(e.salary);
		
	}
}
