package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.Etudiant;

public class EtudiantDao extends AbstractJpaDao<String, Etudiant> {
	
	public EtudiantDao() {
		super(Etudiant.class);
	} 

}
	



