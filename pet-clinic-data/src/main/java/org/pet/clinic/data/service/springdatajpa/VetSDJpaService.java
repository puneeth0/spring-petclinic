package org.pet.clinic.data.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.repository.VetRepository;
import org.pet.clinic.data.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

	private final VetRepository vetRepository;

	public VetSDJpaService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findall() {
		Set<Vet> vet = new HashSet<Vet>();
		vetRepository.findAll().forEach(vet::add);
		return vet;
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}

}
