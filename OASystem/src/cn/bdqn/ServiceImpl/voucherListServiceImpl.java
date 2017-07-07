package cn.bdqn.ServiceImpl;

import java.util.List;

import cn.bdqn.Dao.voucherListDao;
import cn.bdqn.Service.voucherListService;
import cn.bdqn.entity.ClaimVoucher;
import cn.bdqn.entity.ClaimVoucherDetail;

public class voucherListServiceImpl implements voucherListService{

	private voucherListDao voucherlistdao;
	private ClaimVoucherDetail vouDetail;
	@Override
	public List<ClaimVoucher> voucherList() {
				
		return voucherlistdao.voucherList();
	}
	@Override
	public List<ClaimVoucher> voucherStatus() {
		// TODO Auto-generated method stub
		return voucherlistdao.voucherStatus();
	}
	@Override
	public void adddetail(ClaimVoucherDetail claimVoucherDetail) {
		
		try {
			voucherlistdao.adddetail(claimVoucherDetail);
			System.out.println("YES");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("NO");
			e.printStackTrace();
		}
	}
	public voucherListDao getVoucherlistdao() {
		return voucherlistdao;
	}
	public void setVoucherlistdao(voucherListDao voucherlistdao) {
		this.voucherlistdao = voucherlistdao;
	}
	public ClaimVoucherDetail getVouDetail() {
		return vouDetail;
	}
	public void setVouDetail(ClaimVoucherDetail vouDetail) {
		this.vouDetail = vouDetail;
	}
	
	
	
}
