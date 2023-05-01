package com.gurucul.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gurucul.ibm.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
