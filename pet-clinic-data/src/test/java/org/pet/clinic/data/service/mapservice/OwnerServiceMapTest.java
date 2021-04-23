package org.pet.clinic.data.service.mapservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.pet.clinic.data.model.Owner;

@TestInstance(Lifecycle.PER_CLASS)
class OwnerServiceMapTest {

	OwnerServiceMap ownerServiceMap;

	final Long ownerId = 1L;
	final String lastName = "Smith";

	@BeforeEach
	void setUp() {
		ownerServiceMap = new OwnerServiceMap(new PetServiceMap(), new PetTypeServiceMap());

		ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
	}

	@Test
	void findByLastName() {
		Owner smith = ownerServiceMap.findByLastName(lastName);
		System.out.println("smith ");
		assertNotNull(smith);

		assertEquals(ownerId, smith.getId());

	}

	@Test
	void testFindall() {
		Set<Owner> owners = ownerServiceMap.findall();
		assertEquals(1, owners.size());
	}

	@Test
	void testFindByIdLong() {
		Owner owner = ownerServiceMap.findById(ownerId);
		assertNotNull(owner);
		assertEquals(ownerId, owner.getId());
	}

	@Test
	void testSaveOwnerExestingId() {
		Owner owner = Owner.builder().id(ownerId).lastName(lastName).build();
		Owner savesOwner = ownerServiceMap.save(owner);
		assertEquals(ownerId, savesOwner.getId());
	}

	@Test
	void testSaveOwnerWithoutId() {
		Owner savesOwner = ownerServiceMap.save(Owner.builder().build());
		assertNotNull(savesOwner.getId());
		assertNotNull(savesOwner.getLastName());
	}

	@Test
	@Disabled
	void testDeleteOwner() {
		ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
		assertEquals(0, ownerServiceMap.findall().size());
	}

	@Test
	@Disabled
	void testDeleteByIdLong() {
		ownerServiceMap.deleteById(ownerId);
		assertEquals(0, ownerServiceMap.findall().size());
	}

}
