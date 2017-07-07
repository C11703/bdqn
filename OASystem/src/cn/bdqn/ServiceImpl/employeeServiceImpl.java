package cn.bdqn.ServiceImpl;

import java.util.List;

import cn.bdqn.Dao.employeeDao;
import cn.bdqn.Service.employeeService;
import cn.bdqn.entity.Employee;

public class employeeServiceImpl implements employeeService{
	private employeeDao empldao;
	@Override
	public Employee empLoginService(Employee employee) {
	List list=empldao.empLogin(employee);
	
		if(list.size()>0){
			return  (Employee)list.get(0);
		}else{
			return null;
		}
	}
	public employeeDao getEmpldao() {
		return empldao;
	}
	public void setEmpldao(employeeDao empldao) {
		this.empldao = empldao;
	}
	
}
