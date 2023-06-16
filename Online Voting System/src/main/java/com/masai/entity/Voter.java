package com.masai.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Voter {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long voterId;
	  
	    private String voterName;
	    @Column(unique = true, length = 50, nullable = false)
	    private String username;
	    @Column(nullable = false, length = 50)
	    private String password;
	    private String address;
		@Column(name = "date_of_birth", nullable = false)
		private LocalDate dateOfBirth;
	    private int isDeleted;
		public Voter() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	    
}
