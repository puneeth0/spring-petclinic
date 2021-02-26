package org.pet.clinic.data.service;


import org.pet.clinic.data.model.Owner;

public interface OwnerService extends CrudService<Owner,Long>{

		Owner findByLastName(String lname);

}
