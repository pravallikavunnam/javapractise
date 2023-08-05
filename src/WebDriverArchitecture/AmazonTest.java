package WebDriverArchitecture;

public class AmazonTest {

	public static void main(String[] args) {

		//Can i create object of WebDriver --no because it is interface
		
		//can we create object of ChromeDriver ---Yes ,because it is class
		
//	ChromeDriver driver=new ChromeDriver();//As soon as we create object default constructor will be called ,if it is available
										//If not java will create a default constructor internally
		
//	FireFoxDriver driver=new FireFoxDriver();  ---with these approach we can work on only required browser each time
	                                           //which is not a correct approach
		//SafariDriver driver=new SafariDriver();
		//So we create  a browser variable
		   //initialize the driver points to null ,when case is satisfied driver will be req driver 
										//if no case satisfied driver won't get initialized it will be same default null
		String browserName ="opera";   //we are giving this browserName from excel file or xml file/config file
		WebDriver driver=null;
		//write cross browser logic
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Pravallika\\Downloads\\Cdriver\\chromedriver.exe");
			driver=new ChromeDriver();  //this is Top Casting/Up Casting
			System.out.println("Chrome driver launched");
			break;
		case "firefox":
			driver=new FireFoxDriver();
			System.out.println("firefox driver launched");
			break;
		case "safari":
			driver=new SafariDriver();
			System.out.println("safari driver launched");
			break;

		default:
			System.out.println("Please pass the right browser");
			break;
		}
			driver.findElement("Emailid");
			driver.sendKeys();
			driver.click();
			driver.quit();
	
	//can we use child class reference variable for FirefOx class--No ,because this refernce is for ChromeDriver Class
	
//	FireFoxDriver driver1=new FireFoxDriver();
//	driver1.findElement("Password");
//	driver1.sendKeys();
//	driver1.click();
//	driver1.quit();
//	
	//tomorow if we have 5 browsers are we going to write 5 drivers and same repetitive code ?
	//so we do comment // ChromeDriver driver=new ChromeDriver(); craete object for firefox and use methods forFirefox also 
	
	
	
	
	
	
	
	
	
	}

}
