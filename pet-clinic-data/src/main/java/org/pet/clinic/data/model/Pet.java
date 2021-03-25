package org.pet.clinic.data.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pet extends BaseEntity{
	private String name;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
}
