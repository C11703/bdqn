package cn.jboa.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.jboa.dao.Employeedao;
import cn.jboa.entity.Employee;

public class EmployeedaoImpl extends HibernateDaoSupport implements Employeedao {

	@Override
	public List login(Employee employee) {
		
		return  super.getHibernateTemplate().find("from Employee e  where e.sn=? and e.password=?",new Object[]{employee.getSn(),employee.getPassword()});
	}
	

}
