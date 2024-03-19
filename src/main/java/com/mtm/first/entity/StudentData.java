package com.mtm.first.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
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
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column
    private String studentName;
    @Column
    private int StudentAge;
    @Column
    private String studentEmail;
    @Column
    private String studentDept;

    @JsonIgnoreProperties("student")
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "STUDENT_COURSE_TABLE",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "studentId")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "courses_id", referencedColumnName = "courseId")
            }
    )
    private Set<CoursesData> courses;
}
