package Acc2;

import Acc1.Car;

//Access Modifiers in Different Package with SubClass
public class Audi extends Car{   //extending Car giving error because Car is coming from other package we need to import

	public static void main(String[] args) {

		Audi a=new Audi();
//		a.name; ---- public allowed
//		a.price; ------Protected allowed
//		a.color;   ---default not allowed
//		a.Milege; ---Private not allowed


	}

}
