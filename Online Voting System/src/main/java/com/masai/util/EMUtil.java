package com.masai.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMUtil {
	static EntityManagerFactory emf;
	
	 static{
		emf= Persistence.createEntityManagerFactory("CwProject");
	}
	 public static EntityManager getEntityManager() {
		 EntityManager em =emf.createEntityManager();
		 return em;
	 }
	
}
