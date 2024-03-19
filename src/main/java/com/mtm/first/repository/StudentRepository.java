package com.mtm.first.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtm.first.entity.StudentData;
@Repository
public interface StudentRepository extends JpaRepository<StudentData,Long>{
	
	 List<StudentData> findBystudentNameContaining(String studentName);
}
