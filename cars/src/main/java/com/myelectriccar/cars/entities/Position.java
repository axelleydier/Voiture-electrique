package com.myelectriccar.cars.entities;

import jakarta.persistence.*;

@Table(name = "positions")
@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(unique = true, length = 200, nullable = false)
    private String latitude;

    @Column(unique = true, length = 200, nullable = false)
    private String longitude;

    @ManyToOne
    @JoinColumn(name = "cityID")
    private City city;
}
