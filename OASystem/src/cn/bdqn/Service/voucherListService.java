package cn.bdqn.Service;

import java.util.List;

import cn.bdqn.entity.ClaimVoucher;
import cn.bdqn.entity.ClaimVoucherDetail;

public interface voucherListService {

	public List<ClaimVoucher> voucherList();
	
	public List<ClaimVoucher> voucherStatus();
	
	public void adddetail(ClaimVoucherDetail detail);
}
