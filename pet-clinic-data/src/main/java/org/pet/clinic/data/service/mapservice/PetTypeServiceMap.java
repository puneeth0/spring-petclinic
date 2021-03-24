package org.pet.clinic.data.service.mapservice;

import org.pet.clinic.data.model.PetType;
import org.pet.clinic.data.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends AbstractServiceMap<PetType, Long> implements PetTypeService{

}
