package org.pet.clinic.data.model;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Vet extends Person {
	private Set<Speciality> specialities= new HashSet<Speciality>();
}
