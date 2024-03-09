package com.projects.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projects.sms.entity.Student;
import com.projects.sms.repository.StudentRepository;
import com.projects.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
		
	}


}
