package cn.bdqn.Dao;

import java.util.List;

import cn.bdqn.entity.ClaimVoucher;
import cn.bdqn.entity.ClaimVoucherDetail;

public interface voucherListDao {

	public List<ClaimVoucher> voucherList();
	
	public List<ClaimVoucher> voucherStatus();
	
	public void adddetail(ClaimVoucherDetail detail);
}
