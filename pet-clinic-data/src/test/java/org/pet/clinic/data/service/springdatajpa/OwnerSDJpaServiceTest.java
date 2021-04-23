package org.pet.clinic.data.service.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.Times;
import org.mockito.junit.jupiter.MockitoExtension;
import org.pet.clinic.data.model.Owner;
import org.pet.clinic.data.repository.OwnerRepository;
import org.pet.clinic.data.repository.PetRepository;
import org.pet.clinic.data.repository.PetTypeRepository;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

	@Mock
	OwnerRepository ownerRepository;
	@Mock
	PetRepository petRepository;
	@Mock
	PetTypeRepository petTypeRepository;
	@InjectMocks
	OwnerSDJpaService service;

	String lname = "kumar";
	Long id = 1L;

	Owner returnOwner;

	@BeforeEach
	void setUp() throws Exception {
		returnOwner = Owner.builder().id(id).lastName(lname).build();
	}

	@Test
	void testFindall() {
		Set<Owner> ownersSet = new HashSet<Owner>();
		ownersSet.add(Owner.builder().id(1L).lastName(lname).build());
		ownersSet.add(Owner.builder().id(2L).lastName(lname).build());
		when(ownerRepository.findAll()).thenReturn(ownersSet);
		Set<Owner> owners = service.findall();
		assertNotNull(owners);
		assertEquals(2, owners.size());

	}

	@Test
	void testFindById() {
		when(ownerRepository.findById(any())).thenReturn(Optional.of(returnOwner));
		Owner own = service.findById(id);
		assertNotNull(own);

	}

	@Test
	void testSave() {
		Owner owner = Owner.builder().id(1L).lastName(lname).build();
		when(ownerRepository.save(any())).thenReturn(owner);
		Owner savedOwn = service.save(returnOwner);
		assertEquals(id, savedOwn.getId());
	}

	@Test
	void testDelete() {
		ownerRepository.delete(returnOwner);
		assertEquals(0, service.findall().size());
		verify(ownerRepository,times(1)).delete(any());
	}

	@Test
	void testDeleteById() {
		service.deleteById(id);
		assertEquals(0, service.findall().size());
		verify(ownerRepository).deleteById(any());
	}

	@Test
	void testFindByLastName() {

		when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
		Owner kumar = service.findByLastName(lname);
		assertEquals(lname, kumar.getLastName());
		verify(ownerRepository).findByLastName(any());
	}

}
