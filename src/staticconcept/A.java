package staticconcept;

import classandobjects.Browser;



public class A {

	public static void main(String[] args) {
		System.out.println("A main");
	//	B.main(args); //Calling B class method with the help of class name
		 //here we get StackOverflowError because we are continuously calling from class B main method and from B class A main method
		//it will keep on calling like infinite
		//we call static methods with class name
		Browser.main(args); //we can call different package static method also with the help of classname
		//we can call any method from anywhere---there is no restriction
		
		//static driver ---here same static driver will be used for all the test cases
		//Running test cases in parallel mode : run test cases at the same time ---launching 10 browsers at a time
		//so here when driver is called which is static -first test case will be using ,so second test case had to wait for driver var
		//as second test case cannot be used because it will share only one copy--one copy will be common which is stored in MetaSpace
		//so other test cases will be in wait state-it is always in sequential execution-once driver is free from first test cases 
		//then second test can access once done with second then only third test case 
		//so it will badly impacts the performance running test cases in parallel mode for static variable
		//so to Achieve parallel execution with static var we go for concept ---Thread local concept 
		
		
		//	driver  ---but when declared var as non-static 
		//when declared non-static var --an individual copy will be shared to each class objects 
		//Test case execution will be proper when we have individual copy of var 
		
	}

}
