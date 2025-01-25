package com.example.fitnesstracker.repository;

import com.example.fitnesstracker.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
