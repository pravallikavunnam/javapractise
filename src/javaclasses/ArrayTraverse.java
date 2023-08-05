package javaclasses;

import java.util.Arrays;

public class ArrayTraverse {

	public static void main(String[] args) {
		int a[] = new int[4];// array got created
		a[0] = 10; // 4 values got added
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		// Arrays is a class available in Java
		// -----------To print values of an array without using for lopp----------------
		System.out.println(Arrays.toString(a));

		// Arrays.toSring()---will print all the values of an array

//		System.out.println(a);//can we print a directly----it gives some random garbage value--which is memory address of 
		// declared array

		// ----To print values of an array using for loop----------------
		// To iterate an array using for loop
		// Indexed Based loop
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			if (a[i] == 30) {
				System.out.println("Hi");
				break;
			}
		}

		// For each loop/Enhanced loop
		// int array using for each loop
		for (int e : a) {
			System.out.println(e);
			if (e == 30) {
				System.out.println("Bye");
				break;
			}
		}

		// short array using for each loop
		short sa[] = new short[4];
		sa[0] = 100;
		sa[1] = 200;
		sa[2] = 300;
		sa[3] = 400;
		for (short e : sa) {
			System.out.println(e);
		}

		// String Array using for each loop
		String s[] = new String[5];
		s[0] = "Chromee";
		s[1] = "Firefox";
		s[2] = "Safari";
		s[3] = "Edge";
		s[4] = "Opera";
		for (String e : s) {
			System.out.println(e);
			if (e.equals("Safari")) {
				System.out.println("Print Safari");
				break;
			}
		}

		// If we want to store different data types in single array like name,salary
		// ,age,gender we go for Object Array
		// Object Array----Object is an class which already exists in java.
		// It has the property to hold any data type.
		// Object array is also static array because here also we cannot go beyond
		// declared array size
		Object o[] = new Object[5];
		o[0] = "Pravallika";
		o[1] = 20000.34;
		o[2] = 32;
		o[3] = 'F';
		o[4] = "Tester";
		// Printing object array values using for each loop
		int count = 0;
		for (Object e : o) {
			System.out.println(count + "=" + e);
			count++;
		}
		System.out.println("----------------");
		//Disadvantage of for each loop---reverse order 
		
		//Printing Object array values in reverse order using for each loop 
		int pointer=4;
		for(Object e:o) {
			System.out.println(pointer +"="+e);//----pending--- //we can do it collections--like arraylist
			pointer--;
		}
		
		// Printing Object array values using for loop
		for(int z = 0; z < o.length; z++) {
			System.out.println(z+"="+o[z]);
		}
		//Printing Object array values in reverse order using indexed loop
		for(int h=o.length-1;h>=0;h-- ) {
			System.out.println(h+"="+o[h]);
		}
	}

}
