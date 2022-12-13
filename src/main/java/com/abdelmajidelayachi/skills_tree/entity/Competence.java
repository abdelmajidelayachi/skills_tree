package com.abdelmajidelayachi.skills_tree.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "competence", schema = "public", catalog = "skills_tree")
public class Competence
{
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Basic
    @Column(name = "description", nullable = false, length = 255)
    private String description;


    @Basic
    @Column(name = "referential_id", nullable = false, insertable = false
        , updatable = false)
    private Long idReferential;

    // one to one between competence and referential
    @OneToOne
    @JoinColumn(name = "referential_id", referencedColumnName = "id")
    private Referential referential;



    public Long getIdReferential() {
        return idReferential;
    }

    public void setIdReferential(Long idReferential) {
        this.idReferential = idReferential;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
