package methodcallingconcept;

public class User {

	public void sendMail()
	{
		System.out.println("Send Mail");
	}
	//calling sendMail from getMail Method
	public static void getMail(User u) { //here u=u1 --here u and u1 points for same object..one object can have multiple references
		System.out.println("Get mail");
		
		//1. Create object and call
//		User user=new User(); //the issue is when we call this method each time object will be created
//		user.sendMail();----not preferable
		
		
		//2. using this-----we are calling this method by passing reference is called call by reference
		u.sendMail();
		//u1 we cannot use u1.sendMail because scope of u1 will be upto main method only
		//as we are calling method by passing reference as u1 to u  where u and u1 pointing to same object
		
		
		
		//if we want to call static method readMail method in getMail static method 
		//As both methods are static we can call directly or we can call using classname.methodname
		 
		User.readMail(u); //but readMail method asked you have to give me reference 
							//as getMail has class ref var u so same ref var will be passed to readMail also
		
		
		//if i want to call test method non-static method inside getMail static method
	//	u.test(20);  //to call non0-static methods we have two options
		u.test(20, u);             //1. Either create object of the class
		             //2. Use reference variable if available
	
	}
	
	public static void readMail(User u)  //if this static method readMail also want to call non-static method sendMail--
											//so we use call by reference concept only by passing reference 
	{
		System.out.println("read mail");
		//if we want to call non-static method
		u.sendMail();
		
		
	}
	
	public void test(int i,User u)
	{
		System.out.println(i);
		//if i want to call static method readMail from test method non-static method
		readMail(u); //we can call directly or 
		User.readMail(u); //we can call using classname.method
		
	}
	// Methods are not responsible for creating objects
	// In this case Main method is responsible for creating objects and whenever methods are called ----
	// main method will supply reference which is pointing to some object
	
	public static void main(String[] args) {
		
		User u1=new User();
		//calling static method using classname.methodname 
		User.getMail(u1); 	//calling getMail method by passing reference u1 //call by reference example
							//if we get to call getMail we call using calssname 
							//but getMail method ask you have to give me reference  of user class
							//yes we have refe available ie u1  where u1 will be given to getMail method u so u=u1
							//calling a method by passing reference is ----call by reference
		
		//we pass u1 to u in getMail method
		//if we want to call test method non-static method -for non-static we always create object--
		//As class object already created where ref available
	//	u1.test(10); //calling the test method by passing value //call by value example 
		u1.test(20, u1);
		
	}

}
