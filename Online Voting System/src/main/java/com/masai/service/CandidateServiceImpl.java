package com.masai.service;

import com.masai.dao.CandidateDAO;
import com.masai.dao.CandidateDAOImpl;
import com.masai.entity.Candidate;
import com.masai.exception.SomeThingWentWrongException;

public class CandidateServiceImpl implements CandidateService {

	@Override
	public void addCandidate(Candidate candidate) throws SomeThingWentWrongException {
		CandidateDAO cdao = new CandidateDAOImpl();
		cdao.addCandidate(candidate);
		
	}

}
