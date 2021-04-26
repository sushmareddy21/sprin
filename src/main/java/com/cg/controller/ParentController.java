package com.cg.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.ParentService;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.util.ParentUtil;

@RestController
@RequestMapping("/parents")
@Validated
public class ParentController {
	
	@Autowired
	private ParentService parentService;
	
	@Autowired
	private ParentUtil parentUtil;
	
	@RequestMapping("/parents/{classId}")
	public List<Parent> retrieveParentListByClass(@PathVariable ClassId classId){
		return parentService.retrieveParentListByClass(classId);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/parents")
	public Parent addParent(@RequestBody Parent parent) {
		return parentService.addParent(parent);
		// TODO Auto-generated method stub
		
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/parents/{Id}")
	public Parent updateParent(@RequestBody Parent parent, @PathVariable int id) {
		return parentService.updateParent(parent);
	}
}