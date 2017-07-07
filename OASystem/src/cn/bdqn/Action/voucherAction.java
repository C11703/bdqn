package cn.bdqn.Action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.bdqn.Dao.voucherListDao;
import cn.bdqn.Service.voucherListService;
import cn.bdqn.entity.ClaimVoucher;
import cn.bdqn.entity.ClaimVoucherDetail;
import cn.bdqn.entity.Employee;
import cn.bdqn.entity.Position;

public class voucherAction{
	private voucherListService voucherser;
	private ClaimVoucher claimvoucher;
	private ClaimVoucherDetail claimVoucherDetail;
	Map statusmap=new HashMap();
	public String voucherList(){
		List<ClaimVoucher> list=voucherser.voucherList();
		List<ClaimVoucher> list1=voucherser.voucherStatus();
		
			for (int i = 0; i < list1.size(); i++) {
				statusmap.put((i+1), list1.get(i));
			}
			Map map=new HashMap();
			map.put("items", list);
			HttpServletRequest request=ServletActionContext.getRequest();
			request.setAttribute("pageSupport", map);
			request.setAttribute("statusMap", statusmap);
			return "success";
	}
	
	public String tzaddVoucher(){
		return Action.SUCCESS;
	}
	public String addVoucher(){
		HttpSession session=ServletActionContext.getRequest().getSession();
		Employee employee=(Employee)session.getAttribute("employee_position");
		session.setAttribute("employeename", employee.getName());
		voucherser.adddetail(claimVoucherDetail);
			return Action.SUCCESS;
	}
	public voucherListService getVoucherser() {
		return voucherser;
	}

	public void setVoucherser(voucherListService voucherser) {
		this.voucherser = voucherser;
	}

	public ClaimVoucher getClaimvoucher() {
		return claimvoucher;
	}
	public void setClaimvoucher(ClaimVoucher claimvoucher) {
		this.claimvoucher = claimvoucher;
	}
	public ClaimVoucherDetail getClaimVoucherDetail() {
		return claimVoucherDetail;
	}
	public void setClaimVoucherDetail(ClaimVoucherDetail claimVoucherDetail) {
		this.claimVoucherDetail = claimVoucherDetail;
	}

}
