package ExceptioHandling;

public class FinallyBlockExample {

	public static void main(String[] args) {
		
		//how to make database connection?
		//1. Establish connection with database by passing username and password,IP Address ,port number
		//2. we hit SQL queries
		//try{
		//3. we get the results after hitting SQL queries  //while getting result we are getting exception TABLENOTFOUND
		//	}
		//catch() { 
		//}
		//here we handled the exception TABLENOTFOUND using try n catch block --but database connection is still open
		//so we write finally block and write database to close otherwise in the backend so much load in the database
		//so use finally block and make the connection close
		//In posistive and negative case we have to close the database to avoid unnecessary load on database
//		finally {
//			//db connection should be closed
//		}
		//4. use the results in our script
		
		

	}

}

//final ---It is used to provide constant value to prevent inheritance and method overriding

//finally --- it is used for try n catch block --finally is block where code written in it is executed if exception comes or not

//finalize---






