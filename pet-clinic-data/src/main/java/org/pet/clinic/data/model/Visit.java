package org.pet.clinic.data.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Visit extends BaseEntity{

	private LocalDate date;
	private String description;
	private Pet pet;
}
