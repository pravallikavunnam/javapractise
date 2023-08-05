package ExceptioHandling;

public class Employee {
	
	String name;

	//Exception : some unwanted/abnormal event happened so code got terminated
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			
			Employee e =new Employee();
		e=null;
			System.out.println(e.name); //NPE
		int i=9/0; //exception is thrown after reaching this line ---ArithmeticException: / by zero(message)
		System.out.println("Hello"); //it is not good practice to write code in try block
		System.out.println("Hello");
		System.out.println("Hello");
		}
//		catch(Exception e) { 
//			System.out.println("some exception is coming"); 
//			e.printStackTrace();  
//							                   
//		}
		//the moment exception is coming it is terminating and not printing the next line
		// so to avoid this we use try and catch block
		//we cannot write try alone-----along with try ,catch block should be there
		//try block will throw the exception -----------catch block will catch the exception
		catch(NullPointerException ae) { //exception name with ref var
			System.out.println("NPE is coming"); //catch block is used for reporting purpose
			ae.printStackTrace();  //printStackTrace is a method which telling exact information about exception	
							                    //like ----why exception is coming ,reason behind exception ------
												//--line number of exception,what is exception name 
		}
		catch(ArithmeticException ae) { 
			System.out.println("ae is coming"); 
			ae.printStackTrace();  
							                   
		}
		catch(Exception e) { 
			System.out.println("some exception is coming"); 
			e.printStackTrace();  
							                   
		}
		catch(Throwable e) { 
			System.out.println("some exception is coming"); 
			e.printStackTrace();  
							                   
		}
		//if we have corresponding exception it will go that exception 
		//always go for immediate catch block
		//if we write Throwable /Exception catch block first ---then next catch blocks will become unreachable --
		//----because any type of exception can be handled by throwable/Exception catch block
		System.out.println("Bye");
		
		//whenever we are not sure how many exceptions we are going to use
		//it's always prefer to use multiple catch blocks 
		//with single try block we can write n number of catch blocks
		//without catch block we cannot write try block  --we can do with finally
		//we cannot write only catch block without try block
		
		
	}

	//Object is the parent class of all the classes in Java  ---But we cannot use it in catch block
	//hierarchy starts from Throwable-Exception--Respective Exception...........
	//Throwable is the parent class of Exception class
	//Throwable class has one more child class is Error class
	//Error and Exception both are different
	//Error -like syntax error or stack overflow error ,fatal error,CPU error,Ram issue
	//Error comes like when system failure,memory issues,hardware or environment issues
	//exception comes because of code written --,Errors are coming because of environment
	//java supports both Error and Exception with the help f throwable
	//try n catch block can be used for both error handling and exception handling
	//In stack over flow error--code is correct but we get error because of no space 
	//In Java Exception is the parent classes of all Exception classes
	//so if we give Exception in catch block --it can handle any type of execution without skipping the next line
	//here we have handled exception using try and catch block and printed the next line without terminating 
	//if we give different exception(NullPointerException) then next line will not get printed
	//catch block will be executed only when the exception is coming
	//the moment the line throws exception, it will jump to catch block ,even if we have thousand lines of code also it never gets executed 
}
