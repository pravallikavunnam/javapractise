package javaclasses;

public class LoopConceptsForLoop {

	public static void main(String[] args) {

		// print 1 to 10 using for loop
		for (int i = 1; i <= 10; i++) { // first check initialization(only once we check) ,check condition,print
										// statement
										// and increase check condition,print statement.....when condition becomes false
										// ,comes out of loop
			System.out.println(i);
		} // with for loop also we can generate infinite loop
//			for (int j=1;j<=10;) {
//				System.out.println(j);//Infinite loop 11111..........1
//			}
		int k = 1;// we can write like this also
		for (; k <= 10; k++) {
			System.out.println(k);
		}
		int m;
		for (m = 1; m <= 10; m++) {
			System.out.println(m);
		}
		// Print odd numbers using for loop
		for (int n = 1; n <= 10; n++) {
			System.out.println(n);// 13579
			n++;
		}

		for (;;) { // by default it will always take true in the brackets
			System.out.println("Bye");// Infinite loop
			break;// break the loop
		}

		for (int run = 1; run <= 100; run++) {
			System.out.println(run);
			if (run == 0) {
				System.out.println("Duck .....Bye");
				break;
			}
			System.out.println("Hello");
		}

		// Usecase for for loop
		// Use for loop when number of iterations are fixed
		// 1.To fetch the values from array
		int ar[] = new int[4];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		for (int r = 0; r < ar.length; r++) {
			System.out.println(ar[r]);//
		}
		// 2. Dropdown month
		// 3. Shop by category in big basket
		// 3. Menu /Sub-menu items in the e-commerce site
		// 4. Countries Dropdown,State dropdown.CityDropdown

		// Print 10 to 1 using for loop
		for (int x = 10; x >= 1; x--) {
			System.out.println(x);
		}
		// Print even numbers using for loop
		for (int d = 0; d <= 10; d += 2) {
			System.out.println(d);
		}

		// Print 1 to 100 and Hi if the num is divisible by 5
		for (int e = 1; e <= 100; e++) {
			System.out.println(e);
			if (e % 5 == 0) {
				System.out.println("Hi");
			}
		}
		// Print even numbers 1 to 10 using % modulas operator
		for (int f = 2; f <= 10; f += 2) {
			System.out.println(f);
			if (f % 2 == 0) {
				System.out.println(f + "is Even Number");
			}
		}
		System.out.println("---------------");
		// Print odd numbers 1 to 10 using % modulas operator
		for (int y = 1; y <= 10; y += 2) {
			System.out.println(y);
			if (y % 2 != 0) {
				System.out.println(y + " " + "is Odd Number");
			}
		}

		// Doube using for loop
		for (double d = 1.0; d <= 10.0; d++) {
			System.out.println(d);
		}

		for (double d = 10.0; d >= 1.0; d--) {
			System.out.println(d);
		}

		// Char with for loop to print a to z
		for (char c = 'a'; c <= 'z'; c++) {
			// System.out.println(c); //print a to z
			System.out.println(c + " " + (int) c); // print a to z ASCII Values
		}
		// Char with for loop to print A to Z
		for (char c = 'A'; c<= 'Z'; c++) {
			// System.out.println(c); //print A to Z
			System.out.println(c + " " + (int) c); // print A to Z ASCII Values
		}
		// Char with for loop to print 0 to 9
		for (char c = '0'; c <= '9'; c++) {
			// System.out.println(c); //print A to Z
			System.out.println(c + " " + (int) c); // print 0 to 9 ASCII Values
		}
		System.out.println("--------------------");
		// Char with for loop to print 0 to 9
		for (char c = '0'; c <= '9'; c++) {
			System.out.println(c);
			if (c == '5') {
				System.out.println(c);
				break;
			}
		}
		
		
		
		

	}
}