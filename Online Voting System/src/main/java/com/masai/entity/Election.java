package com.masai.entity;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
	public class Election {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long electionId;
	    private String title;
	    private String description;
	    private LocalDate startDate;
	    private LocalDate endDate;
	    
	    @ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(name = "Candidate_Eclection", 
					joinColumns = {@JoinColumn(referencedColumnName = "electionId")},
					inverseJoinColumns = {@JoinColumn(referencedColumnName = "candidateId")})
	    Set<Candidate> candidate;
	    
		public Election(){
			super();
			
		}

		public Election(String title, String description, LocalDate startDate, LocalDate endDate,
				Set<Candidate> candidate) {
			super();
			this.title = title;
			this.description = description;
			this.startDate = startDate;
			this.endDate = endDate;
			this.candidate = candidate;
		}
		public Long getElectionId() {
			return electionId;
		}
		public String getTitle() {
			return title;
		}
		public Set<Candidate> getCandidate() {
			return candidate;
		}

		public void setCandidate(Set<Candidate> candidate) {
			this.candidate = candidate;
		}

		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public LocalDate getStartDate() {
			return startDate;
		}
		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}
		public LocalDate getEndDate() {
			return endDate;
		}
		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}
}
