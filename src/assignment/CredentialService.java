package assignment;

import java.util.Random;

public class CredentialService {
	public String generatePassword() {
		Random r = new Random();
		
		char lowerCaseChar = (char) (r.nextInt(26) + 'a');
		char upperCaseChar = (char) (r.nextInt(26) + 'A');
		char secondUpperCaseChar = (char) (r.nextInt(26) + 'A');
 		char specialChar = (char) (r.nextInt(15) + '!');
		int number = r.nextInt(200);
 		
		return "" + number + specialChar + + lowerCaseChar + upperCaseChar + secondUpperCaseChar;
	}
	
	public String generateEmailAddress(Employee emp, int inputDept) {
		String department = "";
		if (inputDept == 1) {
			department = "technical";
		}
		
		if (inputDept == 2) {
			department = "admin";
		}
		
		if (inputDept == 3) {
			department = "human resource";
		}
		
		if (inputDept == 4) { 
			department = "legal";
		}
		
		return emp.firstName + emp.lastName + "@" + department + ".company.com";
	}
	
	public void showCredentials(Employee emp, int inputDept) {
		System.out.println("Dear " + emp.firstName + " your generated credentials are as follows:");
		System.out.println("Email ---> " + this.generateEmailAddress(emp, inputDept));
		System.out.println("Password ---> " + this.generatePassword());
	}
}
