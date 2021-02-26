package org.pet.clinic.data.service.mapservice;

import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.service.CrudService;

public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements CrudService<Vet, Long>{

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}
	

}
