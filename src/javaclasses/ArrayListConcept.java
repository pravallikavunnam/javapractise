package javaclasses;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// Array List : It is in-built class available in Java which behaves like
		// dynamic array and which is Index based array.
		// Dynamic array -where size not fixed and no need to worry about size of
		// array...
		// we can add more and more elements to array which automatically grows...
		// if you deleted elements from array it automatically shinkes
		// ArrayList is commonly used in selenium also like getting all
		// images,categories,footer sections..
		// dropdown,capture all elements

		// Create object of ArrayList class using new keyword.
		ArrayList ar = new ArrayList(); // Raw type Arraylist --which means we can add any type of data in this
										// arraylist
		ar.add(100); // 0 add method
		ar.add(200); // 1
		ar.add(300); // 2
		ar.add(400); // 3
		System.out.println(ar.size());// 4 // In normal array we use .length variable to get size of an array ..,
		// here we use .size() to get current size of an array

		ar.add(500);// 4
		ar.add(600);// 5
		System.out.println(ar.size());// 6 //if we add more and more values size is getting increased
										// where we didn't declare array size initially like normal array
		ar.add("Pravallika");// 6
		ar.add(12.33);// 7
		ar.add('C');// 8
		System.out.println(ar.size()); // we overcome limitations of static array
		System.out.println(ar.get(0));// with get() method we get the value of Index

		// System.out.println(ar.get(-1)); //IOB--Index out of bound Exception --if we
		// try to get negative index
		// System.out.println(ar.get(9)); //IOB--Index out of bound Exception --
		// if we try to get out of index without adding values for that index

		// yellow warnings because it is asking which type of data you want to add .ie
		// we need to provide generics in arraylist
		// we want to tell which type of data we want

		// As ArrayList class is already available in Java we cannot use it as ArrayList
		// classname
		// Integer data in ArrayList
		ArrayList markssList = new ArrayList(); // raw type ArrayList

		ArrayList<Integer> marksList = new ArrayList<Integer>(); // Integer type ArrayList
		// vc=10,pc=0
		marksList.add(100);
		// marksList.add(12.33);// now we cannot add other than Interger because we
		// declared Integer Arraylist..
		// only in raw arraylist we can add any type of data
		marksList.add(200);
		marksList.add(300);

		// Double type ArrayList
		ArrayList<Double> d=new ArrayList<Double>();//what ever we are writing in <> are classes so always starts with Caps
		d.add(12.33);
		
		//If we want to add different data types of data then we go for Object ArrayList
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Pravallika");
		empData.add(32);
		empData.add(30000.435);
		empData.add('F');
		empData.add(true);

		//String type ArrayList
		ArrayList<String> monthList=new ArrayList<String>();
		monthList.add("jan");
		monthList.add("feb");
		monthList.add("Mar");
		
		
		//50 products in Sep
		//Nov-1000---5000 we go for ArrayList
		
		
		
	}

}
