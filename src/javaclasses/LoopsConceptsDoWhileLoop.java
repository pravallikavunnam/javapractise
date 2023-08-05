package javaclasses;

public class LoopsConceptsDoWhileLoop {

	public static void main(String[] args) {
		//In do while loop-start the loop ,and immedaitely execute statement and checking the condition
		//If condition is true check the statement ,if condition is false comes out of loop
		//in the do while atlease once statement will be executed before checking condition ----
		//this is the difference between while and do while loop
		//in the do while loop we write statements/body in the do loop,and condition out of the loop
		
		//Print 1 to 10 using do while loop
		int i=1;
		do {
			System.out.println(i);//print the value of without checking the condition
			i++;
			
		} while (i<=10);
		
		int s=15;
		do {
			System.out.println(s);//print the value of without checking the condition
			s++;
			
		} while (s<=10);
		
		int g=1;
		do {
			g++;                  //Increase the value by 1
			System.out.println(g);//print the value of without checking the condition
		
		} while (g<=10);//2 3 4 5 6 7 8 9 10 11
		
		int h=1;
		do {
			h++;                  //Increase the value by 1
			System.out.println(h);//print the value of without checking the condition
			h++;
		
		} while (h<=10);//2 4 6 8 10
		
		//Uses cases for do while
		//1.Element is present on the page ------if present no need to come inside the loop and check the loop
		//2. In the dropdown default value will be there----which taking time to select---
		
		int b=1;
		do {
			System.out.println(b);//print the value of without checking the condition
				if (b==5) {
					System.out.println("Hi");
					break;
				}
			b++; 
		} while (b<=10); // 1 2 
		
		//Print even numbers
	
		
		
	}

}
