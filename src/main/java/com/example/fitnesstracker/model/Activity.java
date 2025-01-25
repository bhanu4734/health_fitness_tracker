package com.example.fitnesstracker.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type; // e.g., Running, Cycling
    private int duration; // in minutes
    private int caloriesBurned;
}
