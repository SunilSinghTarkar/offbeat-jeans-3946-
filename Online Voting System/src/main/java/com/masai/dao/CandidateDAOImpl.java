package com.masai.dao;

import com.masai.entity.Candidate;
import com.masai.exception.SomeThingWentWrongException;
import com.masai.util.EMUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CandidateDAOImpl implements CandidateDAO{

	static EntityManagerFactory emf;
	
	 static{
		emf= Persistence.createEntityManagerFactory("CwProject");
	}
	@Override
	public void addCandidate(Candidate candidate) throws SomeThingWentWrongException {
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			em = emf.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(candidate);
			et.commit();
			
			System.out.println("Candidate Added successfully");
			
		}catch(Exception ex) {
			et.rollback();
			ex.printStackTrace();
			throw new SomeThingWentWrongException("Unable to add ,please try again later");
		}finally {
			em.close();
		}
		
	}

}
