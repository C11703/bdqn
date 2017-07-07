package cn.bdqn.DaoImpl;

import java.util.List;

import org.hibernate.Transaction;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.Dao.voucherListDao;
import cn.bdqn.entity.ClaimVoucher;
import cn.bdqn.entity.ClaimVoucherDetail;

public class voucherListDaoImpl extends HibernateDaoSupport implements voucherListDao{

	@Override
	public List<ClaimVoucher> voucherList() {
		
		return super.getHibernateTemplate().find("from ClaimVoucher");
	}

	@Override
	public List<ClaimVoucher> voucherStatus() {
		// TODO Auto-generated method stub
		return super.getHibernateTemplate().find("select status from ClaimVoucher group by status");
	}
	
	@Override
	public void adddetail(ClaimVoucherDetail claimVoucherDetail) {
		// TODO Auto-generated method stub
		try {
			super.getHibernateTemplate().save(claimVoucherDetail);
			System.out.println("Ìí¼Ó³É¹¦£¡");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
