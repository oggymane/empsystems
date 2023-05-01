package com.gurucul.ibm.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurucul.ibm.model.Employee;
import com.gurucul.ibm.repository.EmpRepository;
import com.gurucul.ibm.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository emprepo;

	@Override
	public Employee saveEmployee(Employee employee) {
		Employee emp = emprepo.save(employee);
		return emp;
	}

	@Override
	public Long getIdCount() {

		Long idcount = emprepo.count();

		return idcount;
	}

}
