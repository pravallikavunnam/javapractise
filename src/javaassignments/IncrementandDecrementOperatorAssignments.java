package javaassignments;

public class IncrementandDecrementOperatorAssignments {
	public static void main(String[] args) {
		// 1.What will be the output of the following program?
		int i1 = 11;
		i1 = i1++ + ++i1;
		System.out.println(i1); // 24

		// 2.Guess the output of the following program?
		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a=" + a);// 13
		System.out.println("b=" + b);// 24
		System.out.println("c=" + c);// 103

		// 3.What will be the output of the below program?
		int i2 = 0;
		i2 = i2++ - --i2 + ++i2 - i2--;
		System.out.println(i2);// 0

		// 4.Is the below program written correctly?
		// boolean b1 = true;
		// 556
		// b1++;
		// System.out.println(b1);

		//5.What will be the output of the below program?
		 int i=1, j=2, k=3;
		 int m = i-- - j-- - k--;
		 System.out.println("i="+i);//0
		 System.out.println("j="+j);//1
		 System.out.println("k="+k);//2
		 System.out.println("m="+m);//-4
		 
		 //6.What will be the output of the following program?
		 int a3=1, b3=2;
		 int i4=1, j4=2, k4=3;
		 int m4 = i-- - j-- - k--;
		 System.out.println("i4="+i4);//1
		 System.out.println("j4="+j4);//2
		 System.out.println("k4="+k4);//3
		 System.out.println("m4="+m4);//-3
		 System.out.println(--b3 - ++a3 + ++b3 - --a3);//0
		 System.out.println(a3);//1
		 System.out.println(b3);//2
		 
		 //7.What will be the value of i, j and k in the below program?
		 int i5=19, j5=29, k5;
		 k5 = i5-- - i5++ + --j5 - ++j5 + --i5 - j5-- + ++i5 - j5++;
		 System.out.println("i5="+i5);//19
		 System.out.println("j5="+j5);//29
		 System.out.println("k5="+k5);//-20
		 
		 //8. What is wrong with the below program? Why it is showing compilation error?
		 // int i = 11;
		 // int j = --(i++);//Invalid argument to operation ++/--
		 
		 //9.Guess the value of p in the below program?
		 int m6 = 0, n = 0;
		 int p = --m6 * --n * n-- * m6--;
		 System.out.println(p);//1
		 System.out.println(m6);//-2
		 System.out.println(n);//-2
		 
		 //10.What will be the output of the following program?
		 int a7=1;
		 a7 = a7++ + ++a7 * --a7 - a7--;
		 System.out.println(a7);//
		 
		 //11.What will be the outcome of the below program?
		// int a8 = 11++;
		// System.out.println(a8);//Invalid argument to operation ++/--
		  
		 //12.What will be the outcome of the below program?
		 int ch = 'A';
		 System.out.println(ch++);//65
		 System.out.println(ch);//66
		 
		 //13.What will be the outcome of the below program?
		 char ch1 = 'A';
		 System.out.println(++ch1);//B
		 
		 
		 //14. What will be the outcome of the below program?
		 double d = 1.5, D = 2.5;
		 System.out.println(d++ + ++D);//5.0
		  
	}

}
