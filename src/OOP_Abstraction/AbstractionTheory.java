package OOP_Abstraction;

public class AbstractionTheory {

	//Abstraction : Hiding Implementation
	//the moment i see any method we don't know how it is implemented
	public static void main(String[] args) {
		
		//we have a hospital and open the hospital in different countries
		//1. Fortis Hospital is a class and child of Interfaces (
		//2. Rectangle are Interfaces  -These interfaces are UKMedical,USMedical,IndianMedical,BrazilMedical Interfaces 
		//3. each country has its own rules and regulation to open any center in respective country 
		//--to provide for customer or to patients
		//4. Fortis hospital responsibility to implement all methods of all the Interfaces
		//5. Interfaces never hold any business logic,It will define what kind of business you should have
		//--its responsibility is to provide business logic,they will just define methods ,rules and regulations here
		//6.Those methods should be implemented by Class --class need to provide business logic
		//7. we cannot combine two interfaces --because each interface has its own methods and rules
		//8. Fortis Hospital is always the child of these  multiple Interfaces
		//9. Fortis Hospital can have its own individual methods along with interfaces methods
		//10. if any new methods /Rules added in any of one interface ,,,so all the Interfaces have to update their rules also
		//-----in Fortis Hospital
		//11. Fortis hospital is totally dependent on Interfaces rules but implementation is done by fortis hospital only
		//12. when a class is child of Interfaces we use keyword implements keyword
		//13. one more hospital is coming Max Medical  class in US
		//14. Then this hospital can implement methods from USMedical and its own individual methods
		
		//15. A user can go to fortis hospital and if he is in US he can go to Max Hospital
		//16. patient will not go for interfaces ,always go to classes
		
		//Adding one more Interface WHO which is the parent Interface of UKMedical,USMedical,IndianMedical,BrazilMedical Interfaces 
		
		//Can we create parent and child relationship between Interfaces?Yes using extends keyword
		
		//we use extends keyword  always from Interface to Interface
		
		//who will implement methods available in WHO Interface?
		//----GrandChild responsibility to implement those methods
		
		
		//creating one more Interface --UnitedNation
		//UN also having one method
		//UNMedical is not only extending WHO Interface it is also extending UN Interface
		
		
		
		//creating one more parent class of FortisHospital
		
		
		//Interface cannot have any parent class
		//Interface can have only parent Interface
		
		
		
		//from JDK 1.8  onwards there are two imp things got added to Interface
		
		//1.Now we can have static method with method body(Business logic) in interface
		
		
		//2. Default method which is non-static with method body 
		 //we can override default method in child class by changing it to public 
		

	}

}
