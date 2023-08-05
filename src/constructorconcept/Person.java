package constructorconcept;

public class Person {
	
	String name;
	static int collegeName;  //store in CMA
	
	//can we create a constructor with static variables ---No 
	//Because static is never part of object 
	//where constructor is directly associated with the object
	//the moment we create object respective constructor will be called
	
	//don't pass unnecessary parameters to the constructor ---in the constructor we always pass class variables with different combinations
	//if we pass the parameter we need to use it 
	public Person(String name) { //so we cannot supply collegeName
		this.name = name;
	//	this.collegeName=collegeName; // it gives warning because it should be accessed in a static way
	}                                 // never supply static data in constructor
	                                  // All the students will get the same collegeName 
	
	//the moment we create the object of the class respective constructor will be called
	
	//In the constructor never use static because static will be common property for everyone;
	
	
	
	
	

}
