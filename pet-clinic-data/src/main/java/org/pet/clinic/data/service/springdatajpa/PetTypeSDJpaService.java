package org.pet.clinic.data.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.model.PetType;
import org.pet.clinic.data.repository.PetTypeRepository;
import org.pet.clinic.data.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springownerjpa")
public class PetTypeSDJpaService implements PetTypeService{

	private final PetTypeRepository petTypeRepository;
	
	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findall() {
		Set<PetType> petType = new HashSet<PetType>();
		petTypeRepository.findAll().forEach(petType::add);
		return petType;
	}

	@Override
	public PetType findById(Long id) {
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType object) {
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		petTypeRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {	
		petTypeRepository.deleteById(id);
	}
	
}
