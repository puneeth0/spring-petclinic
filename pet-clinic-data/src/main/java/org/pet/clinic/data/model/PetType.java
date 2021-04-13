package org.pet.clinic.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="types")
public class PetType extends BaseEntity{
	@Column(name="name")
	private String name;
}
