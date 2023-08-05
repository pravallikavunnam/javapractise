package classandobjects;

public class EmployeeTest {
		// whenever we write a function always write our requirement
	
			//ACCEPTANCE CRITERIA :waf (write a function)
			//I want to calculate the score/marks of my employee
			//create a function : getEmployeeMarks
			//input parameter: empName(String)
			//return : marks (int)
	
		public int getEmploeeMarks(String empName) {
			System.out.println("Employee marks"+" "+empName);
			//int marks =-1; // we are changing it from 0 to -1 because if 0 then it will print marksheet
			if(empName.equals("Tom")){
				//marks=90;
				return 90;
				
			}
			else if(empName.equals("Esh")){
				//marks=95;
				return 95;
				
			}
			else if(empName.equals("PC")){
				//marks=80;
				return 80;
			}
			else if(empName.equals("PA")){
				//marks=10;
				return 10;
			}
			else {
				System.out.println("Employee name is not found"+" "+empName);
			}
			return -1;
			
			//We can use n number of returns or 
			//we can initialize marks variable to -1 and check marks at each condition(this is the standard way of writing)
		}
			public void getURL() {
				System.out.println("get the URL");
				return; //we can use void and return in the same method but return should not return anything
				        //blank return //no return---which equal to void
			}
			
			
			public static void main(String[] args) {
		
				EmployeeTest e=new EmployeeTest();
				int marks=e.getEmploeeMarks("PA"); //Employee is name not found but returning 0;
				System.out.println(marks);
					if(marks>=0) {
						System.out.println("Print the marks");
					}
	}

}
