package com.abdelmajidelayachi.skills_tree.repository;

import com.abdelmajidelayachi.skills_tree.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {
}
