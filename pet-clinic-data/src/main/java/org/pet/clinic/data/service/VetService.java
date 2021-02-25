package org.pet.clinic.data.service;

import java.util.Set;

import org.pet.clinic.data.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Set<Vet> findAll();

	Vet save(Vet vet);
}
