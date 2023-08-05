package javaclasses;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		int a[] = new int[5];// array got created 
		a[0] = 10; // 4 values got added
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		System.out.println(a[3]);//40;
	//	System.out.println(a[5]);//0-after declaring array and creating memory if won't assign value
		                         //default value of int will be 0 always in the memory ie..
		                     //for all primitive data types default value will be 0 it cannot be null if value not assigned
		//In normal array we use new keyword to declare array
		//In normal array we are not aware of how many values we want to store
		
		//Array literals are Static Array only
		//when we know how many values we want to store or when we already know values we can directly initialize 
		//in curly braces with comma seperated and start filling values without using new keyword
		
		int p[]= {10,20,30,40}; //declaration of array literals
		//li=0  ,hi=3 ,p.length=4//we cannot go beyond length so array literals are static arrays only
		
		//Double
		double d[]= {12.33,4.5,7.8};
		System.out.println(Arrays.toString(d));//Print all values of double array
		for(double e:d) {
			System.out.println(e);//print all values of double array using for each loop
		}
		
		//Char
		char c[]= {'a','b','c'};
		System.out.println(Arrays.toString(c));//Print all values of char array
		for(char e:c) {
			System.out.println(e); //print all values of char array using for each loop
		}
		
		//String
		String s[]= {"Pravallika","Pandu","Eshpa"};
		System.out.println(Arrays.toString(s));//Print all values of String array
		
		for(String e:s)
		{
			System.out.println(e);//print all values of String array using for each loop
		}
		
		//Object
		Object studentMarks[]= {"Rose",20,'A',"English"};
		System.out.println(Arrays.toString(studentMarks));//Print all values of Object array
		
		for(Object e:studentMarks) {
			System.out.println(e); //print all values of Object array using for each loop
		}
	}

}
