package com.cg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Student;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IStudentService;


@Service
@Transactional
public class StudentService implements IStudentService {
	@Autowired
	private IStudentRepository sDao;

	@Override
	public Student addStudent(Student student) {
		Student stud = sDao.save(student);
		return stud;
		
	}

}
