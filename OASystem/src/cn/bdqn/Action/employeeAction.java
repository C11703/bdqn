package cn.bdqn.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import cn.bdqn.Dao.employeeDao;
import cn.bdqn.Service.employeeService;
import cn.bdqn.entity.Employee;

public class employeeAction {

	private Employee employee;
	private employeeService emplser;
	
	public String loginexecute(){
		Employee empl=emplser.empLoginService(employee);
		if(empl!=null){
			HttpSession session=ServletActionContext.getRequest().getSession();
			session.setAttribute("employee_position", empl.getSysPosition().getNameCn());
			return "success";
		}else{
			return "error";
		}
	}

	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public employeeService getEmplser() {
		return emplser;
	}
	public void setEmplser(employeeService emplser) {
		this.emplser = emplser;
	}
	
}
