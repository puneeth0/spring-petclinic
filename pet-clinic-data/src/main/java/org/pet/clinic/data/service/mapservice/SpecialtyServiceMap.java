package org.pet.clinic.data.service.mapservice;

import java.util.Set;

import org.pet.clinic.data.model.Speciality;
import org.pet.clinic.data.service.SpecialitiesService;

public class SpecialtyServiceMap extends AbstractServiceMap<Speciality, Long> implements SpecialitiesService {

	@Override
	public Set<Speciality> findall() {
		return super.findall();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		return super.save(object);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
