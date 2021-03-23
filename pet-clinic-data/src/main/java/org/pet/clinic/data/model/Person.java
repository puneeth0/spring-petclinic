package org.pet.clinic.data.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person extends BaseEntity{
	private String firstName;
	private String lastName;
}
