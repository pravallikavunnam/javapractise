package BuilderPattern;

public class ShopTestBuilderPattern {

	public static void main(String[] args) {
		
		//first flow we created on first day
		Shopping shop=new Shopping();//creating object of shopping class
		shop.login();
	//	shop.login("naveen", "123"); //return current class object --Adv is we can create chain of methods
		shop.login("naveen", "123") //returning this keyword which means return current class object
				.search("MacBook Pro")
					.addToCart("Macbook pro")
					     .doPayment("8799877676@ybl")
					     		.generateOrder()
					     			.logout();
		
		
		
		//Second flow we created on  day
		shop.login("naveen", "123") //returning this keyword which means return current class object
		.search("MacBook Pro")
			.search("Tshirt", 1000)
			     .addToCart("Tshirt")
			     	.logout();
		
		//third flow we created on  day
		shop.login("naveen", "123")
			.search("Redmi 6")
				.search("Redmi 7")
					.search("Redmi 8")
						.addToCart("Redmi 7")
							.doPayment("123455666666", 334)
									.generateOrder()
										.logout();
		//Fourth flow
		shop.login("naveen", "123")
			.addToCart("Tshirt")
				.logout();
		
		//Fifth flow
		shop.login("naveen", "123")
			.logout();		
		
		
		
		
					  
	}

}
