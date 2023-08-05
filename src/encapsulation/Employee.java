package encapsulation;

public class Employee {

	// private class/instance variables
	//what is the use of private variables--we are not giving direct access --if really want to set we access using public layer
	private String name;
	private int age;
	private double salary;
	private int amount;   //for this var not created any setter method ,instead we create only getter method
	
	
	private void calShareAmount(int fee) {//making this method also private so we cannot access this method directly--we can pass parameter also
		int i=10;
		//int fee=20;
		amount=i+fee; //we are using amount var
		
	}
	public int getAmount(int fee) { //user can call this method only because he has no idea about calShareAmount() method where logic is written
		                     //only getAmount method will be visible publicly
		calShareAmount(fee);  //calling calShareAmount method in getAmount method to access private calShareAmount() method outside the class
		return amount;
	}
	
	//we cannot access set amount method as we have not created that method for amount var
	//then who will create set amount method?---we create below method calSahreAmount
	
	
	
	// so if we have 10 private var --we have to create 5 getter and 5 setter
	// methods which will become lengthy
	// so we can generate setter and getter automatically ---Right
	// click->Source->Getting setters and getters
	
	//without setting the values if we try to get the values we get default values null for string ,o for int ,0.0 for double in the console

	// it is not mandatory to create getter and setter methods always
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// i have to create getter and setter public methods
	// for every private variable we have to create one getter and one setter
	// methods
	// ---if we have 3 private var --we have to create 3 getter and 3 setter methods

	// i have to test the value
//	public void setName(String name) {  //set the value
//		this.name=name;//when we want to supply local variable to global variable does not matter using in a method or constructor we always use this keyword
//		
//	}
//	
//	//this method says give name ---set name method called in employeetest class ---tom will be given to local var --then to class var---
//    //now tom is initilazied---but still cannot access name ---so create a getName method
//	
//	//getName will return name
//	public String getName() { //get the value
//		return name;
//		
//	}

}
