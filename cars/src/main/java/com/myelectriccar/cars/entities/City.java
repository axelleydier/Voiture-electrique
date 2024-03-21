package com.myelectriccar.cars.entities;

import jakarta.persistence.*;

@Table(name = "cities")
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(unique = true, length = 200, nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer postalCode;
}
