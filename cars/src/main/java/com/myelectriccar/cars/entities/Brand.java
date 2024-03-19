package com.myelectriccar.cars.entities;

import jakarta.persistence.*;

@Table(name = "brands")
@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(unique = true, length = 200, nullable = false)
    private String name;

    @Column(unique = true, length = 200, nullable = false)
    private String link;

}
