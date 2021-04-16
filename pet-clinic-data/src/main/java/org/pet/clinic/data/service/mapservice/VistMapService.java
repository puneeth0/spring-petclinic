package org.pet.clinic.data.service.mapservice;

import java.util.Set;

import org.pet.clinic.data.model.Visit;
import org.pet.clinic.data.service.VisitService;
import org.springframework.stereotype.Service;

@Service
public class VistMapService extends AbstractServiceMap<Visit, Long> implements VisitService {

	@Override
	public Set<Visit> findall() {
		return super.findall();
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit) {
		if(visit.getPet()==null||visit.getPet().getOwner()==null||visit.getPet().getId()==null||visit.getPet().getOwner().getId()==null) {
			throw new RuntimeException("Invalid visit");
		}
		return super.save(visit);
	}

	@Override
	public void delete(Visit object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
