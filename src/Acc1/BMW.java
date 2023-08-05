package Acc1;

//Access Modifiers in Same Package with SubClass
public class BMW extends Car{

	public static void main(String[] args) {

		BMW b=new BMW();
		//we can access all car class variables except private variables
//		b.color;  ---default yes
//		b.name;  ---Public yes
//		b.price; ----Protected Yes
//		b.milege//--Private No we cannot access as it is declared as private we cannot access outside the class
		
		

	}

}
