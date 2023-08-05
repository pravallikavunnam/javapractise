package inheritance;

public class InheritanceTheory {

	public static void main(String[] args) {
		
		//Inheritance 	: Inherit properties from parent ands grandparents
		//              : Cannot inherit properties from siblings
		//              : parents cannot inherit properties from children /grandChildren

		//vehicle class --->Automobile--->Mechanical-->AeroDynamic--->Physics-->Science
		/* 1. GrandParent class vehicle 
		 * 2. we have a Car class as parent
		 * 3. we have 3 child class BMW Class,Audi Class,Honda Class
		 * 4. The relationship between vehicle and BMW is Grandfather and grandChild relationship
		 * 6. We have another class Truck class  --Truck class cannot become parent of BMW Class
		 * 5. We cannot have multiple parents
		 * 6. child class can have only one parent
		 * 7. Diamond problem in Java is also called as Multiple Inheritance--a class is trying to be the child of multiple parent classes is called Diamond Problem
		 *    which is not allowed in Java in the form of classes
		 *    which is allowed in Java in the form of Interface
		 *    ---Multiple Inheritance is not allowed in Java
		 * 8. Right hierarchy is BMW Class is child of Car Class ,If it is predefined then it cannot be child of other classes
		 * 9. Suppose Car Class has 3 properties --yes child Class BMW can take all parent class Car class Properties
		 * 10. Along with inheriting parent class properties in BMW/Audi /Honda class, BMW Class can have its own properties 
		 * 11. where Car Class cannot take any properties form BMW/Audi/Honda Class
		 * 12. Car can access properties from vehicle Glass
		 * 13. BMW/Audi/Honda Class can access properties from Vehicle class through parent Car class
		 * 14. Methods which are already available in Vehicle class and Car class ---child classes can inherit directly without creating them
		 * 15. like resuablity -create methods inCar class and use in BMW/Audi/Honda Classes if required
		 * 16. BMW/Audi/Honda Classes can take properties from Science class also----
		 *      ----These level of acquiring properties is called as  Multi-Level Inheritance
		 * 17. BMW/Audi/Honda Classes cannot talk to each other/ take properties each other/cannot inherit each others properties 
		 * 18. 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
