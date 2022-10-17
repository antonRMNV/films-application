package com.example.springbootfilms.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "producer")
    private String producer;

    @Column(name = "year")
    private int year;

    @Column(name = "limitation")
    private String limitation;
}
