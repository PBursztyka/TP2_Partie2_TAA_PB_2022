package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.RDV;

public class RDVDao extends AbstractJpaDao<Long, RDV> {
		
	public RDVDao() {
		super(RDV.class);
	} 

}

