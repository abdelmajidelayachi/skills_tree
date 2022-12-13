package com.abdelmajidelayachi.skills_tree.entity;

import com.abdelmajidelayachi.skills_tree.util.Level;
import jakarta.persistence.*;

@Entity
@Table(name = "referential_student", schema = "public", catalog = "skills_tree")
@IdClass(ReferentialPK.class)
public class ReferentialStudent {

    @Id
    @Column(name = "id_referential", nullable = false)
    private Long idReferential;

    @Id
    @Column(name = "id_competence", nullable = false)
    private Long idCompetence;

    @Basic
    @Column(name = "level", nullable = false, length = 255)
    private Level level;

    public Long getIdReferential() {
        return idReferential;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void setIdReferential(Long idReferential) {
        this.idReferential = idReferential;
    }

    public Long getIdCompetence() {
        return idCompetence;
    }

    public void setIdCompetence(Long idCompetence) {
        this.idCompetence = idCompetence;
    }
}
