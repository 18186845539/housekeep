package com.ccunix.ihousekeeping.basedb.service;
import com.ccunix.ihousekeeping.basedb.domain.T_u_coupon_type;
import java.util.List;
public interface T_u_coupon_type_Service_Iface {
public void insert_t_u_coupon_type(T_u_coupon_type t_u_coupon_type) throws Exception;
public void update_t_u_coupon_type(T_u_coupon_type t_u_coupon_type) throws Exception;
public void delete_t_u_coupon_type(T_u_coupon_type t_u_coupon_type) throws Exception;
public List queryAll_t_u_coupon_type(T_u_coupon_type t_u_coupon_type) throws Exception;
public List queryBy_t_u_coupon_type(T_u_coupon_type t_u_coupon_type) throws Exception;
}
