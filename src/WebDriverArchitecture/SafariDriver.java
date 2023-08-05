package WebDriverArchitecture;

public class SafariDriver implements WebDriver {
	
	public SafariDriver() {
		System.out.println("SafariDriver started successfully");
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
