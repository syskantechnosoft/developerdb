package com.syskan.developerdb.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	@ManyToMany
	private List<Skill> skills;

	public boolean hasSkill(Skill skill) {
		for (Skill containedSkill : getSkills()) {
			if (containedSkill.getId() == skill.getId()) {
				return true;
			}
		}
		return false;
	}

	public Developer(String firstName, String lastName, String email, List<Skill> skills) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.skills = skills;
	}
}
