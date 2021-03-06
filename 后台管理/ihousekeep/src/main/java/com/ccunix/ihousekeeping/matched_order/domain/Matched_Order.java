package com.ccunix.ihousekeeping.matched_order.domain;
import java.util.Date;
/**
 * author 黄爽
 */

import com.ccunix.ihousekeeping.basedb.domain.T_s_advertisement_manager;
import com.ccunix.ihousekeeping.basedb.domain.T_u_order;
public class Matched_Order extends T_u_order {
	
	private String rownumber;
	private String user_phone;//用户电话
	private String nick_name;//用户姓名
	private String address; //用户地址
	private String  coupon_type_id; //优惠券类型
	private int money; //优惠券金额
	private String item_name;//子项目名称
	private String project_id;//服务id
	public String getRownumber() {
		return rownumber;
	}
	public void setRownumber(String rownumber) {
		this.rownumber = rownumber;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCoupon_type_id() {
		return coupon_type_id;
	}
	public void setCoupon_type_id(String coupon_type_id) {
		this.coupon_type_id = coupon_type_id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getProject_id() {
		return project_id;
	}
	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}
	
	private String order_no;
	public void setOrder_no(String order_no){
	this.order_no=order_no;
	}
	public String getOrder_no(){
	return this.order_no;
	}
	private String order_time_str ;
	public void setOrder_time_str(String order_time_str ){
	this.order_time_str =order_time_str;
	}
	public String  getOrder_time_str (){
	return this.order_time_str ;
	}
	private Date order_time;
	public void setOrder_time(Date order_time){
	this.order_time=order_time;
	}
	public Date getOrder_time(){
	return this.order_time;
	}
	private String appointment_time_str ;
	public void setAppointment_time_str(String appointment_time_str ){
	this.appointment_time_str =appointment_time_str;
	}
	public String  getAppointment_time_str (){
	return this.appointment_time_str ;
	}
	private Date appointment_time;
	public void setAppointment_time(Date appointment_time){
	this.appointment_time=appointment_time;
	}
	public Date getAppointment_time(){
	return this.appointment_time;
	}
	private String member_id;
	public void setMember_id(String member_id){
	this.member_id=member_id;
	}
	public String getMember_id(){
	return this.member_id;
	}
	private String order_status;
	public void setOrder_status(String order_status){
	this.order_status=order_status;
	}
	public String getOrder_status(){
	return this.order_status;
	}
	private String send_member;
	public void setSend_member(String send_member){
	this.send_member=send_member;
	}
	public String getSend_member(){
	return this.send_member;
	}
	private String rider_id;
	public void setRider_id(String rider_id){
	this.rider_id=rider_id;
	}
	public String getRider_id(){
	return this.rider_id;
	}
	private Integer is_split;
	public void setIs_split(Integer is_split){
	this.is_split=is_split;
	}
	public Integer getIs_split(){
	return this.is_split;
	}
	private String cancel_role;
	public void setCancel_role(String cancel_role){
	this.cancel_role=cancel_role;
	}
	public String getCancel_role(){
	return this.cancel_role;
	}
	private String cancel_member;
	public void setCancel_member(String cancel_member){
	this.cancel_member=cancel_member;
	}
	public String getCancel_member(){
	return this.cancel_member;
	}
	private String pay_fun;
	public void setPay_fun(String pay_fun){
	this.pay_fun=pay_fun;
	}
	public String getPay_fun(){
	return this.pay_fun;
	}
	private String pay_time_str ;
	public void setPay_time_str(String pay_time_str){
	this.pay_time_str =pay_time_str;
	}
	public String  getPay_time_str (){
	return this.pay_time_str ;
	}
	private Date pay_time;
	public void setPay_time(Date pay_time){
	this.pay_time=pay_time;
	}
	public Date getPay_time(){
	return this.pay_time;
	}
	private String pay_no;
	public void setPay_no(String pay_no){
	this.pay_no=pay_no;
	}
	public String getPay_no(){
	return this.pay_no;
	}
	private Integer order_total_money;
	public void setOrder_total_money(Integer order_total_money){
	this.order_total_money=order_total_money;
	}
	public Integer getOrder_total_money(){
	return this.order_total_money;
	}
	private Integer order_pay_money;
	public void setOrder_pay_money(Integer order_pay_money){
	this.order_pay_money=order_pay_money;
	}
	public Integer getOrder_pay_money(){
	return this.order_pay_money;
	}
	private String is_coupon;
	public void setIs_coupon(String is_coupon){
	this.is_coupon=is_coupon;
	}
	public String getIs_coupon(){
	return this.is_coupon;
	}
	private Integer coupon_money;
	public void setCoupon_money(Integer coupon_money){
	this.coupon_money=coupon_money;
	}
	public Integer getCoupon_money(){
	return this.coupon_money;
	}
	private String order_over_time_str ;
	public void setOrder_over_time_str(String order_over_time_str ){
	this.order_over_time_str =order_over_time_str;
	}
	public String  getOrder_over_time_str (){
	return this.order_over_time_str ;
	}
	private Date order_over_time;
	public void setOrder_over_time(Date order_over_time){
	this.order_over_time=order_over_time;
	}
	public Date getOrder_over_time(){
	return this.order_over_time;
	}
	}