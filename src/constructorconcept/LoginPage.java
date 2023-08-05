package constructorconcept;

public class LoginPage {
	
	String username;
	String password;
	
	//create constructor
	public LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	//when we try to create object of Login page please give username and password
	//we supply the username and password to respective username and password in your object
	//your object is ready now
	
	//but user says i want to check forgot password ,reset password
	
	//create another method
	public void doLogin() { //feature method --method means which is defining feature
			System.out.println("Login into application");
			System.out.println("Enter the username:"+username); //we can use username directly without creating the object 
			System.out.println("Enter the password:"+password);  //need to create only one object and methods can access
			System.out.println("user is logged in ");
			
	}
		public void resetPwd() {
		System.out.println("Reset Password");
		
	}
	
	
	
	
	

}
