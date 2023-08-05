package javaclasses;

public class FinalKeyword {

	public static void main(String[] args) {
	//2.Usecases---we have two usecases for finla keyword one here and other in Inhertiance we learn
	//1. Final Keyword --Used for constant values --constant value means the value is fixed
		int a=10;
		a=20;
		a=30;
		a=40;
		System.out.println(a);//40 ---the latest value of a is 40
		
		final int days=7;//so we declare final keyword to avoid assigning values again and again
		//days =10;//changing value of days from 7 to 10 which is not correct becuase we have only 7 days for week
		int totalAmount=100*7;
		System.out.println(totalAmount);
		
		//Real time example for final 
		final String title="Login Page";  
		
		final double basePrice=12.22;//Based on base price we do other calculations
		}

}
