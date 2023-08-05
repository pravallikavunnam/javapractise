package OOP_Abstraction;

public class TestHospital {

	//https://www.screencast.com/t/nndspkdvsCbj
	//https://www.screencast.com/t/rFZXt4fS
	public static void main(String[] args) {
		
		//creating object of fortis hospital
		
		FortisHospital fh=new FortisHospital(); //we can call any method available in FortisHospital class 
																	//(Overriden or individual method)
		fh.physioServices(); 	// Overriden method from USMedical
		fh.cardioServices(); 	// Overriden method from USMedical
		fh.neuroServices();  	// Overriden method from UKMedical
		fh.emergencyServices(); // Overriden common method from USMedical,UKMedicaland IndianMedical
		fh.dentalServices();    // Overriden method from IndianMedical
		fh.medicalInsurance();  // Fortis Hospital Individual method 
		fh.medicalTraining();   // Fortis Hospital Individual method 
		
		//------------------Calling Static Variable---------------------
		
		//calling USMedical variable
		System.out.println(USMedical.min_fee); // as variable is static we called with Interface name
		System.out.println(FortisHospital.min_fee); //we can call with child class name also
		
		//if we try to change Interface variable
		
	//	FortisHospital.min_fee=100; //if we try to change the value of variable
		
		//Interface variables are by default final in nature
		//if it is not static then we need to create object of Interface 
		
		//------------------Calling Static Method---------------------
		
		USMedical.USMedPharmcy(); //calling static method fROM USMedical Interface using interface name
	//	FortisHospital.USMedPharmcy();//we cannot call static method with child class classname
		
		
		//Static variables are allowed to call by using child class classname but not static method
		
		//------------------Calling default Method---------------------
		
		fh.billing(); //calling Inherited method default method as it is non-static method we can access using object ref var
		
		
		
		
		
		
		
		
		
		
		
		//we cannot create object for Interface
		//but why: In java we cannot create object of Interface
		//Implementation is done always at class level ,it is not at Interface level
		//so,if we allow to create object of Interface they will create object and try to call this methods 
		//----where there is no business logic in methods of interface 
		// ---so no use of creating object of interface when no implementation
		//like we never create an object for WebDriver as WebDriver is also an Interface
		
		//	USMedical us=new USMedical(); // cannot create object of Interface
	
		//------------------Top Casting---------------------
		
		//Top casting is allowed
		//child class object(new FortisHospital()) can be referred by parent interface reference variable(us)
		USMedical us=new FortisHospital(); //we cannot create object of Interface but we can create reference of Interface
		 
		//all the methods will be given like Overriden ,Individual and common methods
		
		//with the help of us i can access USMedical Methods
		
		//can access only those methods which are coming from top casting interface only
		us.physioServices();  // USMedical Interface Methods ,reference type check will be passed
		us.cardioServices();  // USMedical Interface Methods ,reference type check will be passed
		us.ENTServices();     // USMedical Interface Methods, reference type check will be passed
		
		//cannot access methods coming from other Interfaces
	//  us.orthoServices();   // UKMedical Interface Methods , reference type check will be failed
	//	us.gynoService();       // IndianMedical Interface Methods , reference type check will be failed
		
		
		us.emergencyServices(); //common method , reference type check will be passed
	
		//parent Interface cannot access child class method
		//	us.medicalTraining(); //FortisHospital Individual method , reference type check will be failed
		
		
		//Limitation : No access for other Interface methods and Individual methods of class
		
		
		//------------------Down Casting---------------------
		
		//can we do Down Casting at compile time --No we cannot create object of Interface so at compile time itself we get error
	   //FortisHospital fh1=new USMedical();  
		
		
		
		
		//In interface we cannot create constructor
		
		//can  Interface be final ---No ,because someone need to implement business logic/Rule somewhere for this methods
		
		//can we have abstract method final ----No,if it final then who will override those methods
		
		
		// private methods in interface are not allowed---because private methods cannot be overridden 
		//----where abstract methods should be overridden
		
		
		//Interface cannot be Static
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
