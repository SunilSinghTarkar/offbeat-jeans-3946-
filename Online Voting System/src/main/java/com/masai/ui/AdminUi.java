package com.masai.ui;

import java.util.Scanner;

import com.masai.entity.Candidate;
import com.masai.exception.SomeThingWentWrongException;
import com.masai.service.CandidateService;
import com.masai.service.CandidateServiceImpl;


public class AdminUi {
	static void candidateRegistration(Scanner sc) {
//		private Election election;
//		private String candidateName;
//		private String partyName;
//		private String agenda;
//		private String background;
		//code to take input
		System.out.print("Enter candidateName ");
		String name = sc.next();
		System.out.print("Enter partyName ");
		String  partyName= sc.next();
		System.out.print("Enter Agenda ");
		String Agenda = sc.next();
		System.out.print("Enter Background ");
		String Background = sc.next();
		
		Candidate candidate=new Candidate();
		CandidateService candidateService = new CandidateServiceImpl();
		try {
			candidateService.addCandidate(candidate);
			System.out.println("Candidate added successfully");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex);
		}
	}
}
