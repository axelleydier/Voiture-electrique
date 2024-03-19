package com.myelectriccar.cars.entities;

import jakarta.persistence.*;

@Table(name = "cars")
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(unique = true, length = 200, nullable = false)
    private String model;

    @ManyToOne
    @JoinColumn(name = "brandID")
    private Brand brand;
}
