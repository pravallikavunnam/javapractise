package classandobjects;

public class Student {

	//class variables/Template variables
	//String name="Tom";----Each student will have different name so we cannot declare class variables or pass values to class var
	//let each object decide thier name ,age .....................
	String name;
	int marks;
	char grade;
	
	//String name="ps";don't initialize variable inside the class

	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="Tom";
		s.marks=90;
		s.grade='A';
		
		Student s1=new Student();
		s1.name="Jack";
		s1.marks=90;
		s1.grade='B';
		
		Student s2=new Student();
		s2.name="Rose";
		s2.marks=80;
		s2.grade='C';

		System.out.println(s.name+" "+s.marks+" "+s.grade); //Printing respective values
		System.out.println(s1.name+" "+s1.marks+" "+s1.grade);
		System.out.println(s2.name+" "+s2.marks+" "+s2.grade);
		
		System.out.println(s); //we should not print reference name directly ---It gives address of that reference var in memory
		
			//three objects
				//Student s=new Student();
				//Student s1=new Student();
				//Student s2=new Student();
				//Three template variables
				//String name;
				//int marks;
				//char grade;
		
		//java memory is divided into two major parts---we have other memory part also
		//1.Heap memory   --whatever we created objects in heap memory--each object receives copy of local variables
		//2. Stack memory ---references s,s1,s2 will be stored in stack memory--which starts pointing their respective objects
		//3.if we want to access or want to give name s1.name="tom"
		
		
		//****create an object without reference variable
		new Student(); //yes we can like new born baby has no name
		//for above object also java will give copy of local variables in the heap memory
		//how will define the values without reference variable
		new Student().name="kp"; //for each declaration object gets created
		new Student().marks=100; //for each declaration object gets created  ---which is a bad practice--which need to be avoided
		
		//**create only reference variable without object--another way of creating object
		Student s4; //the moment we initialize s4 --it will be stored in stack memory
		s4=new Student();
		s4.name="Rose";
		
		Student s5=new Student();
		s5=null;
		s5.name="tb";
		System.out.println(s5);//gives -----NullPointerException
		
		//Garbage Collector(GC): The purpose of GC is to destroy some of the objects inside the heap memory to allocate some from size 
		//JVM Will keep monitoring the heap size , If JVM feels like heap size is getting Increased where no much space left in Heap memory
		//JVM will instruct the garbage collector --go to heap and destroy objects 
		//GC will destroy only those objects which have no reference and null reference as per JVM instructions
		//GC always dependent on JVM.
		//the scope of GC is only for heap memory ,it cannot go for stack memory
		
		//If we want to call garbage collector programmatically
		//System.gc();----we see this method with finalize() method
		//even if we call system.gc()-GC will not get activated as soon as we call this method--GC will check with JVM to go to heap memory
		
		
		//what if heap memory got full with objects with have references --GC cannot destro them ---thats why we see in production
		//App crashs,memory leakage[don't have enough space left inside the memory]
		//but these days we are moving on cloud ,updating RAM size at runtime,AWS we are moving,at runtime they add more hardware 
		
		//we cannot get list of how many objects deleted ,how many objects are there without reference
		
	}
	

}