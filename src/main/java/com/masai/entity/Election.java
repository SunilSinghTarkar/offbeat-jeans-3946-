package com.masai.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class Election {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long electionId;
	    private String title;
	    private String description;
	    private LocalDate startDate;
	    private LocalDate endDate;
		public Election(){
			super();
			
		}
		public Election(String title, String description, LocalDate startDate, LocalDate endDate) {
			super();
			this.title = title;
			this.description = description;
			this.startDate = startDate;
			this.endDate = endDate;
		}
		public Long getElectionId() {
			return electionId;
		}
		public String getTitle() {
			return title;
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
