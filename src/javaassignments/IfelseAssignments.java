package javaassignments;

public class IfelseAssignments {

	public static void main(String[] args) {
		// 1.Find out the greatest number out of four different given numbers:
		// 2.Write a Java program to test a number is positive or negative.

		// 3. WAP to check number is odd or even using If - Else
		int i = 349;
		if (i % 2 == 0) {
			System.out.println(i + " " + "is even number");
		} else {
			System.out.println(i + " " + "is odd number");
		}
		i++;

		// 4.WAP to check given alphabet character is Vowel or Consonant using Switch -
		// Case
		char c = 'p';
		switch (c) {
		case 'a':
			System.out.println(c + "" + " is vowel");
			break;
		case 'e':
			System.out.println(c + "" + "is vowel");
			break;
		case 'i':
			System.out.println(c + "" + "is vowel");
			break;
		case 'o':
			System.out.println(c + "" + "is vowel");
			break;
		case 'u':
			System.out.println(c + "" + "is vowel");
			break;
		default:
			System.out.println(c + "" + " is consonent");
			break;
		}

		// 5. WAP to run your test cases in a specific environment like: QA, Stage, Dev,
		// UAT, Prod using using Switch - Case
		String env = "dev";
		switch (env.trim()) {
		case "QA":
			System.out.println("QA Environment passed");
			break;
		case "Stage":
			System.out.println("Stage Environment passed");
			break;
		case "dev":
			System.out.println("Dev Environment passed");
			break;

		case "UAT":
			System.out.println("UAT Environment passed");
			break;

		case "Prod":
			System.out.println("Prod Environment passed");
			break;
		default:
			System.out.println("Please pass valid environment name:" + env);
			break;
		}

		// 6.WAP to book the specific type of car from the Uber app using Switch - Case.
		// Car Type: Mini, Sedan, SUV, Premium
		// If user passes wrong car type, print please select the right car type

		String carType = "Sedan";
		switch (carType) {
		case "Mini":
			System.out.println("Mini car got booked");
			break;
		case "Sedan":
			System.out.println("Sedan car got booked");
			break;
		case "SUV":
			System.out.println("SUV car got booked");
			break;
		case "Premium":
			System.out.println("Premium car got booked");
			break;
		default:
			System.out.println("Please select the right car type:" + " " + carType);
			break;
		}

		// 7.WAP to launch browsers using If-ElseIf 
		// Browser: Chrome/Firefox/IE/Safari
		// If user passes wrong browser, print please pass the right browser name

		System.out.println("-----------");
		String bName = "IE";
		if (bName.equals("Chrome")) {
			System.out.println("Chrome browser lauched");
		} 
		else if (bName.equals("Firefox")) {
			System.out.println("Firefox browser launched");
		} 
		else if(bName.equals("IE")) {
			System.out.println("IE browser launched");
		} 
		else if(bName.equals("Safari")) {
			System.out.println("Safari browser launched");
		} else {
			System.out.println("Please pass the right browser name:"+" "+bName);
		}
		
		//// 7.WAP to launch browsers using Switch
		// Browser: Chrome/Firefox/IE/Safari
		// If user passes wrong browser, print please pass the right browser name
		
		String brName="Chrome";
		switch (brName) {
		case "Chrome":
			 System.out.println("Chrome browser launched");
			 break;
		case "Firefox":
			 System.out.println("Chrome browser launched");
			 break;
		case "IE":
			 System.out.println("Chrome browser launched");
			 break;
		case "Safari":
			 System.out.println("Chrome browser launched");
			 break;
		default:
			System.out.println("Please pass the right browser :"+ " "+brName);
			break;
		}
		
		//8.WAP to define the interest rate on the basis of Loan type using Switch Case
		//Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		//For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
		
		String loanType="HousingLoan";
		int salary=40000;
		switch (loanType) {
		case "CarLoan":
			System.out.println("Car Loan applied");
			break;
		case "HousingLoan":
			System.out.println("House Loan applied");
				if(salary>=35000) {
					System.out.println("House loan got approved");
				}
				else {
					System.out.println("Not Applicable for housing loan");
				}
			
			break;
		case "personalLoan":
			System.out.println("Personal Loan applied");
			break;
		case "EducationLoan":
			System.out.println("Education Loan applied");
			break;

		default:
			System.out.println("please apply valid loan type:"+" "+loanType);
			break;
		}
		
	}
}
