package BuilderPattern;

public class Shopping {
	
	
	//for all the methods we are returning current class object
	//so everytime when each method is called object is created each time in Heap Memory--so to avoid this we use return this
	
	public Shopping login(){
		System.out.println("User is logged in");
	//	return new Shopping();  // return this ---means current class object
		return this;
	}

	//overloaded method
	public Shopping login(String un,String pwd) {
		System.out.println("Login with " + un + ":"+ pwd);
		return this;
	}
	
	
	public Shopping search(String productName) {
		System.out.println("Search product: " + productName);
		return this;
	}
	
	public Shopping search(String productName,int price) {
		System.out.println("Search product: " + productName + ":" + price);
		return this;
	}
	
	public Shopping addToCart(String productName) {
		System.out.println("Add to cart: " + productName);
		return this;
	}
	
	public Shopping doPayment(String cc,int cvv) {
		System.out.println("Make payment: "+ cc +":" + cvv);
		return this;
	}
	
	public Shopping doPayment(String upi) {
		System.out.println("Make payment :" + upi);
		return this;
	}
	
	public Shopping generateOrder() {
		System.out.println("Generating, order id is :" + 1234);
		return this;
	}
	
	public void logout() {
		System.out.println("Logged out done");
	}
	
	
	
	
	
}
