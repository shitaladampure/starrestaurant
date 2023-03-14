package com.xyz.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.Model.StudentDetails;

@Repository
public interface StudentDetailsDaoI extends JpaRepository<StudentDetails, Integer> {

}
