package OOP_Abstraction;

//A class cannot have abstract methods
//in the abstract class we can use abstract methods but not in normal class

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical {
	//A class having 4 parents extending one parent class and 3 parent interfaces
	//first we use extends and then implements
	//a child class can have one and only one parent class but can have multiple parent interfaces
	
	//here we get error because all the methods in the USMedical are unimplemented methods
	//so now its FortisHospital class responsibility to implement those methods
	//All the methods from USmedical will be overriden in FortisHospital clas
	
	//we can override methods from Parent class or from parent Interface also
		
	/*--------------------------USMedical Interface Methods -------------*/
	@Override
	public void physioServices() {
		System.out.println("FH-----physio Services");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH-----cardio Services");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH-----ENT Services");
		
	}

	
	
	//At the same time we can go to UK Medical also ----it will create Diamond
	//one child having multiple parents in Interface
	
	/*--------------------------UKMedical Interface Methods -------------*/
	@Override
	public void orthoServices() {
		
		System.out.println("FH-----ortho Services");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH-----neuro Services");
		
	}

	/*--------------------------IndianMedical Interface Methods -------------*/
	@Override
	public void oncologyServices() {
		
		System.out.println("FH-----oncology Services");
	}

	@Override
	public void dentalServices() {
		System.out.println("FH-----dental Services");
		
	}
	
	@Override
	public void GynoServices() {
		System.out.println("FH-----Gyno Services");
		
	}
	

	/*--------------------------FortisHospital Class Individual  Methods -------------*/
	
	public void medicalTraining() {
		System.out.println("FH-----medicalTraining");
		
	}
	
	public void medicalInsurance() {
		System.out.println("FH-----medicalInsurance");
		
	}
	
	/*--------------------------Common Method in all Interfaces-------------*/
	
	//we can have common methods in multiple Interfaces

	@Override
	public void emergencyServices() {
		
		System.out.println("FH-----emergencyServices");
	}

	/*--------------------------USMedical Interface Methods with parameter -------------*/
	
	@Override
	public void test(int a) {
		
		
	}

	@Override
	public String get(int a) {
		return null;
	}

	@Override
	public String get(int a, int b) {
		return null;
	}
	
	//Abstract methods implementation is done by class where instructions are given by Interface
	/*--------------------------WHO Interface Methods -------------*/
	
	@Override
	public void covidVaccination() {
		System.out.println("Covid Vaccine is Available");
		
	}
	
	/*--------------------------UN Interface Methods -------------*/

	@Override
	public void medicalNews() {
		// TODO Auto-generated method stub
		
	}
	
	
	//Single Interface can be child of Multiple Interfaces
	//Single Interface can extend Multiple Interfaces
	
	
	//default is a special keyword designed for Interface so gives error
	//so changing to public 
//	default void billing() {
	@Override                    //we can override default method in child class
	public void billing() {
		System.out.println("USMedical Billing");
		
	}
	

	
	
	
	
	
	

}
