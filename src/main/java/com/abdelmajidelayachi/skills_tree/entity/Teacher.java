package com.abdelmajidelayachi.skills_tree.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "teacher", schema = "public", catalog = "skills_tree")
public class Teacher extends User{
    //
}
