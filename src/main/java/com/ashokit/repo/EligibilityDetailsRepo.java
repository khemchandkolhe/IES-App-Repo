package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.EligibilityDetailsEntity;

public interface EligibilityDetailsRepo extends JpaRepository<EligibilityDetailsEntity, Integer> {

}
