package com.abdelmajidelayachi.skills_tree.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "student", schema = "public", catalog = "skills_tree")
public class Student extends User{



    @Basic
    @Column(name = "promo", nullable = false)
    private String promo;


    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }
}
