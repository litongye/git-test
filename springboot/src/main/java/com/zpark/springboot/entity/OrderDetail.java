/**
 * 
 */
package com.zpark.springboot.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

/**
 * 订单明细order_detail实体类
 * 
 * @author lity
 *
 */
@Entity
@DynamicUpdate
public class OrderDetail implements java.io.Serializable {

	private static final long serialVersionUID = 8115672807905537178L;
	/** 订单明细编号 */
	@Id
	private String orderDetailId;
	/** 订单编号 */
	private String orderId;
	/** 商品编号 */
	private String productId;
	/** 商品名称 */
	private String productName;
	/** 商品价格 */
	private BigDecimal productPrice;
	/** 商品图片 */
	private byte[] productImage;
	/** 购买商品数量 */
	private Integer productQuantity;

	public String getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(String orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	public Integer getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
