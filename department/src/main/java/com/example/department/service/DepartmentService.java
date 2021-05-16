package com.example.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.entity.Departement;
import com.example.department.repository.DepartementRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartementRepository departementRepository;
	
	public Departement saveDepartment(Departement departement) {
		return departementRepository.save(departement);
	}

	public Departement findDepartmentById(Long departmentId) {
		
		return departementRepository.findByDepartmentId(departmentId);
	}

	public List<Departement> getDepartment(){
		return departementRepository.findAll();
	}
}
