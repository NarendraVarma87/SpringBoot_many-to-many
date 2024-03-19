package com.mtm.first.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtm.first.entity.StudentData;
import com.mtm.first.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;

	public List<StudentData> getAllStudents() {
		return studentRepo.findAll();
	}

	public StudentData addStudent(StudentData studentData) {
		return studentRepo.save(studentData);
	}

	public Optional<StudentData> getStudentById(Long studentId) {
		return studentRepo.findById(studentId);
	}

	public List<StudentData> findByNameContaining(String studentName) {
		return studentRepo.findBystudentNameContaining(studentName);
	}

	public String deleteByStudentId(Long studentId) {
		studentRepo.deleteById(studentId);
		return "Student Record Deleted";

	}
}
