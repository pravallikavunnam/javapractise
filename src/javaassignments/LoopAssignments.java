package javaassignments;

public class LoopAssignments {

	public static void main(String[] args) {
		
		//1. WAP to print following output:
		int i=1;
		for(i=1;i<=5;i++) {
			System.out.println("I am Batman﻿");
		}
		
		System.out.println("-------------");
		
		//2. WAP to print following output:
		int j=1;
		for(j=1;j<=10;j++) {
			System.out.println("I am Batman"+" "+j );
		}
		System.out.println("-------------");
		//3. WAP to print 10 to 1 using for, while and do-while loop
		
		//using for loop
		for(int p=10;p>=1;p--) {
			System.out.println(p);
		}
		System.out.println("-------------");
		//using while loop
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		System.out.println("-------------");
		//using do-while loop
		int h=10;
		do
		{
			System.out.println(h);
			h--;
		}
		while(h>=1);
		System.out.println("-------------");
		//4. Write a program in Java to print "Hello World" ten times using while loop
		int s=1;
		while(s<=10) {
			System.out.println("Hello World");
			s++;
		}
		System.out.println("-------------");
		
		//5.Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop
		//using while loop
		int q=1;
		while(q<=100) {
			if(q%5==0) {
				System.out.println(q);
			}
			q++;
		}
		System.out.println("-------------");
		
		//using for loop
		for (int count=1;count<=100;count++) {
			if(count%5==0) {
				System.out.println(count);
			}
		}
		System.out.println("-------------");
		//using do-While loop
		int pointer=1;
		do {
			if(pointer%5==0) {
				System.out.println(pointer);
			}pointer++;
		}while(pointer<=100);
		System.out.println("-------------");
		//6. Print all odd and even numbers between 1 to 100
		int v=1;
		for(v=1;v<=100;v++) {
			if(v%2==0)
			{
				System.out.println("Even number"+""+ v);
			}else {
				System.out.println("odd number"+" " +v);
			}
		}
//		//7. What will be the output of this program:
//		int i2 = 1;
//		while(i2<=1){
//		System.out.println("Hi Java");
//		}  //infinite loop as there is no Increment/Decrement
		
		//8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
		//using for loop
		char NUM;
		for(NUM='A';NUM<='Z';NUM++) {
			System.out.println(NUM+" "+(int) NUM);
		}
		for(char n='a';n<='z';n++) {
			System.out.println(n+" "+(int)n);
		}
		for(char f='0';f<='9';f++) {
			System.out.println(f+" "+(int)f);
		}
		System.out.println("........................");
		//using while loop
		char s1='a';
		while(s1<='z')
		{
			System.out.println(s1);
			s1++;
		}
		char s2='A';
		while(s2<='Z')
		{
			System.out.println(s2);
			s2++;
		}
		char s3='0';
		while(s3<='9')
		{
			System.out.println(s3);
			s3++;
		}
		
		//9.Print the following series: 
		//1.0 2.0 3.0  ...... 10.0 
		//0 9 18 27 36 …99
		double d=1.0;
		while(d<=10.0)
		{
			System.out.println(d);
			d++;
		}
		float dd=0;
		while(dd<=100)
		{
			if(dd%9==0) {
			System.out.println((int)dd);
			}dd++;
		}
		
		//10.Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		//for
		for(char pc='a';pc<='z';pc++) {
			if(pc=='a')
			{
				System.out.println(pc +" "+"is a vowel");
			} 
			else if(pc=='e') {
				System.out.println(pc +" "+"is a vowel");
			}
			else if(pc=='i') {
				 System.out.println(pc +" "+"is a vowel");
			} else if(pc=='o') {
				System.out.println(pc +" "+"is a vowel");
			} 
			else if (pc=='u') {
				System.out.println(pc +" "+"is a vowel");
			}
		}
		//while loop
		char mn='a';
		while(mn<='z')
		{
			if(mn=='a') {
				System.out.println(mn +" "+"is a vowel");
			} else if(mn=='e') {
				System.out.println(mn +" "+"is a vowel");
			} 
			else if(mn=='i') {
				System.out.println(mn +" "+"is a vowel");
			} else if(mn=='o') {
				System.out.println(mn +" "+"is a vowel");
			} else if(mn=='u') {
				System.out.println(mn +" "+"is a vowel");
			} 
			mn++;
		}
		//11.Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		int mul=1;
		while(mul<=10)
		{
			if(mul%7==0)
			{
				System.out.println(mul);
				System.out.println("Bye,See you tomorrow");
				break;
			}mul++;
		}
		
		
		
		
		
		
		
	}

}
