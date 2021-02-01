package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.BatchRunDetailsEntity;

public interface BatchRunRepo extends JpaRepository<BatchRunDetailsEntity, Integer> {

}
