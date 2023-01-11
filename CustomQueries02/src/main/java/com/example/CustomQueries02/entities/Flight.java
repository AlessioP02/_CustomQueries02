package com.example.CustomQueries02.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;
    private String fromAirport;
    private String toAirport;
    private FlightStatus status;
}
