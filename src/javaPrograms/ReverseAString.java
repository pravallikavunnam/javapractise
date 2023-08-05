package javaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		//1. Reverse a string
		//2. D/B String and StringBuffer :Strings are immutable where StringBuffer is mutable and has reverse function
		//3. Do we have reverse function in string ----No ,String are immutable
		String s="Welcome to Selenium World";
		
		//1. Using for loop
		int len=s.length();
		System.out.println(len);
		String rev="";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//Using String Buffer
		StringBuffer sf=new StringBuffer(s);
		System.out.println(sf.reverse());
	}

}
