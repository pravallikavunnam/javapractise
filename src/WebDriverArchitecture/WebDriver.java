package WebDriverArchitecture;

public interface WebDriver {
	
	//Advantage of interface is we create one more class firefox
	
	//WebDriver cannot take any decision
	
	//why webdriver is an Interface?
	//Webdriver cannot take any decision
	//It has no idea how other browsers are working
	//webdriver is like a common interface where all the standard methods to perform user actions on the browser they have defined
	//now class responsibilities to define the methods and use them

	//creating 4 methods
	public void click();
	public void sendKeys();
	public void quit();
	public void findElement(String ele);
	
	
}

//Difference between Abstract class and Interface
//1. Interfaces are supporting 100% abstraction but after JDK 1.8 we can create default and static methods
//2. Interface has no idea about how business logic is implemented
//3. we cannot create constructor for interface
//4. we can create constructor with abstract class
//5. We can create object for Interface 
//6. For abstract class also we cannot create object but abstract class constructor is called when we create object of child class
//7. Can we achieve Multiple Inheritance with abstract classes?----No
//8. We can achieve multiple inheritance with Interface
//9. In Interface variables are final in nature
//10. In the abstract class variables are not final in nature
//11. default methods are allowed only in interfaces not allowed in Abstract classes
//12. A class/Abstract class can implement interface
//13.








