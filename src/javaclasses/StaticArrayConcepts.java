package javaclasses;

public class StaticArrayConcepts {

	public static void main(String[] args) {
		int i=10;
		i=20;
		i=30;
		System.out.println(i);//gives latest value of i
		//for array variable we write [] ie..int k[]
		//lowest index value is always :li=0
		//Highest index value is always :hi=length-1
		//if we want four integer value in same variable  we declare an array variable
		//there are two types of decalring array variable
		
		//1. using new keyword---int array
		
		int k[]=new int[4]; ////if we want four integer value in same variable  we declare an array variable
		//li=0  ,hi=length-1=4-1=3--------hi=3
		//range of above array is 0-3
		//size -16 bytes it is taking -->4 bytes ,4 bytes ,4 bytes ,4 bytes ---four segments
		//filling the values for array
//		k[-1]=60; //gives error ArrayIndexOutofBoundException---because we don't have any negative index in java
		          //runtime error  
		k[0]=10;  //0
		k[1]=20;  //1
		k[2]=30;  //2
		k[3]=40;  //3
//		k[4]=50;  //gives error ArrayIndexOutofBoundException---because array size is going beyond size---
		          //runtime error   
		System.out.println(k[0]); //10
		System.out.println(k[3]); //40
//		System.out.println(k[4]); //AIOB
		//1.this is the major limitation of array we can't go beyond given size
		//Static Array :A static array are those which are having always fixed size.
		//Once it is declared we cannot go beyond the length of an array
		//2. Limitation
		//Here i cannot store other datatypes ,,ie..if it is integer i can store only integer
		//to avoid limitation of static array we go for dynamic array we we can increase size as per requirement 
		
		//Real time usecases of static array
		//1. Month Array
		//2. No of days in the month
		//3. Flights tickets -we cannot go beyond seats available
		//4. Bus booking
		//5. Movie booking
		
		//Double Array declaration
		double da[]=new double[3];
		da[0]=12.12;
		da[1]=34.23;
		da[2]=11.10;
		
		//char Array declaration
		char ca[]=new char[2];
		ca[0]='a';
		ca[1]='b';
		
		//String Array declaration
		String sa[]=new String[5];
		sa[0]="Chromee";
		sa[1]="Firefox";
		sa[2]="Safari";
		sa[3]="Edge";
		sa[4]="Edge";//we can take duplicate values because index will be different
		System.out.println(sa[3]);
		System.out.println(sa[4]);
		
	}

}
