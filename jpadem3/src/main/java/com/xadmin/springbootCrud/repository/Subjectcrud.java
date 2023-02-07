package com.xadmin.springbootCrud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.springbootCrud.bean.Subject;

public interface Subjectcrud extends CrudRepository<Subject,String> {
	

}
