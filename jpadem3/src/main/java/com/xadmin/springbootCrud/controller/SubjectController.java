package com.xadmin.springbootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.springbootCrud.bean.Subject;
import com.xadmin.springbootCrud.service.SubjectService;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectservice;
	@GetMapping("/getsubjects")
	public List<Subject> getAllSubjects()
	{
		return subjectservice.getAllSubjects();
	}
	@PostMapping("/postsubjects")
	public void addSubject(@RequestBody List<Subject> subject) 
	{
		subjectservice.addSubject(subject);
		
	}
	@RequestMapping(method = RequestMethod.PUT,value ="/subjects{id}")
	public void updateSubject(@PathVariable String id,@RequestBody Subject subject) 
	{
		subjectservice.updateSubject(id,subject);
		
	}
	
	public void deleteSubject(@PathVariable String id)
	{
		subjectservice.deleteSubject(id);
	}
	

}
