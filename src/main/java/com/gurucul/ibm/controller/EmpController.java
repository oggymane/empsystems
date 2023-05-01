package com.gurucul.ibm.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gurucul.ibm.model.Employee;
import com.gurucul.ibm.service.EmpService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	Logger log = LogManager.getLogger(EmpController.class);
	@Autowired
	private EmpService empservice;

	@PostMapping("/saveEmployee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		log.info("calling saveEmployee()");
		Employee savedEmp = empservice.saveEmployee(employee);
		return ResponseEntity.ok().body(savedEmp);
	}

}
