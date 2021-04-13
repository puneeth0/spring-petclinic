package org.pet.clinic.data.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
public class Person extends BaseEntity{
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
}
