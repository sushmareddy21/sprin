package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spc.entities.Student;

public interface IStudentRepository extends JpaRepository<Student, Long> {
        public Student addStudent(Student student);
	//public Student updateStudent(Student student);
	//public Student deleteStudent(Student student);
	//public List<Student> retrieveAllStudents();
	//public Student retrieveStudentById(int id);
	

}
