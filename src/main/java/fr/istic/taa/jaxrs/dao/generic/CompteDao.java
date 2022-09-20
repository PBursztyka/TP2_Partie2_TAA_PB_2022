package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Compte;


public class CompteDao extends AbstractJpaDao<String, Compte> {
		
	public CompteDao() {
		super(Compte.class);
	} 

}
