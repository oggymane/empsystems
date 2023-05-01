package com.gurucul.ibm.service;

import com.gurucul.ibm.model.Employee;

public interface EmpService {
	
	public Employee saveEmployee(Employee employee);
	
	public Long getIdCount();
	
}
