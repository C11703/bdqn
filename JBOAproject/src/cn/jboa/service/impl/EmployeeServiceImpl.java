package cn.jboa.service.impl;

import java.util.List;

import cn.jboa.dao.Employeedao;
import cn.jboa.entity.Employee;
import cn.jboa.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private Employeedao employeedao;
	

	@Override
	public Employee login(Employee emp) {
		List list = employeedao.login(emp);
		if (list.size() > 0) {
			return (Employee) list.get(0);
		} else {
			return null;
		}
	}
	
	public Employeedao getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(Employeedao employeedao) {
		this.employeedao = employeedao;
	}




}
