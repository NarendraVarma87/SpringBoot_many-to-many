package com.mtm.first.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtm.first.entity.CoursesData;
import com.mtm.first.entity.StudentData;
import com.mtm.first.service.CourseService;
import com.mtm.first.service.StudentService;

@RestController
@RequestMapping("/student/data")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/get")
	public List<StudentData> getAllStudents(){
		return studentService.getAllStudents();
	}
	@PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	public StudentData addStudent(@RequestBody StudentData studentData) {
		return studentService.addStudent(studentData);
	}
	@GetMapping("/get/{studentId}")
	public Optional<StudentData> getStudentById(@PathVariable Long studentId) {
		return studentService.getStudentById(studentId);
	}
	@GetMapping("/find/{studentName}")
	 public List<StudentData> findStudentsContainingByName(@PathVariable String studentName){
	     return studentService.findByNameContaining(studentName);
	 }
	@GetMapping("/search/{fee}")
    public List<CoursesData> findCourseLessThanPrice(@PathVariable double fee){
        return courseService.findByFeeLessThan(fee);
    }
}
