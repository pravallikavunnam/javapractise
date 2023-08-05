package staticconcept;

public class MainMethodConcept {

	// why main method is static in nature ----main method is always stored in
	// MetaSpace ---Main method is called by JVM
	// JVM will always comes to class and check main method is available or not
	// By default main method is static in nature
	// main method is starting pointer of execution
	// main method void in nature ---because we never return anything from main
	// method
	// : do we write any business logic? ---do we use return keyword in main method?
	// main method will never return anything---it is used as a caller method
	// create object and call the objects if it is non-static
	// if it is static use classname
	// we never write business logic or calculations
	// we create separate methods --where we write business logics
	//without main method if we try to execute the program --we get error main method not found ,even though we are having other overloaded main methods also
	public static void main(String[] args) { // main method used for calling purpose
		System.out.println("This the main method");
		MainMethodConcept.main(10);
		MainMethodConcept.main(20,"Tom");
		
	} // we use main method only for calling purpose
		// No business logic
		// No return
		// CMA
		// No need to create the objects to call main method

	// can we overload main method ---yes
	// can we overload static methods--yes
	// can we have two same main methods in the class?--no
	// if we have mutiple main methods ---jvm will always checks for signature
	// format to start execution ie.., and skips the other main methods
	// PSVM- String[] ----signature format with string array parameter

	//how to call other main methods---static in nature --so we call using classname.methodname in the main method
	public static void main(int a) { // other main method
		System.out.println("hi");
		System.out.println(a);
	}

	public static void main(int a,String b) { // other main method
		System.out.println("bye");
		System.out.println(a+b);
	}

}
