package ExceptioHandling;

//creating common exception class---like global exception
public class FrameworkException extends RuntimeException{

	
	public FrameworkException(String mesg ) { //with every exception we can see messg ,so we also give mess for framework exception
		super(mesg);
		//super keyword is used to call parent class constructor
	}
}



//we are going to use custom exception in
//1. Negative condition
//2. inside else part
//3. inside default switch case
//4. data is null
//in these cases we can throw our own custom exception --so it will immediately terminate and go further 