package classandobjects;

public class Employee {

	// class---class is a category for all the objects or it is a blueprint
	// We all comes under human category,animals come under animal
	// category....laptops coming from laptop catgeory
	
	// Object --it is a kind of physical entity created from class(Category)
	// for every class we create multiple objects--every object is having its own
	// properties
	// Every employee will be different ,every person will be different
	// classes are called templates

	// these are called class variables / template variables / Global Variables
	String name;
	int age;
	double salary;
	String City;
	

	// Java will create a photo copy of this variables and send one zerox copy to object
	// so the created object will have all the class variables

	public static void main(String[] args) {

		// local variable--because it is created inside main method
		int i = 10;
		
		// we have to create object of the class--using new keyword
		// Employee is classname
		// obj-- name of object or object reference name
		// New is a keyword to create object
		// New Employee is object

		Employee obj = new Employee();

		// what happens when we create an object ---the moment we write Employee obj=new Employee()
		// Immediately one object will be created inside memory.

		// how to define values to local variables---with the help . operator
		obj.name = "Tom";
		obj.age = 20;
		obj.salary = 12.33;
		obj.City = "LA";

		System.out.println(obj.name);
		System.out.println(obj.age);

		// creating other object for same class
		Employee obj1 = new Employee(); // object name cannot be duplicate

		System.out.println(obj1.name);// null ---because we have not defined values for this object
									  // default value of string type will be null
		System.out.println(obj1.age); // default value of int type will be 0
		System.out.println(obj1.salary); // default value of double type will be 0.0
		System.out.println(obj1.City); // default value of string type will be null
		
		//there is no limit in creating number of objects
		//whenever we create an object--Immediately java will take all class variables and gives to each and every created object
		//Local variables copy will not be given to object
		//Objects will hold only those properties which are defined at class level
		
		

	}

}
