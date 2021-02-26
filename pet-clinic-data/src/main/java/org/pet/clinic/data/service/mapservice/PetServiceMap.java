package org.pet.clinic.data.service.mapservice;

import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.service.CrudService;

public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements CrudService<Pet, Long>{

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(), object);
	}

}
