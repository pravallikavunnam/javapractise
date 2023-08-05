package encapsulation;

public class EncapsulationTheory {
	//Encapsulation : Hiding Data Members
	
	//we have a class object ---which is divided into two parts
	//1. public section/attributes /properties of the class
	//2. private attributes of the class  
	
	//some public methods with the help of private keyword  in public section
	//some private variables  with the help of private keyword in private section
	
	
	//we have one user 
	//what all properties we can access from employee class?
	//can we access private properties directly ---No 
	//---because outside the class any user create the object of the class cannot access the private properties
	//public properties can be accessed without any problem
	
	//if we cannot use private properties directly --these public methods can access private properties internally  ---this is called
	//Encapsulation  ---we are not giving direct access to user for private properties but we are giving indirect access through public methods 
	

	//we can have some private methods also in private section
	//and some methods in public section also
	
	//----here also user cannot access private methods directly
	//if really wants to give access of private methods --yes we can do through public layer
	//----will call private method inside public method
	//so now user can call public method if really want to call private method
	//user cannot see actual private variables ,user will always check what is publicly available
	//Example : 1. ATM ---We cannot see how it is giving money,calculation,actual cash......
	//        : 2. Laptop ---i cannot see RAM,Dashboard ..only i can see public layer --press any key interact with laptop
	
	
	
	
	
	
	
	
	
}
