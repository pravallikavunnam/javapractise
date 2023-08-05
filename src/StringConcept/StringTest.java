package StringConcept;

public class StringTest {

	public static void main(String[] args) {
		
		
		String s="testing";   //this type of strings are String literals
		//String is a class --collections of characters
		//String is array of characters which should be enclosed in double quotes
		//s is a variable name and = is assignment operator
		
		//The moment we declare string s="testing" where it will be stored?
		//If string is a class then why are we not creating object of this String class
		
		String s1=new String("testing"); //this are string objects created with the help of new keyword
		
		
		//Memory management of String
		//java memory divided into heap and stack memory
		//String object will be created in heap memory with string value "testing"
		//reference s1 will be stored in stack pointing to object
		
		//String literals also will be store in heap but not in the form of objects
		//they will be stored in a special place String Constant Pool in heap memory
		//String s="testing one value will be store in SCP "testing" which is referred by s 
		//reference s will be stored in stack 
		
		//how many string objects got created ? two
		//one is available in the form of actual object inside heap 
		//one more object will be created not like new keyword ,but string value will be created inside SCP
		
		
		//After JDK .17 SCP is part of heap memory
		
		String s2="testing"; //String literals always go to SCP
		//But we already have a string value with "testing" in the SCP
		//So it won't allow duplicate value in the SCP
		//so for one value two reference s and s2 starts pointing
		//so in the SCP string value "testing"has two references
		
		System.out.println(s==s2);
		
		System.out.println(s==s1); //comparison will be done on the basis of there memory reference address
		
		
		System.out.println(s1==s2);
		//we can use == for string literals comparison
		
		
		//we use this method for string content comparison--if content is same it will give true
		System.out.println(s.equals(s1)); // this method will not check any references or memory address
		//this method will check the content of s testing and content of s1 testing
		//this concept is only for Strings
		
		System.out.println(s.equals(s2)); 
		
		
		
		String s3="java"; //will be stored in SCP with reference s3
		s3=null;  //s3 will break connection with java in SCP and starts pointing to null ,
			//---so value java will be available in SCP but without any reference
		System.out.println(s3);
		//for SCP also we have garbage collector concept
		
		
		String s4="java";
		//in SCP duplicate values are not allowed so s4 starts pointing to java which is already available in java without reference 
		

		String s5="java";  //previously s4 was pointing to java now s5 also starts pointing to java in SCP
		
		String s6=new String("testing");  //when we create object with the help of new keyword it will always create new object in heap
		//does not matter values are same or not   //but in SCP duplicate values are not allowed
		//object is referred by s6
		
		String t1="Selenium";
	//	String t2="selenium";
		//it will create two objects in SCP because of case sensitivity
		
		String pop="Selenium";
		
		String t2=new String("Selenium") ;//object created in heap
		t2.intern(); // this method will try to create same value in SCP also --
		//but there will be no reference variable pointing to duplicate value in SCP
		//so now two values will be created 
		//one object in heap 
		//other value in SCP
		
		String t3="Selenium"; //it will check for the value in SCP ,it won't create duplicate value in SCP
		//So t3 also starts to pointing to previous ref variable
		
		
	//why these options are given to strings only not for other data types ---1. because of better memory management
	//2. String is the most frequently used data type ex: In amazon -product name,url,product header.. everything available in string format only
	//3. so java has to perform some memory optimization on strings to avoid unnecesary object creation
	//4. integers ,doubles  are used only for price.....
		
		
		
		String top="naveen";
		String top1="naveen";
		String top3=new String("naveen");
		top=null;
		top1=null;
		String top4="naveen";
		
		
		System.out.println(top==top1); //both pointing to null ---gives true
	//	System.out.println(top.equals(top1)); //NullPointerException null.equals //we cannot apply null on methods
		System.out.println(top4==top3); //references are diff so gives false
		
		System.out.println(top4.equals(top3)); //true it will check content comparison
		
		
		String z="testing";
	//	z.concat("automation");
		z=z.concat("automation"); //now z stops referring testing and starts pointing testingautomation
	//	String z1=z.concat("automation"); //concatenated testingautomation value will be referred by Z1
		String z1="testing"; //z1 starts referring testing 
		System.out.println(z1);
		System.out.println(z); //gives output as testing only
	//	System.out.println(z1);
		//because Strings are immutable
		//Immutability : we cannot change the existing value
		//testing value is stored in SCP as z as reference variable
		//when concatinated testing automation will also be stored in SCP with no reference as new value but because we cannot store the existing value 
		//so when printed z it will give testing only
		//the moment we try to create string ,once it is created --cannot change the original value
		//the moment we try to add anything in the string then it will produce new string
		//will not make any changes in the existing string
		
		//-----------------------
		String r= " cypress "; //cypress will be stored in SCP 
		System.out.println(r.trim()); //r.trim will create new entry without space and no one is there pointing the value
		System.out.println(r); //gives original value of r
		
		
		//----------In the above lines we are manipulating string ie.concatenatong,trimming and all..........
		//The moment we try to concatenate any string it will create new string which will be a memory issue
		 //so it is a bad practice manipulating the strings
		
		
//---------So to avoid this we have other two classes StringBuffer and StringBuilder which are mutable Strings where String is Immutable----
//StringBuffer --Introduced in java 1.0
				//It is very slow
				//It is synchronized
				//it is thread safe
//StringBuilder introduced in Java 1.5
				//It is faster 
				//it is non-synchronized 
				//Not thread safe
		
		//when we create object of StringBuffer
		//value is naveen
		//once first thread is done then only second thread can access and from second thread cannot change anything if it is changed by
		//first thread --value gets locked until first thread work is done ---then second thread starts working
		//Multipe thread/user cannot work together --that is why it is slow --all thread will participate one after other
		
		//when we create object of Stringbuilder
		//value is cypress
		//all thread can change the value and read the value at same time
		//it is faster for read operation---all threads can read current value at same time
		//means no thread here waits for other thread like in Stringbuffer
		
		
		// we cannot have StringBuilder literals 
		//we have to create proper object and in constructor we pass the value
		StringBuffer sb=new StringBuffer("naveen"); //an object will be created with value referred by sb
		sb.append("automation"); //append and concat both are same //so whatever value in sb will attend with automation 
		//and gives in same string without new entry
		System.out.println(sb);
		
		//so string builders are mutable objects
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
