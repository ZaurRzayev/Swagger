package com.example.learnspring.StudentRepository;

import com.example.learnspring.model.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentDto, Integer> {
}
