package com.syskan.developerdb.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syskan.developerdb.model.Skill;

public interface SkillRepository {
	public List<Skill> findByLabel(String label);
}
