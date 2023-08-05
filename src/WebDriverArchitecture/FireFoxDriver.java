package WebDriverArchitecture;

//Advantage of interface is we create one more class firefox
//because WebDriver has no idea how those methods work on FireFox Driver ---fully bastraction
//let the FireFox Driver decide how these methods work according to firefox


public class FireFoxDriver implements WebDriver{
	
	public FireFoxDriver() {
		System.out.println("FireFoxDriver started successfully");
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
