package ExceptioHandling;

public class Browser {

	public static void main(String[] args) {
		
		String name="chrome";
		
		if(name.equals("chinnu"))
		{
			System.out.println("launch chrome");
			
		}
		else
		{
			System.out.println("Browser not found");
			throw new FrameworkException("BROWSERNOTFOUND"); //Throw own custom exception with custom message
			//we are going to use custom exception in
			//1. Negative condition
			//2. inside else part
			//3. inside default switch case
			//4. data is null
			//in these cases we can throw our own custom exception --so it will immediately terminate and go further 
			//--------------------------------------
			//if name is not equal to chrome also it will come to else part and ask to enter url without browser which is an exception
			//so java cannot provide exception for each and every line
			//we can provide our own exception
			//java says create custom exception class and attach with runtime exception
			//create child of runtime exception
		}

		System.out.println("Enter the URL");
	}

}



//Exceptions are divided into two parts
//1. Checked Exception and 2 . Un-Checked Exception    ---or
//Compile Time Exception or Runtime Exception
//Runtime Exception and it's subclasses ,error and it'sub classes are Un-checked exceptions
//rest all other exceptions are Checked Exceptions
//Un-Checked exceptions are those which compiler cannot identify at compile time --which are caught at runtime-so these are RuntimeException
//Checked exceptions---exceptions caught at compile time  ----so these are ComplieTime Exception









