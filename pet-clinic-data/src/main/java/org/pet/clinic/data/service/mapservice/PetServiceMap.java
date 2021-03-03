package org.pet.clinic.data.service.mapservice;

import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.service.CrudService;
import org.pet.clinic.data.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService{

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

}
