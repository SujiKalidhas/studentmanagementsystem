package com.xadmin.springbootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.springbootCrud.bean.Subject;
import com.xadmin.springbootCrud.repository.Subjectcrud;

@Service
public class SubjectService {
	@Autowired
	Subjectcrud subjectcrud;
	public List<Subject> getAllSubjects()
	{ 
		List<Subject> subjects = new ArrayList<>();
		subjectcrud.findAll().forEach(subjects::add);
		return subjects;
		
	}
	public void addSubject(List<Subject> subject) {
		subjectcrud.saveAll(subject);
				
		
	}
	public void updateSubject(String id, Subject subject) {
	    subjectcrud.save(subject);
		
	}
	public void deleteSubject(String id) {
		subjectcrud.deleteById(id);
		
	}
	

}
