package com.myelectriccar.cars.entities;

import jakarta.persistence.*;

@Table(name = "terminals")
@Entity
public class Terminal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(unique = true, length = 200, nullable = false)
    private String type;

    @ManyToOne
    @JoinColumn(name = "positionID")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "companyID")
    private Company company;
}
