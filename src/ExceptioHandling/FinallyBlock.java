package ExceptioHandling;

public class FinallyBlock {
	
	//Finally block ---means exception is coming or not finally block will always be executed
	//finally block should be written with try n catch block only
	//without try n catch we cannot write finally block

	public static void main(String[] args) {
		
		
		
		System.out.println("ABC");
		try {
		int i=9/0;  //
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("ae is coming");
//			e.printStackTrace();
//		}
		finally {
			System.out.println("I am in final block");
		}
		//we can write try block without catch block ---with the help of finally block
		//we cannot write a catch block without try block having finally block
		//we cannot write finally block without try block
		//we cannot write finally inside catch block
		//we cannot write finally before try n catch block
		//always finally block should be after try n catch block
		//we can write finally inside finally with one more try n catch blocks
		

	}

}
