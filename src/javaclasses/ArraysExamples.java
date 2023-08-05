package javaclasses;

import java.util.Arrays;

public class ArraysExamples {

	public static void main(String[] args) {
		//Cricket--15 players always fixed-so in this case we can go for static array
		//playes---name,age,country,Totalruns,Strike Rate---so we go for Object array
		//Specific player info --where no idea about total runs and strike rate --so we go with normal array using new keyword
		Object player[]=new Object[5]; //one object array for each player
		player[0]="Rashid Khan";
		player[1]=30;
		player[2]="AG";
		player[3]="2000";
		player[4]=12.33;
		
		//if 100 players there -we need to have 100 object arrays this is the limitation to overcome --
		//this we use collections,classes and objects concepts,dynamic array
		
		Object player1[]=new Object[5]; //one object array for each player
		
		player1[0]="Eshpa";
		player1[1]=24; //default value of object is Null in memory
		
		System.out.println(Arrays.toString(player1));//Eshpa ,24,null,null,null
		
		//String Array
		String st[]=new String[5];
		st[0]="Esh";
		st[1]="pa";
		System.out.println(Arrays.toString(st)); //Esh ,pa,null,ull,null
		//default value of String is Null in memory ie..
		//we didn't passed value for indexes st[2],st[3].st[4]---default value will be null
		
		//int array
		int i[]=new int[5];
		i[0]=10;
		System.out.println(Arrays.toString(i)); //10,0,0,0,0  --default values of primitive data types in memory is 0
	
		//short array
		short s[]=new short[3];
		s[1]=20;
		s[2]=30;
		System.out.println(Arrays.toString(s));//0,10,20 ---default values of primitive data types in memory is 0
		
		//double Array
		double d[]=new double[4];
		d[0]=23.87;
		d[1]=22.43;
		System.out.println(Arrays.toString(d));//23.87,22.43,0.0,0.0---default values of primitive data types in memory is 0.0

		//char Array
		char c[]=new char[3];
		c[0]='a';
		System.out.println(Arrays.toString(c));//a, , ----default value of char is blank space
		
		//boolean
		boolean b[]=new boolean[3];
		b[0]=true;
		System.out.println(Arrays.toString(b)); //true,false,false -----default value of boolean is false
		
		
		//Default value
		//1. Primitive data types : It,byte,short ,long ---0
		//2. Non primitive data types:String ,Objects ----NULL
		//3. Boolean ----false
		//4. Double,float---0.0
		//5. Char---blank spce
		
		//Int 
		int e[]= {12,10,20,50,60};
		System.out.println(Arrays.toString(e));
		e[0]=100;   //replace value in the 0 index --where previous value is gone --which is data loss--
		//this is also one limitation in array----so we go for dynamic array
		System.out.println(Arrays.toString(e));
		e[7]=900;  //Here we are assigning value to index which is not available in memory so it gives exception
		System.out.println(Arrays.toString(e));//AIOBE
	}

}
