package org.pet.clinic.data.service.mapservice;

import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.service.CrudService;
import org.pet.clinic.data.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap  extends AbstractServiceMap<Owner,Long> implements OwnerService {

	@Override
	public Owner findByLastName(String lname) {
		// TODO Auto-generated method stub
		return null;
	}}
