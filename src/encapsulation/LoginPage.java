package encapsulation;

public class LoginPage {
	
	private String username;
	private String password;
	
	//we should not write any login business logic they are used to set and get the values
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//for login business logic we create separate method
	public void doLogin() {
		System.out.println("Login with:"+username+" "+password);
	}


	

}
