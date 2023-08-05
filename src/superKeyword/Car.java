package superKeyword;

public class Car extends Vehicle{
	
	int min_speed=100; //methods will be overriden not varaibles --this is car variable
	
	public Car() {
		System.out.println("Car default constructor");
	}
	
	public Car(int i) {
		System.out.println("Car single parameter constructor"+ i);
	}
	
	public void speed() {
		System.out.println("Car Speed");
	}
	
	//use of static methods/Properties with super keyword?
	public static void testing() {
		System.out.println("car ----testing");
	}
	
	
	
}


