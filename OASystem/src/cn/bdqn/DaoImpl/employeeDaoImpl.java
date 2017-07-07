package cn.bdqn.DaoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.Dao.employeeDao;
import cn.bdqn.entity.Employee;

public class employeeDaoImpl extends HibernateDaoSupport implements employeeDao{

	@Override
	public List empLogin(Employee employee) {
		return super.getHibernateTemplate().find("from Employee e where e.sn= ? and e.password= ?",
				new Object[]{employee.getSn(),employee.getPassword()});
	}
	
}
