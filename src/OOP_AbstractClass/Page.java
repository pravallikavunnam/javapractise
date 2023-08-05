package OOP_AbstractClass;

public abstract class Page {
	
	//We add abstract keyword to make class as abstract in nature
	//Abstract class--we cannot create object of abstract classes
	
	//can we create constructor of the abstract class?----Yes
	public Page() {
		this(5);
		System.out.println("Page class default constructor"); //when it will be called?
	}
	//If no default constructor is available in parent class  ---java won't create default constructor---it should be there
	//If no constructor are there in parent class --then it will check and move back to child and print child class con
	
	//In page class also overloading default constructor  --how to call this constructor?with the help of this keyword
	public Page(int i) {
		System.out.println("Page class constructor"+i); 
	} 
	//1. preference always for default constructor
	//2. Child class parametrized constructor
	//3. Methods
	
	
	//generally constructor will be called when we try to create object of the class
	//As in abstract class we cannot create object of abstract class,so
	//so in Abstract class --abstract class constructor will be called when we try to create child class object
	
	
	
	//what we write in abstract class?
	
	//public void title(); //gives error because whenever we are using abstract methods in abstract class we need to use
	//---abstract keyword in method
	
	//Is it mandatory to have abstract methods in the class --no
	//no abstract methods --0% abstraction
	//all abstract methods ---100% abstraction
	//partial abstraction ---0 to 100% abstraction
	//
	
	public abstract void title();
	public abstract void url();
	
	//we can create non-abstract method in abstract class also
	
	public void defaultPageTimeOut() {
		System.out.println("Page time out is 20 sec");
		
	}
	
	public static void displayFooters() {
		System.out.println("Page will display footers");
		
	}
	
	
	public final void displayLogo() {
		
		System.out.println("Logo----");
	}

}
