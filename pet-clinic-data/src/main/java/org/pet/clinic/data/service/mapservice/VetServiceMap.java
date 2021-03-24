package org.pet.clinic.data.service.mapservice;

import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.service.CrudService;
import org.pet.clinic.data.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService{
	
}
