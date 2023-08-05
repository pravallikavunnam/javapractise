package encapsulation;

public class Register {
	
	//Encapsulation : private +public ---encapsulation means both private and public should be there
	//when you create page classes -we have to follow encapsulation
	//all BY locator are private only ---because any one can create object and manipulate data 
	//this class is called as POJO Class--Plain Old Java Object;
	//POJO Class cannot be the child of any class
	//POJO class can have private var ,public constructor,public getter and setter methods
	//if we want to prevent further updates then we can skip setter emthods in the class
	
	private String name;
	private int age;
	private long phoneNumber;
	private String city;
	private boolean isPerm;
	
	//creating constructor  --if constructor is private we cannot create the object 
	//constructor behaves like setter setting the values in one line
	//what is the use of constructor-----restrict the unnecessary object creation
	public Register(String name, int age, long phoneNumber, String city, boolean isPerm) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.isPerm = isPerm;
	}
	
	//creating another constructor with name and phoneNumber
	
	public Register(String name, long phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	

	//create getter and setter methods ---should be always public 
	//Once after private class variables got initialized can be accessed by get methods anytime
	
	//is it mandatory to write setter ?--No, we can set the values using constructor also
	//Getter is mandatory because we get the values with the help of getter only
	
	//what is the use of setters?---Importance of setter is to update values with the help of setter only
	//setter can be used for checks also---like validation 
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>=30) {
			this.age = age;
		}
		
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	
	
	
	
	
	
	
}
