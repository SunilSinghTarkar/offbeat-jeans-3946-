package com.masai.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voteId;
    private Voter voter;
    private Election election;
    private Candidate candidate;
    private LocalDate voteDate;
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vote(Voter voter, Election election, Candidate candidate, LocalDate voteDate) {
		super();
		this.voter = voter;
		this.election = election;
		this.candidate = candidate;
		this.voteDate = voteDate;
	}
	public Long getVoteId() {
		return voteId;
	}
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	public Election getElection() {
		return election;
	}
	public void setElection(Election election) {
		this.election = election;
	}
	public Candidate getCandidate() {
		return candidate;
	}
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}
	public LocalDate getVoteDate() {
		return voteDate;
	}
	public void setVoteDate(LocalDate voteDate) {
		this.voteDate = voteDate;
	}
   

}

