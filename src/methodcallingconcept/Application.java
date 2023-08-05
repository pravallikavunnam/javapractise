package methodcallingconcept;

public class Application {

	// Non-Static Methods
	public void m1() {
		System.out.println("m1 method");
		m2(); //m1 method is calling m2 method
	}

	public void m2() {
		System.out.println("m2 method");
		m3(); //m2 method is calling m3 method
	}

	public void m3() {
		System.out.println("m3 method");
		m1();  //m3 method is calling m1 method  //loop will continue calling m1->m2->m3->m1->m2->m3................Stack Over flow error

	}

	// Static methods
	
	public static void t1() {
		System.out.println("t1 method");
		t2(); // we can call directly
	}

	public static void t2() {
		System.out.println("t3 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
		
	}
	

	public static void main(String[] args) {
		
		//creating object of Application class
		
		Application app=new Application();
		
		//if i want to call m1 method
		
		app.m1();
	}

}

//1.If we call methods n number of times infinitely -- like main method calling m1 --m1 calling m2 --m2 calling m3---m3 again calling m1 ---
	//----we get stack overflow error
//2.In memory we have two portions ---heap memory and stack memory
//3. Inside heap memory objects will be created
//4. whenever heap memory is full Garbage collector will come inside heap memory and destroy objects which has No reference or having null reference
//5. So for heap we have garbage collector mechanism -we have some memory de-allocation mechanism
//6. what about stack? --garbage collector cannot come into stack memory or into CMA
//STACK -means execution stack---whenever you are calling n number of methods --like main method calling m1 --m1 calling m2 --m2 calling m3

/*--------------------------like main method calling m1 --m1 calling m2 --m2 calling m3*/

//stack here is first its create one section/execution stack at runtime for main method
//it is not storing main method , its saying for executing main method it will take some space that space is stack space 
//it will take care about execution part 
//after main method, m1 method is getting m1 stack will be created
//after m1 method ,m2 method is getting m2 stack will be created 
//after m2 method,m3 method is getting m2 stack will be created ---total 4 stack will be created
//main method call m1 ,m1 calls m2,m2 calls m3--
//when we call methods like this which is called allocation of the memory for execution -it will keep creating some segments which are called as stacks--
//so first stack will be created for main --then m1 --m2 nd m3
//last called method will be m3 -once execution done of m3-inside the memory final method m3 will be deallocated from here ie..memory will be released
//once m3 released then next execution stack for m2 will be deleted then for m1 also ---this is called deallocation happening here
//once execution stack of main method also deleted -size of stack memory will be back to zero

/*-----------main method calling m1 --m1 calling m2 --m2 calling m3--m3 again calling m1 --m1 calling m2 continues calling infinitely--*/

//so when calling methods continuously --we will go out of the memory --no space will be left --stack is completely filled
//for every method there is a stack- keep creating numbers of stacks inside stack memory
//we are not deallocation space in above case ,we are just keep allocating - and finally going out of memory and java gives Stack overflow error
//this is not infinite loop ,this is infinite calling and keep on allocating memory inside the stack -we don't have any space left
//so it starts giving stack overflow error

/*------Create stack for below work flow---------*/
//login(username,password) ,search(product name) ,Add to cart(), Payment(cc) , Order (ID)

//Main method calls login method--so first allocate memory for main method
//main method is creating stack for login
//login method has username and password which are local variable stored inside login method
//username and password also will be stored inside same stack 
//search method --has productname variable
//for methods it will create separate stack ---but for variables inside that stack some memory will be allocated
//then we have Addto cart()
//then Payment()
//then OrderID().......How exactly memory will be allocated

//the final method is OrderID --Once OrderID method is executed it will be immediately deallocated --memory will be released
//then it will start coming in backward direction --after Order Id we have payment method,which will be deallocated 
//then we have addto cart ,which will be deallocated
//then search method,which will be deallocated
//then login method ,which will be deallocated
//then main method will be deallocated-----again back to size of stack memory is zero
//once execution of last method is done --deallocation will starts for same methods

//which is more complex?heap memory is complex when compared to stack complex

//Inside heap memory we are creating so many objects --for deallocating garbage collector is used in heap memory
//java has to write so many mechanism on what basis object will be destroyed and so many permutations and combinations has to check
//stack memory is very straight forward--call the methods,allocate the memory once methods are done --deallocate the memory
// ----no need to specific concept in stack memory
//heap memory further is divided into multiple parts


//-----The above concept is Execution Stack------
//on what basis execution stack is getting created --on basis of LIFO (Last In First Out]
//it means at the time of deallocation which method will be deallocated first?---last method

//Which Algorithm Java is using internally --Stack Algorithm
//so we called as Stack memory

//there are two types of algorithm
//1. Stack (LIFO)
//2. Queue (FIFO) ----Movie theater ticket line


//Methods will be created in heap or CMA(Common Memory Allocation)  
//Stack memory---methods execution memory---to execute methods also need space that space is stack space
//In Stack memory used for execution stack and object references and to store local variables--memory allocated
//Global variables(Class Variables) if static ---goes to CMA
//Global variables if non-static ---one copy will be given to each and every object in Heap memory
//local variables will always be stored in Stack memory

//In c language alloc() to allocate and malloc() to deallocate
//In c language it is not auto mechanism
//In c first we have to allocate separate memory ,need some space to execute the program and for deallocate also
//In java everything is automatic


//deallocation happens only for methods calling not for reference variables

//when we get stack overflow ?--it is not an exception ---it is memory error
//no space left in the memory and going out of the space

//we need more space inside Heap memory---it won't automatically destroys---need to wait for GC to destroy the objects
//we need less space in Stack memory ---once method execution id done automatic deallocation will be done--again memory will be zero


//Stack memory will be activated when we are running methods --if nothing is happening always stack will be zero
//In heap memory --GC will come only when its sees only less space is left and whenever its required but in stack once execution stack deallocation starts


//GC cannot clean anything neither in CMA nor in Stack memory
//upto JDK 1.6 CMA was part of Heap memory only but now seperate memory 


//Do we have any deallocation concept in CMA --No
//now CMA is dynamic memory --if we have so many static variable?---size will be grow dynamically --it will take space automatically from RAM
//but thats very rare case because static properties are always far less than when compared to non-static properties




