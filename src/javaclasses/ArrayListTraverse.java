package javaclasses;

import java.util.ArrayList;

public class ArrayListTraverse {

	public static void main(String[] args) {
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);//0
		marksList.add(80); //1
		marksList.add(50); //2
		System.out.println(marksList); //PRINT ALL VALUES OF ARRAYLIST
		System.out.println(marksList.get(2)); //GET THE VALUE OF INDEX
		
		//PRINT THE ARRAYLIST WITH INDEXED BASED LOOP
		for(int i=0;i<marksList.size();i++) {
			System.out.println(marksList.get(i));
			      if(marksList.get(i).equals(100))//.equals we use for non-primitive so here Integer is class which is also non-primitive
				{
					System.out.println("Topper");
					break;
				}
		}
		//PRINT ARRAYLIST USING FOR EACH LOOP with int data type
		for(int e:marksList)
		{
			System.out.println(e);  
			
		}
		//PRINT ARRAYLIST USING FOR EACH LOOP with Integer class
		for(Integer e:marksList)
		{
			System.out.println(e);
			
		}
		
		//PRINT String ARRAYLIST values
		ArrayList<String> monthList=new ArrayList<String>();
		monthList.add("jan");
		monthList.add("feb");
		monthList.add("Mar");
		System.out.println(monthList);
		
		//PRINT String ARRAYLIST values using FOR EACH LOOP
		for(String e:monthList) {
			System.out.println(e);
		}
		
		//Print Object ArrayList Values
		ArrayList<Object> empData=new ArrayList<Object>();
		empData.add("Pravallika");
		empData.add(32);
		empData.add(30000.435);
		empData.add('F');
		empData.add(true);
		System.out.println(empData);
		
		//PRINT Object ARRAYLIST values using for each loop
		for(Object e:empData) {
			System.out.println(e);
				if(empData.get(1).equals(32))
				{
					System.out.println("Qualified");
					break;
				}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
