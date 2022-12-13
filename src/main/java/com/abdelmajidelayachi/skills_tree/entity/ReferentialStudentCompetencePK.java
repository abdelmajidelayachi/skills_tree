package com.abdelmajidelayachi.skills_tree.entity;


import jakarta.persistence.*;

import java.io.Serializable;

public class ReferentialStudentCompetencePK implements Serializable {

    @Id
    @Column(name = "id_referential", nullable = false)
    private Long idReferential;

    @Id
    @Column(name = "id_student", nullable = false)
    private Long idStudent;

    @Id
    @Column(name = "id_competence", nullable = false)
    private Long idCompetence;

    public Long getIdCompetence() {
        return idCompetence;
    }

    public void setIdCompetence(Long idCompetence) {
        this.idCompetence = idCompetence;
    }

    public Long getIdReferential() {
        return idReferential;
    }

    public void setIdReferential(Long idReferential) {
        this.idReferential = idReferential;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }


}
