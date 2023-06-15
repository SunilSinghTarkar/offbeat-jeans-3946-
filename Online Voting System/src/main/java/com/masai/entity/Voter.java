package com.masai.entity;

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
	    private String email;
	    private String password;
	    private String address;
	    private int isDeleted;
		public Voter() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Voter(String voterName, String email, String password, String address) {
			super();
			this.voterName = voterName;
			this.email = email;
			this.password = password;
			this.address = address;
		}
	    
	    
}
