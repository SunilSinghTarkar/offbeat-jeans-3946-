package com.masai.ui;

import java.time.LocalDate;
import java.util.Scanner;

public class VoterUi {
 
	static void voterRegistration(Scanner sc) {
		
		    System.out.println("Enter Name:");
		    String name=sc.next();
		    System.out.println("Enter Username:");
			String username = sc.next();
			System.out.print("Enter password:");
			String password = sc.next();
			System.out.print("Enter date of birth ");
			LocalDate dateOfBirth = LocalDate.parse(sc.next());
			System.out.print("Enter Address:");
			String address = sc.next();
	}
}
