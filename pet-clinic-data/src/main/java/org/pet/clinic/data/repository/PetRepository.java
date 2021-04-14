package org.pet.clinic.data.repository;

import org.pet.clinic.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
