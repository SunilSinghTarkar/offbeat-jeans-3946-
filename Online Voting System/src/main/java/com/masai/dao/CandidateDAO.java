package com.masai.dao;

import com.masai.entity.Candidate;
import com.masai.exception.SomeThingWentWrongException;

public interface CandidateDAO {

	void addCandidate(Candidate candidate)throws SomeThingWentWrongException;
}
