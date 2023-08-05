package superKeyword;

public class BMW extends Car {
	
	//Advantage of super keyword : 
	//1.I can access all my parent class properties without creating parent class object in child class
	//2. Can access methods 
	//3. we need to use super keyword inside the method only
	//4. we can use super keyword in the constructor ---but 
	//---while calling the parent class constructor we should use super at the first line in the child class constructor
	//6. we cannot write super keyword and this keyword together
	//7. this keyword is pointing to current class object
	//8. super keyword is pointing to parent class object
	//9. can take properties from grandparents also

	int min_speed=200; //variables cannot be overidden ---this is BMW Variable
	
	public BMW() {
		super();  //we can call only one constructor either default or parameter constructor
		System.out.println("BMW default constructor");
		//here if we want to call same class BMW other constructor we use this keyword
		//here if we want to call parent class car constructors we use super keyword
	}
	//while calling the same class constructor we should use this keyword at the first line in the other class constructor
	
	public BMW(int i) {
		System.out.println("BMW single parameter constructor"+ i);
	}
	
	public void displaySpeed() {
		System.out.println(min_speed); //200 ---BMW Property
		//If we want parent class var also then we use super keyword without creating car class object
		System.out.println(super.min_speed); //100  ---parent class property
			
	}
	
	public void speed() {
		System.out.println("BMW Speed");
		super.speed();
		super.testing();//using super keyword we can access static and non-static properties
		Car.testing(); //but preferred static method calling using classname
	}

}
