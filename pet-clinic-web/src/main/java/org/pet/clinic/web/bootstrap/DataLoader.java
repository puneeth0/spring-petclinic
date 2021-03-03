package org.pet.clinic.web.bootstrap;

import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.model.Vet;
import org.pet.clinic.data.service.OwnerService;
import org.pet.clinic.data.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final VetService vetService;
	private final OwnerService ownerService;

	public DataLoader( OwnerService ownerService,VetService vetService) {
		this.vetService = vetService;
		this.ownerService = ownerService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("Puneeth");
		owner1.setLastName("Kumar");
		owner1.setId(1l);
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Ranjith");
		owner2.setLastName("Kumar");
		owner2.setId(2l);
		ownerService.save(owner2);

		System.out.println("owner loaded");

		Vet vet1 = new Vet();
		vet1.setFirstName("Rajesh");
		vet1.setLastName("Singh");
		vet1.setId(1l);
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Ramesh");
		vet2.setLastName("Singh");
		vet2.setId(2l);
		vetService.save(vet2);

		System.out.println("vet loaded");
	}

}
