package DataConvert;

public class DataConversion {

	public static void main(String[] args) {
		
		//Data Conversion : 
		
		String x="100";
		System.out.println(x+20); //output 10020 string concatenation
		//now need to convert String to int
	
		int i=Integer.parseInt(x) ; //conversion is called as Parsing
		//parseInt is a static method so using classname which returns 100so storing in int
		System.out.println(i+20); //now the output will be 120
		
		//In Selenium we always receive string
		//if we want to perform any arithmetic calculation
		//so we convert string to Integer----Data Conversion using Wrapper Classes
		//Wrapper class : int(Primitive)-->Integer(Class -Non-Primitive) --conversion of primitive to non-primitive
		//or data type conversion to class type conversion
		//Java has done for each primitive data types they have created Class
		//like int-Integer class
		//double --Double class
		//float-Float class 
		//boolean ---Boolean
		//char --Character Class ---all these are wrapper classes --y called as wrapper classes---
		//--Wrap means under they hold primitive data values but on top of that java has created respective classes
		//wrapper classes can be used for data conversion
		//
		
		
//		String test="100A";
//		int k=Integer.parseInt(test);
//		System.out.println(k); //gives exception NumberFormatException:
//		//whenever trying to convert String to numeric it should be pure String then only we can do data conversion
		
		//String to double conversion
		String s="12.33";
		System.out.println(s+10); //just concatenate string with 10 
		double d=Double.parseDouble(s);
		System.out.println(d+10);
		
		//String to boolean conversion
		String headless="true";
		
		if(Boolean.parseBoolean(headless)) {
			
		}
		
		System.out.println(Byte.MAX_VALUE); //Byte is wrapper class ---gives max value of Byte
		System.out.println(Byte.MIN_VALUE );
		
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		//Conversion from int to String
		int u=100;
		System.out.println(u+20); 
		String u1=String.valueOf(u);//String class ,Valueof Method
		//it converts u to string "100" and valuOf method will give string so storing in string
		System.out.println(u1+20);//output should be 10020
		
		//sendKeys method will always take string only
		//so whenever we are passing mobile number and all we send as string and do data conversion
		
		
	}

}
