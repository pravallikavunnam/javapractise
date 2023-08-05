package methodcallingconcept;

public class Employee {

	//all are non-static methods
	//if i want to call m2 method inside m1 method---
	//whenever we have to call non-static method with in the same class no need to create object
	//we can create an object of class and from there we can call any method and access other methods also
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		t1();//4.we call directly ----if we want to call static method from non-static method---not required object creation
		//m1();
	}
	
	//Static methods
	
	public static void t1() {
		System.out.println("t1 method");
		t2(); //we can call directly
	}
	public static void t2() {
		System.out.println("t3 method");
		t3();
	}
	public static void t3() {
		System.out.println("t3 method");
		//3.If static method (t3)wants to call non-static method (m1) in the same class----create object of the class and call with ref var
		//m1();--we cannot call directly
		System.out.println("Calling non static method from static method");
		Employee e1=new Employee();
		e1.m1();
		
		//the issue with above code is like we created object--so whenever we call t3 method it will create object--
		//which unnecessarily increase heap size
		//to overcome above problem we use --we need a common reference instead of creating object ie..call by reference 
		//so whenever t3 method getting called from main method ,we supply reference in t3 method and pass that reference to m1
	
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee();//if i want to call non-static methods from static method we create object of class
		e.m1();
		System.out.println("-------------");
		//if we want to call Browser class b2() method in Employee class
		//as b2() method is non-static we can call using object reference var
		//as we cannot call the method directly
//		b2();//we get error--if we call directly
		//so we  create object of Browser class in Employee class and with the help of ref var we call b2() method
		Browser b=new Browser();
		b.b2();
		
		System.out.println("-------------");
		//to call static methods
		//1. we can directly call static methods if they are in the same class or we can call using classname.method
		t1();
		System.out.println("-------------");
		//2. if the method is in other class then it is always best to call using classname.method
		Employee.t1();
		System.out.println("-------------");
		
		//if we want to call p1 static method from Browser class in employee class main method 
		//---we can call using Browser.p1()
		
		Browser.p1();
		
		//Always execution starts from main method
		//1.if one static method is calling other static method---no need to create objects--
		//we can call using classname.method from main method if we want to run all the methods
		
		//2.if one non-static method is calling other non-static method---no need to create objects--
		//we can create an object of class and with ref var we can access all all non-static methods in the main method or --
		//if we want to use those methods in other class methods
		
		//for non-static always create object
		//for static no need to create object
		//if static is available in other class then classname.methodname 
		//static method --always class method
		//non-static method--Instance method
		
		
		
		
	}

}
