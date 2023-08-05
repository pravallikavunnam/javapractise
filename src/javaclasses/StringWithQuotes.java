package javaclasses;

public class StringWithQuotes {

	public static void main(String[] args) {
//		String str="I love Java and its concepts";
//		System.out.println(str);//I love Java and its concepts
		
		//if we want double quotes for any particular word in string we use\"java"\ 
	
		String str="I love \"Java\" and its concepts";
		System.out.println(str);//I love "Java" and its concepts
		
		String str1="This is my \"Java\" and \"Selenium\" code";
		System.out.println(str1); //This is my "Java" and "Selenium" code
		
		String username="admin";
		String password="admin123";
//		String url="https://www.abc.com/login.html";//if i want to append my username and password in URL We use + operator
		String url="https://"+username+":"+password+"@abc.com/login.html";
		System.out.println(url); // https://admin:admin123@abc.com/login.html
		
//		xpath--//a[text()='Pravallika']//if we want to print same xpath with username in single quote
		
		String userName="Eshpa";
		String xpath="//a[text()='"+userName+"']";//string concatenation with "+-----+"
		System.out.println(xpath);//  //a[text()='Eshpa']
		
//		xpath--//a[text()="Pravallika"]//if we want to print same xpath with username in double quotes
		
		String userName1="\"Rose\"";
		String xpath1="//a[text()="+userName1+"]"; 
		System.out.println(xpath1);
		
		
		
		

	}

}
