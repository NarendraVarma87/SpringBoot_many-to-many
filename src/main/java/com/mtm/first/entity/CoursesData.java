package com.mtm.first.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CoursesData {
@Id
@GeneratedValue
private Long courseId;
@Column
private String courseTitle;
@Column
private String abbreviation;
@Column
private int modules;
@Column
private double fee;


@ManyToMany(mappedBy = "courses",fetch = FetchType.LAZY)
@JsonBackReference
private Set<StudentData> student;
}
