package org.pet.clinic.data.service;

import java.util.Set;

import org.pet.clinic.data.model.Owner;

public interface OwnerService {
	Owner findById(Long id);

	Set<Owner> findAll();

	Owner save(Owner owner);
	
	Owner findByLastName(String lname);

}
