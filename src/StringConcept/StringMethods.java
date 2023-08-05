package StringConcept;

public class StringMethods {

	public static void main(String[] args) {
		
		//whenever we want to make any changes in string we use StringBuilder class
		//StingBuffer and StringBuilder --We go with StringBuilder --because it is fast
		
		String s="This is my java code and i am so happy";
		//a string will be maintained internally in the form of character array
		//where T is at 0 index
		//total length of string will be 37
		//we use s.lenth() method to find length of string
		
	//	s.intern();//will try to create this string as an intern in constant pool
		
		//1. Length Method
		System.out.println(s.length()); //38
		
		//2. CharAt Method
		//to find character at specific index
		System.out.println(s.charAt(0)); //T
		System.out.println(s.charAt(37)); //y
//		System.out.println(s.charAt(38)); //StringIndexOutOfBoundException ---UnChecked Exception--thrown at RunTime
		
		//3. Indexof Method
		//to fetch index of character
		System.out.println(s.indexOf("T"));
		
		//first occurance of i
		System.out.println(s.indexOf("i")); //if we have many same characters  it will also starts checking from beginning 
		
		System.out.println("---------------------");
		
		
		//To identify second occurance of i
		String s1="hello This is my java code and i am so happy";////but the issue with above one is when the string got added more characters
		System.out.println(s1.indexOf("i")); //8
	//	System.out.println(s1.indexOf("i", 3)); //we get 8 for second occurance also because of the hard coded value
		//so 
		System.out.println(s1.indexOf("i", s1.indexOf("i")+1));
		
		System.out.println("---------------------");
		//To identify third occurance of i
		String s2="test hello This is my java code and i am so happy and i am cool";
		System.out.println(s2.indexOf("i")); //13
		System.out.println(s2.indexOf("i", s2.indexOf("i")+1)); //16
		System.out.println(s2.indexOf("i", s2.indexOf("i", s2.indexOf("i")+1)+1)); //36
		System.out.println(s2.indexOf("i", s2.indexOf("i", s2.indexOf("i", s2.indexOf("i")+1)+1)+1)); //54
		
		//To find all occurance of i --we use loop
		
		
		
		//we can search for index of string also
		System.out.println(s2.indexOf("java"));
		System.out.println(s2.indexOf("cypress")); //if no value available it will return -1
		
		
//		String mesg="welcome admin";
//		if(mesg.indexOf("admin")>0){
//		
//			System.out.println("Amdin is present");
//		}
//		else {
//			System.out.println("admin is not present");
//		}
		
		//if there is a bug in value instead of admin null is displayed
		String mesg="welcome null";
		if(mesg.indexOf("admin")>0){
		
			System.out.println("Amdin is present");
		}
		else {
			System.out.println("FAIL");
		}
				
		//4.Trim Method
		//How to remove corner spaces
		
		String test=" Selenium ";
		System.out.println(test.trim()); //trim method will remove spaces from the corner
		
		//5.Replace Method
		String dob="01-01-1990";
		//but if we want dob as like 01/01/1990
		String dob2=dob.replace("-", "/");
		System.out.println(dob2);
		
		dob2.intern();
		
		String dob1="01/101/1990";
		
		System.out.println(dob1==dob2);   //False because after replacing it will stored in heap 
		System.out.println(dob1.equals(dob2));//True ---because check the content is same or not
		
		
		
		
		String test1=" Selenium Automation ";
	//	test1=test1.trim();
		test1=test1.replace(" ", "");
		System.out.println(test1); //SeleniumAutomation
		//if we remove trim method output will be 
		System.out.println(test1); //SeleniumAutomation
		
		//SCP only applicable to Strings
		
		
		
		String p1="JavaProgram";
		String p2="Java";
		String p3=p2+"Program"; //concatenation with any var or using any method will be done in heap memory
		String p4="Java"+"Program"; //normal concatenation happens in SCP only
		System.out.println(p1==p3); //False p1 is JavaProgram ----p3=JavaProgram when concatenated stored in heap memory not in SCP
		System.out.println(p1==p4); //True p1 is JavaProgram ------P4 when concatenated becomes JavaProgram which is already there with ref p1
		//so p4 also starts pointing of same value 

	}

}
