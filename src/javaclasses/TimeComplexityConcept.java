package javaclasses;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		// Time Complexity:It means how complex our code is written,how optimize your
		// code,how much time taking to execute our code
		// Time Complexity is represented by BIG O
		// Space Complexity: how much bytes and bits your code is taking in memory.
		// Space Complexity is represented by BIG O
		//Space complexity taken into two forms--?Auxiliary space + Actual variable space
		//Aux --each line of code written --we avoid this 
		// we take actual variable space and calculate space complexity
		
		// 1 to5 products --need to select one product --quickly we can check for
		// smaller data
		// but when 1 to 1M products --need to select one product ---we have to check
		// code working properly or not---
		// giving output withintime ---this analysis is called time complexity

		int i = 1;
		// System.out.println(i);//Output will be 1 only if we run once or 1000 times
		// also.
		// time complexity of above will be--O(1)---which is constant time

		String s = "selenium";
		// System.out.println(s); //time complexity of above will be--O(1)---which is
		// constant time

		// Indexed loop to pint 1 to 10
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		} // Time complexity of above for loop --O(n) --where n is n number of times loop
			// is executed
			// k=1 will be executed only once +checking condition[which will vary no 10
			// tomorow it can be 1000]
			// --it will execute 10 times ie..n times+k will be printed times+k will
			// incremented n times
			// 1+n+n+n-->3n+1-->which is linear equation-->3n + 1-->role of 1 will be
			// constant -->so remove 1 -->
			// whenever we are calculating time complexity we remove constants--> 3n
			// -->O(3n)-->O(n)-->
			// Removing three as it also constant
			// ie ..,1+n+n+n-->3n+1-->3n + 1 -->3n -->O(3n) -->O(n)

		// Time complexity of below while loop is: O(n)
		int p = 1;
		while (p <= 100) {
			System.out.println(p);
			if (p == 30) {
				System.out.println("Hi");
			}
			p++;
		}

		// 1+n+n+n+1+n-->4n+2-->4n + 2-->2(2n+1) --> 4n-->O(4n)-->O(n) ---generalized
		// formulae

		// Nested for loops
		// Expected Output : 00 01 02 03 04 05 ie mn // Time Complexity will be O(n^2)
		// 10 11 12 13 14 15
		// 20 21 22 23 24 25
		// 30 31 32 33 34 35
		// 40 41 42 43 44 45
		// 50 51 52 53 54 55
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
				System.out.print(m + "" + n + " "); // for m=0 inner loop n=0,1,2,3,4,5 will be executed 5 times ie
													// 00,01,02,03,04,05
				// for m=1 inner loop will be execute n=0,2,3,4,5, will be executed 5
				// times-10,11,12,13,14,15
			}
			System.out.println(); // and then m will get incremented for 1
									// and then m will get incremented for 2----------
		}
		//(1+n+n+n)(1+n+n+n)-->(3n+1)(3n+1)-->9n^2+3n+3n+1-->9n^2 + 6n + 1 -->Quadratic Expression -->
		//9n^2 + 6n -->3n(3n+2)-->9n^2-->O(9n^2)-->O(n^2)
		//(m=0,m<=5,println,m++ ---outer loop)(n=0,n<=5,m n print,n++---inner loop)
		
		//Time complexity for three loops : O(n^3)
		//Sapce complexity :O(1)
		for (int m = 0; m <= 5; m++) {
			for (int n = 0; n <= 5; n++) {
				 for(int k=0;k<=5;k++) {
					 System.out.print(m+""+n+k+ " ");

				 }
				 System.out.println();
			}
			System.out.println();
		}
		//(1+n+n+n)(1+n+n+n)(1+n+n+n)-->(1+3n)(1+3n)(1+3n)-->1+
		
		//Binary search time complexity : log n
		// 1-30 we want number 25
		//li=0,hi=29,lenth=30;
		// we divide array into two parts 15 + 15-->searching number will fall into second part --->15/2 -->7 + 8 -->8/2-->
		//4 + 4-->4/2-->2 + 2-->2/2-->1+1
		//ie..n-->n/2-->n/4-->n/8
		//k=n/2
		//log(k)=l0g(n/2)
		//log(k)=log n-log2
		//log(k)=log n-1 (we remove -1 as it is constant)
		//log(k)=log n
		
		

	}
}
