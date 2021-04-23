package org.pet.clinic.web.bootstrap;

import java.time.LocalDate;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.model.PetType;
import org.pet.clinic.data.model.Speciality;
import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.model.Visit;
import org.pet.clinic.data.repository.VisitRepository;
import org.pet.clinic.data.service.OwnerService;
import org.pet.clinic.data.service.PetTypeService;
import org.pet.clinic.data.service.SpecialityService;
import org.pet.clinic.data.service.VetService;
import org.pet.clinic.data.service.VisitService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {

	private final VetService vetService;
	private final OwnerService ownerService;
	private final PetTypeService petTypeService;
	private final SpecialityService SpecialityService;
	private final VisitService visitService; 
	public DataLoader( OwnerService ownerService,VetService vetService,PetTypeService petTypeService,SpecialityService SpecialityService,VisitService visitService) {
		this.visitService = visitService;
		this.SpecialityService = SpecialityService;
		this.petTypeService = petTypeService;
		this.vetService = vetService;
		this.ownerService = ownerService;
	}

	@Override
	public void run(String... args) throws Exception {
		if(petTypeService.findall().size()==0) {
		dataLoader();
		log.debug("data loaded");
		}
	}

	private void dataLoader() {
		PetType dog= new PetType();
		dog.setName("Dog");
		PetType savedPetDog= petTypeService.save(dog);
		
		PetType cat= new PetType();
		cat.setName("cat");
		PetType savedPetCat= petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("radiology");
		Speciality savedRadiology=SpecialityService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("surgery");
		Speciality savedSurgery=SpecialityService.save(surgery);
		
		Speciality dentist = new Speciality();
		dentist.setDescription("dentist");
		Speciality savedDentist=SpecialityService.save(dentist);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Puneeth");
		owner1.setLastName("Kumar");
		owner1.setAddress("123 mg road ");
		owner1.setCity("bangalore");
		owner1.setTelephone("123456");
		
		Pet puneethPet=new Pet();
		puneethPet.setPetType(savedPetDog);
		puneethPet.setOwner(owner1);
		puneethPet.setBirthDate(LocalDate.now());
		puneethPet.setName("tommy");
		owner1.getPets().add(puneethPet);
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Ranjith");
		owner2.setLastName("Kumar");
		owner2.setAddress("123 mg road ");
		owner2.setCity("bangalore");
		owner2.setTelephone("123456");
		
		Pet ranjiPet=new Pet();
		ranjiPet.setName("tony");
		ranjiPet.setOwner(owner2);
		ranjiPet.setBirthDate(LocalDate.now());
		ranjiPet.setPetType(savedPetCat);
		owner2.getPets().add(ranjiPet);
		ownerService.save(owner2);
		
		Visit catVisit= new Visit();
		catVisit.setPet(ranjiPet);
		catVisit.setDate(LocalDate.now());
		catVisit.setDescription("Sneezy Cat");
		
		visitService.save(catVisit);
		System.out.println("owner loaded "+catVisit);

		Vet vet1 = new Vet();
		vet1.setFirstName("Rajesh");
		vet1.setLastName("Singh");
		vet1.getSpecialities().add(savedDentist);
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Ramesh");
		vet2.setLastName("Singh");
		vet2.getSpecialities().add(savedRadiology);
		vetService.save(vet2);
		
		System.out.println("vet loaded");
	}

}
