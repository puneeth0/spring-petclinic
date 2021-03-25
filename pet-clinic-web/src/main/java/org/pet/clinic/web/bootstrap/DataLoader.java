package org.pet.clinic.web.bootstrap;

import java.time.LocalDate;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.model.Pet;
import org.pet.clinic.data.model.PetType;
import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.service.OwnerService;
import org.pet.clinic.data.service.PetTypeService;
import org.pet.clinic.data.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final VetService vetService;
	private final OwnerService ownerService;
	private final PetTypeService petTypeService;

	public DataLoader( OwnerService ownerService,VetService vetService,PetTypeService petTypeService) {
		this.petTypeService = petTypeService;
		this.vetService = vetService;
		this.ownerService = ownerService;
	}

	@Override
	public void run(String... args) throws Exception {
		PetType dog= new PetType();
		dog.setName("Dog");
		PetType savedPetDog= petTypeService.save(dog);
		
		PetType cat= new PetType();
		dog.setName("cat");
		PetType savedPetCat= petTypeService.save(cat);
		
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
		ranjiPet.setPetType(savedPetCat);
		ranjiPet.setOwner(owner2);
		ranjiPet.setBirthDate(LocalDate.now());
		ranjiPet.setName("tony");
		owner2.getPets().add(ranjiPet);
		ownerService.save(owner2);

		System.out.println("owner loaded");

		Vet vet1 = new Vet();
		vet1.setFirstName("Rajesh");
		vet1.setLastName("Singh");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Ramesh");
		vet2.setLastName("Singh");
		vetService.save(vet2);

		System.out.println("vet loaded");
	}

}
