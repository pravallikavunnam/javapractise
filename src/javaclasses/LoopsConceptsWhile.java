package javaclasses;

public class LoopsConceptsWhile {

	public static void main(String[] args) {
		// In every programming language we have concepts of loops like for loop,while
		// ,do-while,for each.
		// Loops in Java
		// 1.While loop

		// print 1 to 10 numbers using while loop
		int i = 1;
		while (i <= 10) {// while is a keyword and we need to keep condition ()
			System.out.println(i);// Infinity loop 1,1,1,1,1,-----1 because we don't have increment/decrement of i
									// variable
			i++;// to avoid infinity loop we add condition
		}

		// To print odd numbers using while loop
		int j = 1;
		while (j <= 10) {
			System.out.println(j);
			j = j + 2;
		}
		// To print even numbers using while loop
		int k = 0;
		while (k <= 10) {
			System.out.println(k);
			k = k + 2;
		}

		int p = 1;
		while (p <= 10) {
			if (p == 5) {
				System.out.println("Hi");
				break; // break the entire while loop once condition satisfied ---we can use break in
						// loops for if condition also
						// we can't use break directly in if-else condition
			}
			System.out.println(p);
			p++;
		}

		while (true) {
			System.out.println("Bye");// Infinity loop --we have kept true --saying the condition will be always true
			break; // breaks the infinity loop
		}

//		while(false) {
//			System.out.println("Hii");//unreachable code because complier will never reach here because 
//			//we kept condition as false
//		}

		int count = 0;
		while (count <= 100) {
			System.out.println(count);
			if (count == 25) {
				System.out.println("25 runs");
			}
			if (count == 50) {
				System.out.println("Half century");
			}
			if (count == 100) {
				System.out.println("Century");
			}
			count++;
		}
		// uses for while ----we go for while loop when number of iterations are not
		// fixed
		// 1. waiting for element in the page
		// 2. wait for the page loading
		// 3. Dropdown options --will keep on adding
		// 4. Webtable Pagination
		// 5. Calender ---not sure how many times we need to click on next
		// 6. Carousel--Images scrolling in header
		
		//Print 10 t0 1 using while loop
		int x=10;
		while(x>=1) {
			System.out.println(x);
			x--;
		}
		
		int pointer=0;
		while(true) {
			System.out.println("checking the element :"+ pointer);
				if(pointer==10) {
					System.out.println("Element found");
					//break;
				}
				pointer++;
		}
		
		
		
	}
	
	

}
