package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.User;

public interface IParentRepository extends JpaRepository<Parent,String> {
	public Parent addParent(Parent parent);
	public Parent updateParent(Parent parent);
	public List<Parent> retrieveParentListByClass(ClassId classId);
	public Parent retrieveParentByStudent(Student student);
	public Parent retrieveParentById(int id);
	
}
