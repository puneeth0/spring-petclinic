package org.pet.clinic.data.service.mapservice;

import java.util.Set;

import org.pet.clinic.data.model.Speciality;
import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.service.CrudService;
import org.pet.clinic.data.service.SpecialityService;
import org.pet.clinic.data.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","mapService"})
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService{
	
	private final SpecialityService specialityService;
	
	public VetServiceMap(SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}

	@Override
	public Set<Vet> findall() {

		return super.findall();
	}

	@Override
	public Vet findById(Long id) {

		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		if(object.getSpecialities().size()>0) {
			object.getSpecialities().forEach(
					speciality ->{
						if(speciality.getId()==null) {
							Speciality savedSpeciality=specialityService.save(speciality);
							speciality.setId(savedSpeciality.getId());
						}
					}
					
					);
		}
		return super.save(object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
		
	}
	
}
