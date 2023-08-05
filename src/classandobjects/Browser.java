package classandobjects;

import java.util.ArrayList;
import java.util.Arrays;

public class Browser {
	
	//WAF
	//getEmployeeDevices(String empName)
	//you have to collect all devices and return  ---can we return multiple values from the function--no we cannot
	//Return:ArrayList<String>
	
		public ArrayList<String> getEmployeeDevices(String empName) {
		System.out.println("getting the device List......"+ empName);
		empName=empName.trim().toLowerCase();
		ArrayList<String> devices=new ArrayList<String>();//vc=10,pc=0
			if(empName.equals("pc")) {
			//iPhone14,macbook bro,airtel sim,mouse
			devices.add("iphone14");
			devices.add("macbook bro");
			devices.add("airtel sim");
			devices.add("mouse");
			}
		else if(empName.equals("esh")) {
			//samsung,mouse
			devices.add("samsung s13");
			devices.add("hp mouse");
			devices.add("airtel sim");
			devices.add("mouse");
		}
		else if(empName.equals("pa")) {
			//Mackbook air,Apple mouse,Apple keyboard
			devices.add("Mackbook air");
			devices.add("Apple mouse");
			devices.add("Apple keyboard");
		}
		else
	
		{
			System.out.println("Please pass correct employee name..."+empName);
		}
		return devices;
	}
		
		//Same example with Static Array ,ArrayList and Switch Case statement
		
		//same example with static array
		public String[] getEmpDevices(String empNames) {
		System.out.println("getting the device List......"+ empNames);
		String empDevices[]=new String[4];
	
			if(empNames.equals("pras")) {
				empDevices[0]="iPhone14";
				empDevices[1]="macbook bro";
				empDevices[2]="Airtel sim";
				empDevices[3]="mouse";
				
		}
			else if(empNames.equals("eshan")) {
			empDevices[0]="samsung s13";
			empDevices[1]="hp mouse";
			empDevices[2]="airtel sim";
			empDevices[3]="mouse";
			
			}
		else if(empNames.equals("arjun")) {
			empDevices[0]="Mackbook air";
			empDevices[1]="Apple mouse";
			empDevices[2]="Apple keyboard";
			empDevices[3]="mouse";
			}
		else {
			System.out.println("Please pass correct employee name..."+empNames);
			 return new String[0]; // return an empty array of String objects
			}
			return empDevices;
			
		}
	
		public static void main(String[] args) {
		Browser b=new Browser();
		ArrayList<String> pcDeviceList=b.getEmployeeDevices("jk");
		System.out.println(pcDeviceList);
		System.out.println("total number of devices.."+pcDeviceList.size());

		//are we returning single value/entity or multiple value/entity
		//function will always return single entity----we cannot return multiple entities or values
		//if we want to return store it in collection and return that collections
		//we are returning single arrayList
	
		System.out.println("-------------");
		
		String nameEmp[]=b.getEmpDevices("arjun");
		System.out.println(Arrays.toString(nameEmp));
		int length=nameEmp.length;
		System.out.println("total number of devices.."+length);
		
		}	
		
}

