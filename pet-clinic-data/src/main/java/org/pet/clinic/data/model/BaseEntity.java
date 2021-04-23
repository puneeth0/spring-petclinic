package org.pet.clinic.data.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable{
	public BaseEntity(Long id) {
		this.Id=id;
	}

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Long Id;
}
