package com.abdelmajidelayachi.skills_tree.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "referencial")

public class Referencial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    





}
