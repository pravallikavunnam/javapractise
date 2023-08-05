package ExceptioHandling;

public class Student {

	
	public static int getStudentMarks(String name) {
		System.out.println("getting marks for:" + name);
		
		if(name.equals("Pandu")) {
			try {
			int i=9/3;   		// if 9/3 then return 65
			System.exit(0);    //System class with exit method --passing 0 means shutdown the JVM or terminate the program immediately
			return 65;         //to prevent finally block we use this statement sytem.exit(0);
			}
			catch(ArithmeticException e) {
				System.out.println("ae is coming");
				return 85;        //if no finally block then it will return 85
			}
			finally {
				return 100;   //if we have return in finally exception is coming or not ----it will always return from finally block
			}
		//	return 100;
		}else if(name.equals("chinnu")) {  //if name is chinnu then will return 90
			return 90;
		}
		else {
			System.out.println("Student not found-----");  //if name is not found return -1
			return -1;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int m1=Student.getStudentMarks("Pandu"); //as method is static calling with class name
		System.out.println(m1);
	}

}
