package com.example.fitnesstracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class WorkoutPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int durationInDays;
    private String difficulty; // Beginner, Intermediate, Advanced
}
