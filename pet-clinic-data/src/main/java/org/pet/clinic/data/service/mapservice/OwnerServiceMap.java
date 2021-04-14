package org.pet.clinic.data.service.mapservice;

import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.service.CrudService;
import org.pet.clinic.data.service.OwnerService;
import org.pet.clinic.data.service.PetService;
import org.pet.clinic.data.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService {

	private final PetService petService;
	private final PetTypeService petTypeService;

	public OwnerServiceMap(PetService petService, PetTypeService petTypeService) {
		super();
		this.petService = petService;
		this.petTypeService = petTypeService;
	}

	@Override
	public Owner findByLastName(String lname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Owner> findall() {
		// TODO Auto-generated method stub
		return super.findall();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		if (object != null) {
			if (object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						pet.setPetType(petTypeService.save(pet.getPetType()));
					} else {
						throw new RuntimeException("Pet type is required");
					}
					if (pet.getId() == null) {
						Pet savedPet = petService.save(pet);
						savedPet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		} else {
			return null;
		}

	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}
}
