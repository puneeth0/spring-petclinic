package org.pet.clinic.data.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name="pets")
public class Pet extends BaseEntity{
	@Column(name="name")
	private String name;
	@JoinColumn(name="type_id")
	private PetType petType;
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner;
	@Column(name="birth_date")
	private LocalDate birthDate;
}
