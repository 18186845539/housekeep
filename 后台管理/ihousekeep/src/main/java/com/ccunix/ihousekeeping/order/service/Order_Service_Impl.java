package com.ccunix.ihousekeeping.order.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.ihousekeeping.base.domain.AppDataModel;
import com.ccunix.ihousekeeping.base.domain.Base_Model_Business;
import com.ccunix.ihousekeeping.base.service.BaseService;
import com.ccunix.ihousekeeping.base.util.DateTimeUtil;
import com.ccunix.ihousekeeping.basedb.dao.T_u_order_Dao_Iface;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order;
import com.ccunix.ihousekeeping.basedb.domain.T_u_rider;
import com.ccunix.ihousekeeping.basedb.domain.T_u_service_project;
import com.ccunix.ihousekeeping.coupon.domain.Coupon_H;
import com.ccunix.ihousekeeping.order.dao.Order_Dao_Iface;
import com.ccunix.ihousekeeping.order.domain.Order;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class Order_Service_Impl extends BaseService implements Order_Service_Iface {
	@Resource
	public Order_Dao_Iface order_Dao_Iface;

	@Resource
	public T_u_order_Dao_Iface t_u_order_Dao_Iface;

	/**
	 * 关键字查询及查询所有数据
	 * 
	 * @author 黄爽
	 * @return
	 */
	@Override
	public List queryAll_order(Order order) throws Exception {
		List<Order> ls = order_Dao_Iface.queryAll_order(order);
		return ls;
	}

	@Override
	public String makeOrderNo() throws Exception {
		String yymmdd = DateTimeUtil.getDateString(DateTimeUtil.dateFormat_yyMMDD, new Date());
		int seq = order_Dao_Iface.getOrderNo_seq();
		String str = yymmdd + seq;
		return str;
	}

	// 查询订单信息
	@Override
	public AppDataModel getOrderInfo(Order order) throws Exception {
		AppDataModel appDataModel = getAppDataModel();

		List orderinfo = order_Dao_Iface.getOrderInfo(order);

		appDataModel.data.put("orderinfo", orderinfo);

		return appDataModel;
	}

}
