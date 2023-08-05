package ExceptioHandling;

public class ThrowsKeyword {
	//Throws keyword never handle the exception---it will just throw the exception
	
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2()  {
		System.out.println("m2 method");
		try {
		m3();
		}
		catch(ArithmeticException ae) {
			System.out.println("ae is coming");
			ae.printStackTrace();
		}
	}
	//ideally m3 should handle the exception (ICICI bank )but instead handling it is throwing exception---so now m2(Bank) need to handle the exception
	public void m3() throws ArithmeticException {  //if we know the exception name we write here using 
		System.out.println("m3 method");           //m3 method giving exception ,it is throwing the exception ----
		                                           //m2 will hold because m2 is calling m3--------
		int i=9/0;
	}
	//whenever we are getting any exception ---we always need to read exception inf from bottom ---like Stack ie LIFO--
	//-----we call this process as Stack Trace Information---because stack data structure is used internally
	public static void main(String[] args) throws ArithmeticException{
		
		//ThorwsKeyword: It won't handle exceptions ---it will supply exceptions from one method to another method
		ThrowsKeyword obj=new ThrowsKeyword();
		//if all method throws exception ---using try and catch block in main method is not good practice---main method is just to call methods
		//we do business calculations in methods so exception need to be handled in methods only
		//so we cannot handle exception with try n catch block inside main method----No?
//		try {
		obj.m1();
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("ae is coming");
//			ae.printStackTrace();
//			
//		}
		System.out.println("Bye");
		
	}

}
