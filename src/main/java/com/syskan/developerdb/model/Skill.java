package com.syskan.developerdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String label;
	private String description;

	public Skill(String label, String description) {
		super();
		this.label = label;
		this.description = description;
	}
}
