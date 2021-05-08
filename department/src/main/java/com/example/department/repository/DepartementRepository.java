package com.example.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.department.entity.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {

	Departement findByDepartmentId(Long departmentId);

}
