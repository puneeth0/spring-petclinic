package org.pet.clinic.data.repository;

import org.pet.clinic.data.model.Owner;
import org.springframework.data.repository.CrudRepository;
import java.lang.String;
import java.util.Optional;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
		Owner findByLastName(String lastname);
}
