package javaassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayandArrayListAssignments {

	public static void main(String[] args) {
		//1.WAP to delete a specific number from the given array.
		//int p[] = {1,4,5,2,3,22,31, 2}; 
		//Need to remove 22 from the p[] array.
		int p[] = {1,4,5,2,3,22,31, 2}; 
		int[] a = new int[p.length-1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
		    if (p[i] != 22) {
		        a[j] = p[i];
		        j++;
		    }
		}

		System.out.println(Arrays.toString(a));
		
		//2.Write a program to create a static Array, having following cricket data:
		//name, age, team name, DOB, gender, Strike 
		//--Try to create multiple Object Arrays for different players 
		//--Try to print all the values of each player on the console
		Object ob[]={"MS Dhoni",40,"CSK",23/04/2023,'M',120.33};
		
		Object ob1[]={"Virat",30,"RCB",13/05/1992,'M',90.43};
		
		Object ob2[]={"DavidWarner",31,"SRH",04/05/1980,'M',140.33};
		
		System.out.println(Arrays.toString(ob));
		System.out.println(Arrays.toString(ob1));
		System.out.println(Arrays.toString(ob2));
		//Using Enhanced for loop
		for(Object e:ob) {
			System.out.println(e);
		}
		
		//*********ArrayList Assignments****************
		//1.Write a Java program to create a new array list, which contains all color names.
		//add some colors (string) 
		//and print out the colorslist using loops.
		
		ArrayList<String> colors=new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Indigo");
		colors.add("Black");
		colors.add("Yellow");
		colors.add("White");
		colors.add("Pink");
		
		System.out.println(colors);
		
		//using for loop
		
		for(String e:colors) {
			System.out.println(e);
		}
		
		//2. Write a Java program to retrieve an element at a specified index from a given array list.
		
		ArrayList<Integer> elements=new ArrayList();
		elements.add(1); //0
		elements.add(2); //1
		elements.add(3); //2
		elements.add(4); //3
		elements.add(5); //4
		System.out.println(elements);
		int num=elements.get(2);
		System.out.println(num);
		
		//3.Write a Java program to update specific array element by given element.
		ArrayList<String> names=new ArrayList();
		names.add("Esh"); //0
		names.add("Pandu"); //1
		names.add("nv");//2
		names.add("ji");//3
		names.add("Sonu");
		names.add("Jaanu");
		
		System.out.println(names);
//		String n=names.get(2);
//		System.out.println(n);
		names.set(2, "naveen");
		System.out.println(names);
		
		//4. Write a Java program to remove the third element from an array list. 
		ArrayList<String> empList=new ArrayList();
		empList.add("Tom"); //0
		empList.add("Rose"); //1
		empList.add("Jack");  //2
		empList.add("Jerry"); //3
		empList.add("Motu");  //4;
		System.out.println(empList);
		
		
		//System.out.println(empList.remove(2));
		
		empList.remove((Object) 2);
		System.out.println(empList);
		
		//5.Write a Java program to search an element in an array list using for loop. Once we find that element, break the loop.
		ArrayList<Integer> numberList=new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
	   System.out.println(numberList);
		for(int i=1;i<=numberList.size();i++)
		{
			if(i==2) {
				System.out.println("found the element ...."+" ");
				break;
			}	
			System.out.println(i);
		}
		
		//6.Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");
		System.out.println(studentNames);
		Collections.reverse(studentNames);
		System.out.println(studentNames);
		
		//7.Write a Java program to extract a portion of an array list.(Doubt)
		
		ArrayList<String> colorss=new ArrayList<String>();
		colorss.add("Red"); //0
		colorss.add("Green");//1 
		colorss.add("Blue");//2
		colorss.add("Indigo");//3
		colorss.add("Black");//4
		colorss.add("Yellow");//5
		colorss.add("White");//6
		colorss.add("Pink");//7
		System.out.println(colorss);
		ArrayList<String> portion=new ArrayList<>(colorss.subList(4, 6));
		System.out.println(portion);
		
		//8.Write a Java program to empty an array list.
		ArrayList<String> colorsRB=new ArrayList<String>();
		colorsRB.add("Red"); //0
		colorsRB.add("Green");//1 
		colorsRB.add("Blue");//2
		colorsRB.add("Indigo");//3
		colorsRB.add("Black");//4
		colorsRB.add("Yellow");//5
		colorsRB.add("White");//6
		colorsRB.add("Pink");//7
		System.out.println(colorsRB);
		colorsRB.clear();
		System.out.println(colorsRB);

		//9.Write a Java program to trim the virtual capacity of an array list the current list size.
		ArrayList<Integer> numberListAll=new ArrayList<>(10);
		numberListAll.add(1);
		numberListAll.add(2);
		numberListAll.add(3);
		numberListAll.add(4);
		numberListAll.add(5);
		System.out.println(numberListAll.size());
		numberListAll.trimToSize();
		System.out.println(numberListAll.size());
		
		//10.Write a Java program to print all the elements of an ArrayList using the position of the elements.
		ArrayList<Integer> n2=new ArrayList<>();
		n2.add(1);//0
		n2.add(2); //1
		n2.add(3);//2
		n2.add(4);//3
		n2.add(5);//4
		n2.add(6);//5
		System.out.println(n2.size());
		System.out.println(n2);
		for(int i=0;i<=5;i++) {
			System.out.println("The element at index position"+ i +" "+ "is"+ " " +n2.get(i));
		}
	
		
		
		
		
		
		
	}

}
