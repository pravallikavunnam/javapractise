package javaclasses;

import java.util.ArrayList;

public class ArrayListRemoveConcepts {

	public static void main(String[] args) {
		
		// In ArrayList values will be added Order Based ---that why called as OrderBased Collections
		ArrayList<String> empDetails = new ArrayList<String>(); // -->vc=10,pc=0
	//	System.out.println(empDetails);//blank array will be displayed as soon as we declare arraylist without passing values
		empDetails.add("PK"); // 0
		empDetails.add("NV"); // 1
		empDetails.add("Rose"); // 2
		empDetails.add("Jack"); // 3
		empDetails.add("Esh"); // 4 --->vc=5 ,pc=5
		System.out.println(empDetails);
		empDetails.add("Ji"); // will be added at next index ie 5
//				empDetails.add(1, "chinnu"); //got added at index 1 without deleting previous value in the same index
//				System.out.println(empDetails); 
//				empDetails.remove(0);
//				System.out.println(empDetails); //value at index 0 got deleted but the value at 1 got shifted 0 and so onn 
//				                                //without keeping index 0 blank
//				System.out.println(empDetails.get(0));
		empDetails.add("Chinnu");// 6 //it will be added at the end
		System.out.println(empDetails);

//				empDetails.add(10, "PC");
//				System.out.println(empDetails); //IOB because in middle indexes 7,8,9 are not filled with values --
//				                                //ArrayList accepts continuous memory allocation we can't skip segments in between 
		empDetails.remove("Rose");
		System.out.println(empDetails);

		System.out.println("-----------");
		empDetails.remove("Rose"); // when tried to remove already removed data
		System.out.println(empDetails); // it will just simply show the available data

		empDetails.add("PK");
		System.out.println(empDetails);
		empDetails.remove("PK");
		System.out.println(empDetails); // when same value having at two indexes and try to delete with value without
										// index
										// always deletes first indexes value --if given specific index to delete then
										// deleted that index value only

		empDetails.add(null);
		System.out.println(empDetails); // we can add null values in ArrayList

	}

}
