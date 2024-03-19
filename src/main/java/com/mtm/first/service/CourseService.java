package com.mtm.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtm.first.entity.CoursesData;
import com.mtm.first.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepo;

	public List<CoursesData> findByFeeLessThan(double fee) {
		// TODO Auto-generated method stub
		return courseRepo.findByFeeLessThan(fee);
	}
	
}
