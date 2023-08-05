package javaassignments;

public class DataTypesAssignments
{
	

	public static void main(String[] args) 
	{
		// 1. Write a Java program to add two strings:
		String s1="Hello";
		String s2="Pravallika";
		System.out.println(s1+s2);
		
		//2.Write a Java program to print the sum of two numbers.
		byte number1=74;
		byte number2=36;
		int sum=number1+number2;
		System.out.println(sum);
		
		//3.Write a Java program to print the division of two numbers.
		int k=50/3;
		System.out.println(k);
		
		
		//4.Write a Java program to compute the specified expressions and print the output. Go to the editor
		//Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
		double data=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(data);
		
		//5.Try to concat "Hello Selenium" with a character 't'.
		String string=" Hello Selenium";
		char ch='t';
		System.out.println(string+ch);
		
		//6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
        //"Your Total amount is. 3700".
		int i=100;
		int j=200;
		int k1=3400;
		int l=i+j+k1;
		System.out.println("Your Total amount is."+ " " +l);
		
		//7.Print the ASCII value of the character 'h'.
		char c1='h';
		System.out.println((int)'h');
		
		//8.Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
		char d1='d';
		int num=d1+3;
		System.out.println((char)num);//g	
		
		//9. Write a program to find the square of the number 3.9.
		float f=3.9f;
		float square=f*f;
		System.out.println("Square of the number "+ f + "is" + square);
		
		
		
		
	}

}


