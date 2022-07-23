package com.example.demodatasource.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodatasource.model.entity.UserHealth;

public interface UserHealthRepository extends JpaRepository<UserHealth, Long> {
	
}
