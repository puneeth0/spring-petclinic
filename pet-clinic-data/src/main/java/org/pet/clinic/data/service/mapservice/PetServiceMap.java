package org.pet.clinic.data.service.mapservice;

import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.service.CrudService;
import org.pet.clinic.data.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","mapService"})
public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements PetService{
	
}
