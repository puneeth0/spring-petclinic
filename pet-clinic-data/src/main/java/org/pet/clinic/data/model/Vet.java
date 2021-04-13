package org.pet.clinic.data.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="vets")
public class Vet extends Person {
	@ManyToMany
	@JoinTable(name="vet_specialties", joinColumns = @JoinColumn(name="vet_id"), inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Speciality> specialities= new HashSet<Speciality>();
}
