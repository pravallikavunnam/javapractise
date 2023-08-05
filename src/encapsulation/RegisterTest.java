package encapsulation;

public class RegisterTest {

	public static void main(String[] args) {

		//behaves like POST CALL-----Create User
		Register reg=new Register("Rose", 25, 1234567891L, "Pune", true); //need to pass parameters defined in the constructor
		
		//behaves like GET CALL----checking user profile for first time 
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		System.out.println(reg.getCity());
		System.out.println(reg.isPerm());
		
		//what is the use of setters?---Importance of setter is 
		//to update values with the help of setter only
		
		//behaves like PUT CALL---UPDATE the values
//		reg.setCity("Bangalore");
//		reg.setPhoneNumber(1234567812L); //After updating two values we check the user profile once then we get updated values
		//behaves like GET CALL----checking user profile after updating
		System.out.println(reg.getName());
		System.out.println(reg.getAge());
		System.out.println(reg.getPhoneNumber());
		System.out.println(reg.getCity());
		System.out.println(reg.isPerm());
		
		System.out.println("----------------------");
		Register reg1=new Register("Rose", 8332847374L);
		System.out.println(reg1.getName());
		System.out.println(reg1.getPhoneNumber());
		System.out.println(reg1.getCity());
	}

}
