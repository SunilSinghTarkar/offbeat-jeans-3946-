package com.masai.service;

import com.masai.entity.Candidate;
import com.masai.exception.SomeThingWentWrongException;

public interface CandidateService {
	
 void addCandidate(Candidate candidate)throws SomeThingWentWrongException;
	 
}
