package org.pet.clinic.data.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.pet.clinic.data.model.Visit;
import org.pet.clinic.data.repository.VisitRepository;
import org.pet.clinic.data.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService{
	private final VisitRepository VisitRepository;
	

	public VisitSDJpaService(org.pet.clinic.data.repository.VisitRepository visitRepository) {
		super();
		VisitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findall() {
		Set<Visit> visits = new HashSet<Visit>();
		VisitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		return VisitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		return VisitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		VisitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		VisitRepository.deleteById(id);
	}

}
