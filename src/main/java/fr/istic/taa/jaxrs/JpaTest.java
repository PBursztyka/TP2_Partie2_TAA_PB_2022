package fr.istic.taa.jaxrs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import fr.istic.taa.jaxrs.domain.Compte;
import fr.istic.taa.jaxrs.domain.Etudiant;
import fr.istic.taa.jaxrs.domain.Professeur;
import fr.istic.taa.jaxrs.domain.RDV;
import fr.istic.taa.jaxrs.dao.generic.CompteDao;
import fr.istic.taa.jaxrs.dao.generic.EntityManagerHelper;
import fr.istic.taa.jaxrs.dao.generic.EtudiantDao;
import fr.istic.taa.jaxrs.dao.generic.ProfesseurDao;
import fr.istic.taa.jaxrs.dao.generic.RDVDao;

public class JpaTest {
	
	private EntityManager manager;
	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		 EntityManagerFactory factory = Persistence
				 .createEntityManagerFactory("mysql");
		 
		EntityManager manager = EntityManagerHelper.getEntityManager();
		
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();

		CompteDao comptedao = new CompteDao();
		Compte c = new Compte();
		c.setLogin("compte1");
	
				
		
		EtudiantDao etudiantdao = new EtudiantDao();
		Etudiant et = new Etudiant();
		et.setLogin("etudiant1");
		
		
		ProfesseurDao professeurdao = new ProfesseurDao();
		Professeur p = new Professeur();
		p.setLogin("professeur1");
		
		
		RDVDao rdvdao = new RDVDao();
		RDV r = new RDV();
			
		
		
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
				factory.close();
	}


}
