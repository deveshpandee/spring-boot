package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void updateStudent(Student theStudent);

    void deleteStudent(int id);

    int deleteAll();
}
