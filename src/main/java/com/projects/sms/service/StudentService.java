package com.projects.sms.service;

import java.util.List;

import com.projects.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student student);
}
