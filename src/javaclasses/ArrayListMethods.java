package javaclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(); // Initially VC=10,PC=0---when no vc is passed default will be
														// taken
		ArrayList<String> ar1 = new ArrayList<String>(5);// we can pass required VC also vc=25,pc=0
															// required vc will be considered when we know how many
															// elements to pass
		// In ArrayList we can add and remove values on the basis of Index and on the
		// basis of values directly
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);// 0
		marks.add(2);// 1
		marks.add(3);// 2
		marks.add(4);// 3

//		marks.remove(1);//remove on the basis of Index
//		System.out.println(marks);

		marks.remove((Object) 3); // if we try to remove on the basis of value we need to pass Object type of
									// value
		// so we need to convert value to object type of value
		System.out.println(marks);

		// ArrayList Literals
		ArrayList<String> browserList = new ArrayList<String>(Arrays.asList("Chrome", "FIREFOX", "Edge"));// vc=7,pc=3
		// pass values in arrays.aslist method
		System.out.println(browserList); // Print all values of ARRAYLIST
		System.out.println(browserList.size()); // Get the size of arraylist
		System.out.println(browserList.get(0)); // get the 0 index value in the arraylist //chrome
		// printing the arraylist values using for each loop
		for (String e : browserList) {
			System.out.println(e);
		}

		ArrayList<String> empList = new ArrayList<String>(Arrays.asList("Tom", "Peter", "ravi", "nv", "sagar"));
		System.out.println(empList); // Print the values of empList ArrayList //Normal list with values
		// if we want to print in reverse order of ArrayList

		Collections.reverse(empList); // we have one reverse method in collection class
		System.out.println(empList); // print the values of ArrayList in reverse order//Reversed List with values

		for (String e : empList) { // print the values of arraylist in reverse order after using reverse()
			System.out.println(e);
		}
		System.out.println("-----------------");
		// Indexed based for loop
		for (int i = empList.size() - 1; i >= 0; i--) {
			System.out.println(empList.get(i)); // .get method is used to fetch values of arraylist by passing i
		}
		System.out.println("-----------------");
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(marksList);
		Collections.reverse(marksList);// Printing number in reverse
		System.out.println(marksList);
		System.out.println("-----------------");

		// Static Array int
		int num[] = { 10, 20, 30, 40, 50 }; // Declaration of static array 
		// Converting from Array to ArrayList
		// Arrays.asList(num); //giving us list of integers so we use List of int []
		List<int[]> numList = Arrays.asList(num); // where int[] is non-primitive data types ..<>in generics we should
													// pass always non-primitive
		// List<int[]>-- will hold all int[] but not array values
		System.out.println(numList.size()); // 1 ---gived the list of number of array as we only one int[] so output
											// will be 1

		// Static Array Integer
		Integer num1[] = { 10, 20, 30, 40, 50 }; // Declaration of static array with the help if Integer Array as we are
											    // using Integer in generics
		// Converting from Array to ArrayList
		// Arrays.asList(num); //giving us list of integers so we use List of int []
		List<Integer> num1List = Arrays.asList(num1); // in generics we should pass always non-primitive or clases //vc=5,pc=5
		System.out.println(num1List.size()); // 5
		
		
		
		// Converted from string array to arraylists
		String browser[] = { "Chrome", "Firefox", "Edge" };// 1. Declaring String static array
		List<String> browserNameList = Arrays.asList(browser);// 2. Declaring String arraylist and passing string static //vc=7,pc=3
																// array to arrays.aslist()
		// 3. Arrays.aslist method returns list of strings so we use List and pass
		// String class as return type in generics
		System.out.println(browserNameList.size()); // 3
		
		System.out.println("--------------");
		//Another way of declaring Array list
		
		ArrayList<String> list=new ArrayList<String>() {
			{
				add("Java");
				add("Python");
				add("c");
				
			}
		};
		System.out.println(list.size());
		list.add("Ruby");
		System.out.println(list.size());
		
		//List is an Interface ---Interface means it has method but no body for method
		//feature added from JDK 1.9
		//Constant List/immutable list----cannot be changed now----no add/remove
		List<Integer> nList=List.of(1,2,3,4,5); //List.of method gives list of Integer type //Dynamic Array
		//ArrayList is an child of List Interface in java
		System.out.println(nList);
		System.out.println(nList.size());
//		nList.add(6); //we get UnSupportedOperationException
	    //when used Lis.of to declare array--size will be always fixed--this type of list are called Immutable List
		System.out.println("------------");
//		System.out.println(nList);
//		nList.remove(1);
		//when used Lis.of to declare array--size will be always fixed--this type of list are called Immutable List 
		//so neither we cannot add nor remove
//		System.out.println(nList); /we get UnSupportedOperationException
		
		ArrayList<String> months=new ArrayList<String>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar"); 
		months.add("April");
		months.add("May");
		months.add("June");//vc=4,pc=6
		months.trimToSize(); //this method change vc to cuurent pc ie now pc=3 so virtual also changes to vc=3
				//vc=6 pc=6 so next vc=pc/2=6/2=3 so next time when we want to add three vc will be available
		//trimtosize will change the size of vc as per pc 
		months.add(0, "Month");
		System.out.println(months);
		months.add("July");
		System.out.println(months);
		
		Collections.swap(months, 0, 1);  //to swap values in arraylist
		System.out.println(months);
		
		Collections.reverse(months); //to reverse arraylist
		System.out.println(months);
		
		List<Object> l=Collections.emptyList(); //other way of creating list
		System.out.println(l);
		
		Collections.sort(months); //to sort values in arraylist
		System.out.println(months);
		
		//print a number ascending and then descending
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,5,7,343,6,74,34));
		
		Collections.sort(numbers); //Ascending Order
		System.out.println(numbers);
		Collections.reverse(numbers);//reverse then will print the values in descending
		System.out.println(numbers);
		
		//Add a value in the middle of the list
//		int n= numbers.size()/2; //get size divide the size by 2 then gets middle index save into n
//		System.out.println(n);
//		numbers.add(n, 400);//add at n index with value
		//	numbers.add(n+1, 400);
//		System.out.println(numbers);
		numbers.set(6,100);  //to change the value atparticular index in arraylis
		System.out.println(numbers);
		
		
		
		
	}

}
