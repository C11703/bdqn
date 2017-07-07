package cn.bdqn.Test;

import cn.bdqn.Service.employeeService;
import cn.bdqn.ServiceImpl.employeeServiceImpl;
import cn.bdqn.entity.Employee;

public class test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeService emplser=new employeeServiceImpl();
		Employee employee=new Employee();
		employee.setSn("001");
		employee.setPassword("123");
		Employee empl=emplser.empLoginService(employee);
		System.out.println(empl);
	}

}
