package com.test.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.department.entity.Department;
import com.test.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	
	public Department saveDepartment(Department department) {
		log.info("Inside saveDeapartment method of DepartmentService");
		return departmentRepository.save(department);
	}


	public Department findDepartmentById(Long departmentId) {
		log.info("Inside findDepartmentById method of DepartmentService");
		return departmentRepository.findDepartmentById(departmentId);
	}

}
