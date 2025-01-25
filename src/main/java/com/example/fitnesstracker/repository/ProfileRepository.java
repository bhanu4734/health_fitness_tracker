package com.example.fitnesstracker.repository;

import com.example.fitnesstracker.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
