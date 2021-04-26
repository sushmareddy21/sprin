package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
import com.cg.spc.repository.IParentRepository;
import com.cg.spc.service.IParentService;

public class ParentService implements IParentService{
		@Autowired
		private IParentRepository iparentRepository;
		
		public List<Parent> retrieveParentListByClass(ClassId classId){
			List<Parent> parents = new ArrayList<>();
			iparentRepository.findAll().forEach(parents::add);
			return parents;
		}

		@Override
		public Parent addParent(Parent parent) {
			return iparentRepository.save(parent);
			// TODO Auto-generated method stub
			
		}

		@Override
		public Parent updateParent(Parent parent) {
			// TODO Auto-generated method stub
			return iparentRepository.save(parent);
		}

		
	}

