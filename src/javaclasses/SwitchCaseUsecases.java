package javaclasses;

public class SwitchCaseUsecases {

	public static void main(String[] args) {
		// aeiou---vowels
		// other that above characters all are consonents
//------------vowel or consonnet---------------------
		char alphabet = 'p';
		switch (alphabet) {
		case 'a': // if given 'a' check for case a ,if finds directly jump to case 'a' without
					// checking others cases ,print
					// and break the loop ,if not find case 'a' ,directly jump to default case .
			System.out.println(alphabet + " " + "char is vowel");
			break;
		case 'e':
			System.out.println(alphabet + " " + "char is vowel");
			break;
		case 'i':
			System.out.println(alphabet + " " + "char is vowel");
			break;
		case 'o':
			System.out.println(alphabet + " " + "char is vowel");
			break;
		case 'u':
			System.out.println(alphabet + " " + "char is vowel");
			break;
		default:// if given p directly comes to default case and print the statement and break
				// the loop
			System.out.println(alphabet + " " + "char is consonent");
			break;
		}
//-------Environment-----------------------

		String envName = "DEV ";
		// 1.If we pass uppercase alpahbets were cases are mentioned in lower case dev
		// it goes for default case as it
		// cannot match uppercase DEV--so to avoid this we use toLowercase() method
		// 2.Similarly if we give space DEV then also it goes to default case as it
		// cannot match space after value DEV---
		// to avoid this we use trim()
		switch (envName.trim().toLowerCase()) {
		case "dev":
			System.out.println("run on Dev Environment");
			break;
		case "qa":
			System.out.println("run on qa Environment");
			break;
		case "stage":
			System.out.println("run on stage Environment");
			break;
		case "uat":
			System.out.println("run on uat Environment");
			break;
		case "prod":
			System.out.println("run on prod Environment");
			break;

		default:
			System.out.println("No Environment matches..." + envName);
			break;
		}
//--------------------Booking Auto----------------
		String carType = "auto";
		int persons = 5;
		switch (carType) {
		case "mini":
			System.out.println("mini got booked");
				if(persons<=4) {
					System.out.println("accept");
				  }
					else {
						System.out.println("Ignore");
					}
				break;
		case "sedan":
			System.out.println("sedan got booked");
			if (persons >= 1) {
				switch (persons) {//we can write switch case in if condition then it becomes nested switch
				case 1:
					System.out.println("Accept booking if 1 person ");
					break;
				case 2:
					System.out.println("Accept booking if 2 person ");
					break;
				case 3:
					System.out.println("Accept booking if 3 person ");
					break;
				case 4:
					System.out.println("Accept booking if 4 person ");
					break;
				default:
					System.out.println("no persons accepted");
					break;
				}
			}
			break;
		case "auto":
			System.out.println("auto got booked");
			break;

		default:
			System.out.println("Booking got cancelled");
			break;
		}
//------------------Loan Type--------------------
		String loanType="loan";
		int amount=10000;
		switch (loanType.toLowerCase()) {
		case "homeloan":
			System.out.println("Home loan applied ");
				if(amount>100000) {
					System.out.println("Home loan granted");
				}
				else {
					System.out.println("home loan got cancelled");
				}
			break;
		case "carloan":
			System.out.println("carloan loan applied ");
			break;
		case "educationloan":
			System.out.println("education loan applied ");
			break;
		case "personalloan":
			System.out.println("personal loan applied ");
			break;
		default:
			System.out.println("Loan not applied");
			break;
		}

	}

}
		//switch case usecases---real time examples---where cases are fixed we can go
		// for switch case
		// 1.Environment ---dev/Test Server/Live Server---dev/qa/stage/uat/prod
		// 2.Cross Browser Testing---Chrome/Edge/Firefox/Safari
		// 3.Number of Days in week/Number of month in year
		// 4.Booking app--car type ---Uber,Ola---Mini,Ola,
		// 5.User Based Permissions (RBAC-Role Based Access
		// Permission)---Admin,Customer,Seller,Partner,Vendor,Distributor
		// Lis-National,Auditor,RSM,ASM,SO
		// 6. Run test Cases-Sanity,Smoke,Regression ,Live test cases
		// 7.Run test cases on local machine or cloud or remote machine