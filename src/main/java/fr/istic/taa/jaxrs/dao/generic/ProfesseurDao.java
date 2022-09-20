package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Professeur;

public class ProfesseurDao extends AbstractJpaDao<Long, Professeur> {
		
	public ProfesseurDao() {
		super(Professeur.class);
	} 

}

