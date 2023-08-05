package WebDriverArchitecture;

public class ChromeDriver implements WebDriver{
	
	//We don't have any individual methods of chromeDriver 
	//Chromdedriver is always dependent on Webdriver interface
	//and always follow webdriver interface,let interface instruct /decide which kind of method we should have
	//Selenium guys also not created any respective individual methods in specific driver classes
	//Adv:1.methods should be common for all the browsers ---this is the design
	//2.Launch all the browsers together --top casting will help to achieve parallel execution in TestNG
	
	
	
	
	//Now ChromeDriver has to implement all the methods of WebDriver class 
	//because WebDriver has no idea how those methods work on ChromDriver 
	//let the ChromeDriver decide how these methods work
	
	
	
	public ChromeDriver() {
		System.out.println("ChromeDriver started successfully");
	}

	@Override
	public void click() {
		
		System.out.println("Click on Element");
	}

	@Override
	public void sendKeys() {
		
		System.out.println("Sending keys to element");
	}

	@Override
	public void quit() {

		System.out.println("quit the browser");
		
	}

	@Override
	public void findElement(String ele) {
		System.out.println("find the element:" + ele);
		
	}

	
}
