package com.masai.ui;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Admin Login");
			System.out.println("2. Voter Login");
			System.out.println("3. Voter Registration");
			System.out.println("0. Exit");
			System.out.print("Enter Selection ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				adminLogin(sc);
				break;
			case 2:
//	    				voterLogin(sc);
				break;
			case 3:
//	    				voterRegistration(sc);
				break;
			case 0:
				System.out.println("Thanks for using the services");
				break;
			default:
				System.out.println("Invalid Selection, try again");
			}
		} while (choice != 0);
		sc.close();
	}

	static void adminLogin(Scanner sc) {
		System.out.print("Enter username ");
		String username = sc.next();
		System.out.print("Enter password ");
		String password = sc.next();
		if (username.equals("a") && password.equals("a")) {
			adminMenu(sc);
		} else {
			System.out.println("Invalid Username of Password");
		}
	}

	private static void adminMenu(Scanner sc) {
		int choice = 0;
		do {
			System.out.println("1. Add Candidate");
			System.out.println("2. Update Candidate");
			System.out.println("3. Delete Candidate");
			System.out.println("0. Logout");
			System.out.print("Enter Selection : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				AdminUi.candidateRegistration(sc);
				break;
			case 2:

				break;
			case 3:

				break;
			case 0:
				System.out.println("You are LogedOut!");
				break;
			default:
				System.out.println("Invalid Selection, try again");
			}
		} while (choice != 0);

	}
}
