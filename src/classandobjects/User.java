package classandobjects;

public class User {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		
		User u1=new User();
		u1.name="Pandu";
		u1.age=30;
		u1.city="Hyd";
		
		User u2=new User();
		u2.name="Esh";
		u2.age=40;
		u2.city="Pune";
		
		User u3=new User();
		u3.name="PC";
		u3.age=20;
		u3.city="Ban";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Pandu
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //Esh
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //PC
		
		System.out.println("-----------------");
		
		u1=u2;   //u1 will break pointing to current object and start pointing to object where u2 is pointing 
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Esh
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //Esh
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //PC
		
		System.out.println("-----------------");
		u2=u3;
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Esh
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //PC
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //PC
		
		System.out.println("-----------------");
		
		u3=u1;
		System.out.println(u1.name+" "+u1.age+" "+u1.city); //Esh
		System.out.println(u2.name+" "+u2.age+" "+u2.city); //PC
		System.out.println(u3.name+" "+u3.age+" "+u3.city); //Esh
		
		
				
		
	}

}
