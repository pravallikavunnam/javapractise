package methodcallingconcept;

public class Browser {
	
	public void b1() {
		System.out.println("b1 method");
		b2();
	}
	public void b2() {
		System.out.println("b2 method");
		//m1();//if we call other class methods we get error
	    //so how we call m1() method--with the help of object reference we can call
		//from outside of class we cannot call any random method from other class --
		//it depends if the method is non-static we need to create object of the class
		//we create object of Employee class in Browser class---and call the methods with the help of object refernece
		//we can create object of any class in any method 
		Employee e=new Employee();
		e.m1();
	}
	//can we execute browser class --no, because no main method 

	public static void p1() {
		System.out.println("p1 method"); 
		//if we want to call p1 static method from Browser class in employee class main method 
		//---we cannot call it directly because p1 method is not available in employee class
		//---we can call using Browser.p1()
		
		
	}
}
