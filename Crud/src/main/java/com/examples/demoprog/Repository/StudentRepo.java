package com.examples.demoprog.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examples.demoprog.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{


}
