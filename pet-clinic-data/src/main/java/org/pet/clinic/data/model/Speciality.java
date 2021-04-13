package org.pet.clinic.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Specialities")
public class Speciality extends BaseEntity {
	@Column(name="description")
	private String description;
}
