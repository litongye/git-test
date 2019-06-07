/**
 * 
 */
package com.zpark.springboot.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

/**
 * 商品表product_info实体类
 * 
 * @author lity
 *
 */
@Entity
@DynamicUpdate
public class ProductInfo implements java.io.Serializable {

	private static final long serialVersionUID = -5873126178838835359L;

	/** 商品编号 */
	@Id
	private String productId;
	/** 商品名称 */
	private String productName;
	/** 商品价格 */
	private BigDecimal productPrice;
	/** 商品描述 */
	private String productDescription;
	/** 商品图片 */
	private Byte[] productImage;
	/** 商品库存 */
	private Integer productStock;
	/** 商品状态 */
	private Integer productStatus;
	/** 分类编号 */
	private Integer classifyId;

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

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(Byte[] productImage) {
		this.productImage = productImage;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public Integer getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}

	public Integer getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(Integer productStatus) {
		this.productStatus = productStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
