package staticconcept;

public class Car {
	
	
	//Instance variables
	String name; //every car will have different name,engine number,chasis number and Price
	String engineNumber;
	String chasisNumber;
	double price;
	
	//final var will be constant value and we cannot change the value
	//we declare as final because no one can change the wheels value
	//whenever we are declaring a variable as final we need to assign the value
	
	 final static int wheels=4;  //class final static variable
	 
	 //each car will have 4 wheels--so we use static---this will be common property value for all cars
	 //Static var cannot be constant because we can declare again them in the method ---static value will be stored in common memory allocation
	 //CMA --also called as Permanent Generation (Upto JDK 1.7) --Also called as MetaSpace(from JDK 1.8)
	 //Difference between permanent generation and MetaSpace
	 //PG --PG was a static memory--gives memory leakage error when crossed the allocated space
	 //MetaSpace is a dynamic memory---Once allocated memory is reached ---it will automatically takes space from RAM
	 //static is not part of object ---common property value for all the objects
	 //static variable will be always part of class
	
	//Static Method----we go for static methods when creating utilities,or some generic functions
	//1.displaying logo----logo will be common property for all the pages
	//2. Search ,menu,categories ,footer ,getURLHeader sections in  any e-commerce page
	
	public static void displayLogo() { // Static Method
		System.out.println("Display logo");
	}
	
	public void getUrl() { //non-static method
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		//local variable is ---A variable which is within the method not in the class
		//static int i=10;//local variable cannot be static--it is not possible for local var to be static 
		
		//final int i=20; //local variable can be final
		
		Car c1=new Car();
		c1.name="Audi";  
		c1.chasisNumber="abte1276";
	//	c1.wheels=4; //static variable so not required object reference for calling
		
		Car c2=new Car();
		c2.name="Maruti";
		c2.chasisNumber="gtht1645";
	//	c2.wheels=4;
		
		Car c3=new Car();
		c3.name="Benz";
		c3.chasisNumber="pawt3568";
	//	c3.wheels=4;
		
		//Car.wheels=5; //someone can declare wheels as 5  ,which will print wheels as 5 so to avoid this we declare variable as final
		System.out.println(c3.name+" "+c3.engineNumber+" "+c3.chasisNumber+" "+Car.wheels);
		
		
		
		//Static variable example 
		//1. Company name ,Company logo,theme color of facebook
		//2. Excel utility--read data from excel file ---will be static
		//3. Human parts-two hands,two legs and two eyes...........
		//common values means static property
		//non-common value means non-static property
		
		//final keyword --for universal truth
		//1. footer  will be always same 
		//2. some headers ,categories will be always same
		//3. Calendar handling
		
		
	}

}
