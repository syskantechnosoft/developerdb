package com.syskan.developerdb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syskan.developerdb.model.Developer;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {

}
