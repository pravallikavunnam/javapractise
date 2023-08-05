package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		//their is BMW is actually a BMW
		BMW b=new BMW(); //one object will be created inside heap memory ----all the properties of BMW will be given
		     
		//Overridden method																//parent properties also will be given
		b.start();//when we have methods which are common in Parent and Child class--preference will be given to Child class method as it is recent one 
			
		//Inherited Method 
		b.stop(); //Car Class method  --we can access parent class properties with child class object reference variable
		
		//Inherited Method
		b.refuel(); //coming from car class
		
		//Individual Method
		b.autoParking();
		
		b.enginee();
		
		BMW.billing(); //Static method calling using classname from child class
	//	Car.billing(); //Static method calling using classname from parent class
		
		//if static method is not available in the child class
		//static method of parent class can be accessed by child class classname
		
		b.power();//Inherited Method but we cannot override as method declared as final
		
		//b.theftSafety();//cannot access sibling methods
		
		//if we want to use Audi class we need to create object
		Audi au=new Audi();
		au.start(); //Overriden method
		au.stop();  //Inherited Method
		au.refuel(); //Inherited Method
		au.theftSafety();  //individual method
		Audi.billing();    //Inherited Method
		au.power();   //Inherited Method
		Audi.ABC();   ////Inherited Method
		
		
		
		
		//Why Overridden Methods : when we want to implement our own business logic but the signature will be same 
		
		System.out.println("------------");
		
		//Create object of parent class
		Car c=new Car();  //their is a car is actually a car
		c.start(); //parent class method will be called
		c.stop();  //parent class method will be called
		c.refuel(); //parent class method will be called
//		c.autoParking(); //It is a method BMW Child Class--parent cannot override from there child  
		c.enginee();
		
		System.out.println("------------");
		
		// ---------------Top Casting-----------------
		
		//Limitation of Top Casting : when child class object is refereed by parent class ref variable --we cannot access
		//-individual methods of child class---this is the restriction---so here referenceType Check will be failed here.
		
		//creating object of BMW but no reference with BMW 
		new BMW();
		//Child class object referred by Parent class reference variable ---this is also called as Top Casting/Up Casting
		Car c1=new BMW();  //every BMW is actually a car  
		c1.start();   //BMW Class start method will be called
		c1.stop();
		c1.refuel();
//		c1.autoParking(); //no connection with car class ---this concept is called as Reference Type check in Top Casting
		// Reference type is mismatch
		//reference type is c1 which is coming from car and there is no connection of autoParking to car class
		//that why java will not give any access to this particular method
		//then why it allows for other methods?
		//because this got inherited from car class and overrided from car class --so for these methods reference type  will be passed
		
		c1.enginee();
		
		//--------------------Down Casting --------------
		
		//can we do down casting : Down casting is allowed at compile time(when you design things)
		//---but at runtime it is not allowed gives ClassCastException
		
		//Down Casting : parent class object can be referred by child class reference variable using down casting
//		BMW b1=(BMW) new Car();   //we get ClassCastException // gives error : every BMW is a car but every car is not BMW
		//so created a car class object and converted that car to BMW
		//forcefully converted car class object to BMW 
		
//		b1.start();  //we get ClassCastException
		
		// this exception will be given at the runtime 
		//at compile time complier will give suggestion
		//Down casting at runtime is not allowed in Java
		//Down casting we never achieve in selenium
		
		
		/*----------------Top Casting with GrandParents-----------------------*/
		
		
		//Child class object referred by Grand parent class reference variable
		Vehicle v=new BMW(); //Every BMW is a vehicle k
//		v.start(); //Cannot access start method ---because car class is child of Vehicle class -where parent class cannot access child class methods
//		v.stop();  //Cannot access stop method ---because car class is child of Vehicle class -where parent class cannot access child class methods
//		v.refuel(); //Cannot access refuel method ---because car class is child of Vehicle class -where parent class cannot access child class methods
//		v.autoParking();  //reference type check says this method is coming from grand child which cannot be accessed by grand parent
		v.enginee(); //reference type check passed //vehicle class method
		
		
		/*----------------Down Casting at compile time with GrandParents-----------------------*/
	//	BMW b2=(BMW) new Vehicle(); //ClassCastException
		//every vehicle converting into BMW is a BMW
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
