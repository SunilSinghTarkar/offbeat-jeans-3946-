package com.masai.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long candidateId;
	@ManyToOne
	private Election election;
	private String candidateName;
	private String partyName;
	private String agenda;
	private String background;

	public Candidate() {
		super();
		
	}

	public Candidate(Election election, String candidateName, String partyName, String agenda, String background) {
		super();
		this.election = election;
		this.candidateName = candidateName;
		this.partyName = partyName;
		this.agenda = agenda;
		this.background = background;
	}

	public long getCandidateId() {
		return candidateId;
	}

	public Election getElection() {
		return election;
	}

	public void setElection(Election election) {
		this.election = election;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

}
