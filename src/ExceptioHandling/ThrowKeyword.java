package ExceptioHandling;

public class ThrowKeyword {

	//ThrowKeyword  : it is used for when we deliberatley want to throw our own exception
	//if browser name is not available ---then we say BrowsernotFoundException
	//java cannot give each and every exception like --excel data not available ---ExcelDataNotFoudException--So we write our own exception
	
	public static void main(String[] args) {
		
		String browser=null;
		if(browser==null) {
			try {
			throw new Exception("NoBrowserException"); //we are just throwing the exception //always exception handled by Try n catch block only
		}
		catch(Exception e) {
			System.out.println("browser not found......please pass the right browser");
			e.printStackTrace();
		}
			
	}
		
	//Throws keyword---always infront of method name
	//Throw keyword----to throw our own custom exception based on condition
	//but actual exception is handled by try n catch block
		
		
		

	}

}
