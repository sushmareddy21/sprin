package com.cg.spc.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.spc.entities.ClassDiary;
import com.cg.spc.entities.User;

public interface IClassDiaryRepository extends JpaRepository<ClassDiary,String> {
	public ClassDiary addClassDiary(ClassDiary classDiary);
	public ClassDiary retrieveClassDiary(LocalDate date);
	
}
