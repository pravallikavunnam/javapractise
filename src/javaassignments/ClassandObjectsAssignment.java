package javaassignments;

import classandobjects.Student;

public class ClassandObjectsAssignment {

	String name;
	int marks;
	char sec;
	
	public static void main(String[] args) {
		
		ClassandObjectsAssignment s1=new ClassandObjectsAssignment();
		s1.name="Esh";
		s1.marks=80;
		s1.sec='A';
		
		ClassandObjectsAssignment s2=new ClassandObjectsAssignment();
		s2.name="Pa";
		s2.marks=75;
		s2.sec='B';
		
		ClassandObjectsAssignment s3=new ClassandObjectsAssignment();
		s3.name="PC";
		s3.marks=98;
		s3.sec='C';
		
		ClassandObjectsAssignment s4=new ClassandObjectsAssignment();
		s4.name="Pandu";
		s4.marks=60;
		s4.sec='D';
		
		System.out.println(s1.name+" "+s1.marks+" "+s1.sec);//Esh
		System.out.println(s2.name+" "+s2.marks+" "+s2.sec);//Pa
		System.out.println(s3.name+" "+s3.marks+" "+s3.sec);//PC
		System.out.println(s4.name+" "+s4.marks+" "+s4.sec);//Pandu

		System.out.println("--------------");
		s1=s2;
		System.out.println(s1.name+" "+s1.marks+" "+s1.sec);//Pa
		System.out.println(s2.name+" "+s2.marks+" "+s2.sec);//Pa
		System.out.println(s3.name+" "+s3.marks+" "+s3.sec);//PC
		System.out.println(s4.name+" "+s4.marks+" "+s4.sec);//Pandu
		System.out.println("--------------");
		s2=s3;
		System.out.println(s1.name+" "+s1.marks+" "+s1.sec);//Pa
		System.out.println(s2.name+" "+s2.marks+" "+s2.sec);//PC
		System.out.println(s3.name+" "+s3.marks+" "+s3.sec);//PC
		System.out.println(s4.name+" "+s4.marks+" "+s4.sec);//Pandu
		System.out.println("--------------");
		s3=s4;
		System.out.println(s1.name+" "+s1.marks+" "+s1.sec);//Pa
		System.out.println(s2.name+" "+s2.marks+" "+s2.sec);//PC
		System.out.println(s3.name+" "+s3.marks+" "+s3.sec);//Pandu
		System.out.println(s4.name+" "+s4.marks+" "+s4.sec);//Pandu
		System.out.println("--------------");
		s4=s1;
		System.out.println(s1.name+" "+s1.marks+" "+s1.sec);//Pa
		System.out.println(s2.name+" "+s2.marks+" "+s2.sec);//PC
		System.out.println(s3.name+" "+s3.marks+" "+s3.sec);//Pandu
		System.out.println(s4.name+" "+s4.marks+" "+s4.sec);//Pa
		System.out.println("--------------");
		
		
	}

}
