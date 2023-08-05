package classandobjects;

public class Testing {

	// if we create 10 methods in the class,how many times main method will be called
	/// ---only once main method Which will be called by JVM
	// in the JVM We have to create the object of class

	// Requirement: WAF
	// Launch browser--Chrome/firefox/Safari/Edge
	// statement ---browser is launched
	// return ---fasle/True---Boolean
	// launchBrowser(browserName(String))

	//here multiple breaks with one return  ----better approach
	public boolean launchBrowser(String browserName) { 
		System.out.println("launching the browser....." + browserName);
		boolean flag = true;
		switch (browserName) {
		case "Chrome":
			System.out.println("launch Chrome");
			break;
			//return true ----we cannot write like this it becomes unreachable code
		case "firefox":
			System.out.println("launch  firefox");
			break;
		case "Edge":
			System.out.println("launch Edge");
			break;
		case "Safari":
			System.out.println("launch Safari");
			break;

		default:
			System.out.println("Please pass correct browser" + browserName); // if we pass wrong URl -we should not get
																				// enter URL
			flag = false; // so we use flag =false so the condition will be false and won't print enter
							// URL
			break;
		}
		return flag;
	}

	// Multiple Returns   ----here we are using multiple returns without break
	public boolean launchBrowserTest(String browserName) {
		System.out.println("Enter browser Name");
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Chrome browser opened");
			return true; // return should be last statement
			// break; //if we write after returns it becomes unreachable code/Dead code
		case "firefox":
			System.out.println("firefox browser opened");
			return true; // the moment case satisfied it will return true and jump to function in main method
		case "safari":
			System.out.println("Edge browser opened");
			return true; 
		case "edge":
			System.out.println("Edge browser opened");
			return true;
		default:
			System.out.println("please pass correct broswer..."+browserName); //if browser is different it will comes 
			//here so return should be false
			return false;
			//break;
		}//return and break cannot be together , because both will end the loop
		//return also ends the case
		//break also ends the case
		//return should be always the last statement
		//can we avoid breaks in switch case statement----yes by using return keyword
		
	}

	public static void main(String[] args) {
		Testing test = new Testing();
		if (test.launchBrowser("Chrome")) {
			System.out.println("Enter the URL");
		}
		System.out.println("-----");
		
		boolean f=test.launchBrowserTest("Chrome");
		System.out.println(f);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
