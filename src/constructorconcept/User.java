package constructorconcept;

public class User {
	String name;
	int age;
	String city;
	double salary;
	char gender;
	boolean isActive;
	
	//what is the difference between function and method
	
	//create a default constructor ----so whenever n number of objects are created default constructor will be called
//	public User() {  //what if default constructor is not defined?
//		
//	}
	
	
	//what if user says to give name and age
	//then by using this name and age am defining one constructor
//	public User(String lname,int lage) { //these are local variables which are available inside the constructor
//		name=lname;                     //change the name of local variables and assign to class variables
//		age=lage;                       //Tom will be given to name and 30 will be given to age
//		
//		//what if we have more parameters then we need to change all parameters names to assign to class variables
//		//I want all my class variables and constructor variables to be same without any erroe ---so for this we use This keyword
//	}
	
	public User(String name,int age) { //these are local variables which are available inside the constructor
		this.name=name;                     //change the name of local variables and assign to class variables
		this.age=age;                       //Tom will be given to name and 30 will be given to age
		
		//this.name is class variable 
		//name is local variable
		
		//with the help of this keyword have initialized name and age  tom and 30 will be given to local from local to global variable
		
		//what if we have more parameters then we need to change all parameters names to assign to class variables
		//I want all my class variables and constructor variables to be same without any error ---so we use this keyword
		//with the help if this keyword i can access all my class variables this.name=name(this.global variable=local variable)
		
		
		//can i create random object of this class?        ----no
		//can i create default constructor of this class?  -----No
		//we have restricted ---it is good practice to restrict
		//Exam : in amazon without user experience if user create an account --it will be fake account because no information about user
		//i really want to 1. restrict of object creation that is main purpose of constructor
		//2. constructor is also helping us to initialize global variable with the help of this keyword\
		
	}
	//suppose we have another i have name ,age and city
		public User(String name,int age,String city) { 
		this.name=name;                     
		this.age=age; 
		this.city=city;
		}	 //now how many types of objects i can create 
	
	//this constructor will restrict the user to create unnecessary objects
	//we have given restriction only one constructor is allowed so far right now,,,i am deliberately not defining  any default constructor at all
	//whenever you want to create an object the respective constructor will be called 
	//but now we have restricted the object that if you have name and age only create constructor or else not
	//if we supply name and age then respective constructor will be called---Tom will be given to lname and 30 will be given to lage
	
		
		/*------------------//Right Click->Source->Generate Constructor using Fields->Deselect All---------------*/
		
		public User(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		
	
		public User(String name, String city, boolean isActive) {
		this.name = name;
		this.city = city;
		this.isActive = isActive;
	}
	
	
		public User(String name, int age, String city, double salary, char gender, boolean isActive) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.salary = salary;
		this.gender = gender;
		this.isActive = isActive;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	//	User u =new User(); //this is a default object without any parameter
				
		//object for first user
		User u1=new User("Tom",30); // as default constructor is not available --so whenever we create an object it ask for name and age
		//1. one object will be created User u1=new User("Tom",30);  
		//2. photocopy of name,age,salary,gender,city isActive will be given to object which is referred by u1
		//3. Tom will be given to name and 30 will be given to age because the respective constructor will be called
		
		System.out.println(u1.name+" "+u1.age); //it will give null,0 as output
												//u1 go to name and age and pick the values
												//do we have name and age values inside the object --No
												//the tom and 30 are given to local variables,local variables are not part of object 
												//because we have not initialized actual class variables
												//so now its constructor responsibility to give name to class variable which is given to local variable 
		//object for second user
		User u2=new User("Taru",30,"Pune");
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		
		//we have to create object for each user
		//if we have 500 user ,500objects we have to create ,every object is respective to user
		
		User u3=new User("Peter",20 , "Ban",2000, 'F', true);
		System.out.println(u3.name+" "+u3.salary+" "+u3.isActive);
	
	
	
	//purpose of the constructor is
	//1. Always helps to create object of the respective class
	//2. Restricts unnecessary object creation
	//3. Restricts unnecessary default object also
	//4. helps to initialize class variables for the respective object
	//5. No need to write u1.age="tom",u1.salary=2000,u1.age=20..............for multiple users,
	 //---whatever required you supply in the constructor 
	//constructor will help to initialize the value
	
	//how many times of user i can create for this application-----only two types of object
	//one object with name and age
	//other object with name ,age and city
	
	//suppose if other user says i have name,salary and gender info
	//we don't have any option available
	//to write n number of combinations of constructor --directly we can generate constructor
	//Right Click->Source->Generate Constructor using Fields->Deselect All
	//now we can take required combination
	
	
	//on what basis we create constructor   ----on the basis of the requirement
	//1.po will define the acceptance criteria
	//then dev create registration page for user
	//user registration page says create the user with required combinations 
	//1.name,age
	//2.name,age,city
	//3.name.city,gender,isActive ---based on the req we construct the constructor
	//A/c to acceptance criteria we should not create any user without any information---it should give error
//	User u5=new User();
//	Testing t=new Testing();//we get error -because declared with private keyword
//	Employee e1=new Employee(); //Employee class default constructor will be called,because we used public it can accessed by anyone from anywhere
	Testing.getApp();
	
	
	//System s=new System();
	System.gc(); //gc is static method //methodname getting called by classname then it is static method
	
	
		
	}
	
}
