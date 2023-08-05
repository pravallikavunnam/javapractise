package javaPrograms;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		int num=12345;
		
		//using Algorithm
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse of interger :" +rev);
		
		
		
		//Using String Buffer Class
		int num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		
		
		
		
	}
	
	

}
