/**
 * 
 */
package com.zpark.springboot.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

/**
 * 订单order_info实体类
 * 
 * @author lity
 *
 */
@Entity
@DynamicUpdate
public class OrderInfo implements java.io.Serializable {

	private static final long serialVersionUID = 5787628394774184010L;
	/** 订单编号 */
	@Id
	private String orderId;
	/** 买家姓名 */
	private String buyerName;
	/** 买家电话 */
	private String buyerPhone;
	/** 买家地址 */
	private String buyerAddress;
	/** 买家微信ID */
	private String buyerOpenId;
	/** 买家备注 */
	private String buyerRemarks;
	/** 订单总额 */
	private BigDecimal orderAmount;
	/** 订单状态 */
	private Integer orderStatus;
	/** 支付状态 */
	private Integer payStatus;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getBuyerAddress() {
		return buyerAddress;
	}

	public void setBuyerAddress(String buyerAddress) {
		this.buyerAddress = buyerAddress;
	}

	public String getBuyerOpenId() {
		return buyerOpenId;
	}

	public void setBuyerOpenId(String buyerOpenId) {
		this.buyerOpenId = buyerOpenId;
	}

	public String getBuyerRemarks() {
		return buyerRemarks;
	}

	public void setBuyerRemarks(String buyerRemarks) {
		this.buyerRemarks = buyerRemarks;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
