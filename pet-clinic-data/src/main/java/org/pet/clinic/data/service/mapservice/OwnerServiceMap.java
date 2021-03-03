package org.pet.clinic.data.service.mapservice;

import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.service.CrudService;
import org.pet.clinic.data.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap  extends AbstractServiceMap<Owner,Long> implements OwnerService {

	@Override
	public Owner save(Owner object) {
		
		return super.save( object);
	}

	@Override
	public Set<Owner> findall() {

		return super.findall();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lname) {
		// TODO Auto-generated method stub
		return null;
	}

 
}
