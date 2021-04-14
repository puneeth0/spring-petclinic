package org.pet.clinic.data.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.repository.OwnerRepository;
import org.pet.clinic.data.repository.PetRepository;
import org.pet.clinic.data.repository.PetTypeRepository;
import org.pet.clinic.data.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springownerjpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findall() {
		Set<Owner> owner = new HashSet<Owner>();
		ownerRepository.findAll().forEach(owner::add);
		return owner;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		ownerRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		ownerRepository.deleteById(id);

	}

	@Override
	public Owner findByLastName(String lname) {
		// TODO Auto-generated method stub
		return ownerRepository.findByLastName(lname);
	}

}
