package assignment;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		System.out.println("Please enter the deparment:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		CredentialService credService = new CredentialService();
		Employee emp = new Employee("Harshit", "Mehta");
		
		credService.showCredentials(emp, input);
		
	}
}
