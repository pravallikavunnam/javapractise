package superKeyword;

public class TestCar {

	public static void main(String[] args) {
		
		//creating BMW Object
		BMW b=new BMW();
	//	System.out.println(b.min_speed); //200 Child class value get printed
		//if variable commneted in BMW Class
	//	System.out.println(b.min_speed); //100 will be printed takes parent class inherited variable 
		
		b.displaySpeed(); //calling the method 
		
		b.speed(); //bmw method is called
		
	
		
		
		
	}

}
