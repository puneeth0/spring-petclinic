package org.pet.clinic.data.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable{
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Long Id;
}
