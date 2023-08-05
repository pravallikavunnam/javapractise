package classandobjects;

public class Customer {

	//Instance variable//class variables ---//class var are also called as Instance variable
	String name;
	int age;
	
	// Class variable and functions/methods are data members of class
	//As like class variables we can create methods also in the class
	
	//methods/functions are same ---which are used to perform some business logic/feature/Implementation of a feature/to perform Actions
	//how to create method-------------
	//1. we cannot create method inside method ie.. inside main() method we cannot create new method
	//2. but i call a method from another method  ie.. from main() method we can call others methods by using refernece variable
	//2. Methods are independent and parallel to each other
	
	// 3 types of methods we can create
	//methods are part/members of class
	//method name can be anything but should start with lowercase
	
	//1. No return and no input --no input means not supplying anything here--so this is zero parameter or non input parameter
	//void means cannot return anything --so not required return keyword when use void in the method
	
		public void testAutomation() { //0 parameter
		System.out.println("test method");//we can use void functions ---- 
									//click function,select checkbox,click on button,link,long button won't return anything 
		int i=10;
		System.out.println(i);
		}
		//2 .Some return and no input
		public int sum() { //0 parameter //void and return cannot be used at a time
			System.out.println("Sum Method"); //if we use void we cannot use return ,if we use return we cannot use void
			int a=10;
			int b=20;
			int c=a+b;
			return c; // 
		}
	
		public String getTrainerName() {
		System.out.println("getting training from NAL");
		String name="nv";
		int age=30;
		return name; //can we use two return keywords at a time --no we cannot use
		//return age; //return should be the last statement in the function
		}
		
		public short getNumber() {  //this is zero parameterized function
			System.out.println("Getting number");
			return 100;//we can directly call return keyword with value without storing in a variable
		}
		
		
		//3. some return and some input
		public int add(int a,int b) {//two integer variables//when we create function we pass input values --these are input parameters
			System.out.println("adding two numbers");
			int z=a+b;
			return z;
		}
		
		public int multiply(int a,int b) {
			System.out.println("Multiplication of two numbers");
			int z=a*b;
			return z;
			//or return a*b;
		}
		//we need to use parameters if we had passed the parameters 
		public double getTotalMarks(double score,int handWritingScore,int attendanceScore) {
			System.out.println("Total Marks");
			double d=score+handWritingScore+attendanceScore; //it always better to use parameters whichever we are passing
			return d;
			
		}
		
		public static void main(String[] args) { 
		//we cannot access data members in the main method directly without creating object of the class
		//As like how one photo copy of local variables given to object ,same way methods copy also given to object 
		//if we create 10 objects --10  copy of methods will be given and given to each object individually
		 
		Customer c1=new Customer();  //creating object of the class
		c1.name="esh"   ;//let call as access the variable
		c1.age=20;
		c1.testAutomation();//calling a function/method
		System.out.println("----");
		c1.testAutomation();//we can call a method/function n numbers of times according to requirement
		
		System.out.println("----------");
		int m=c1.sum(); //30 will be given to c1.sum ,so we need to store in a variable m
		System.out.println(m);
		//difference between SOP and return---SOP will print on the console and thats it
		//Advantage of return---whenever we are calling some function,we are getting something from the function ie ..m
		//which i want to use it later for other purpose i can use m like adding or subtracting 
		//from m without changing any code in the function (which will be common for all the objects)
		 
		System.out.println("................");
		String trName=c1.getTrainerName();
		System.out.println(trName+" "+"for java and slenium");
		if(trName.equals("nv")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
	//	System.out.println(c1.getNumber());//100 // calling method directly in Println is not good practice
		//if i want to add more value--- we need to call again and again the function
		//System.out.println(c1.getNumber()+5);we need to call again and again the function
		//System.out.println(c1.getNumber()+5+10);we need to call again and again the function
		//its better to call the function and store in it in a variable and use the variable n number of times
		short k1=c1.getNumber();
		System.out.println(k1+5);
		
		//System.out.println(c1.testAutomation());//we cannot directly call void function in the println --because it won't returns anything
		//we cannot use void functions in the println statement ---we get complie error
		
		int sum=c1.add(10, 20); //This is one to one mapping ie ..a=10,b=20
		System.out.println(sum);
		sum=c1.add(100, 200);//when we call the function and supplies values are----arguments
		System.out.println(sum);
		
		
		int mul=c1.multiply(20, 30);
		System.out.println(mul);
		
		
		double m2=c1.getTotalMarks(90, -5,-10);
		System.out.println(m2);
		
		
//	System.out.println(c1.getTrainerName()); 
//	// don't call the function directly----save it in a variable and use the variable wherever we want
//	String m1=c1.getTrainerName();
//	System.out.println(m1);
		
		
		
		
		
	}

}
