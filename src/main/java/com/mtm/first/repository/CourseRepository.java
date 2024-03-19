package com.mtm.first.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtm.first.entity.CoursesData;
@Repository
public interface CourseRepository extends JpaRepository<CoursesData,Long> {
	  List<CoursesData> findByFeeLessThan(double fee);
}
