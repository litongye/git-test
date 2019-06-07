/**
 * 
 */
package com.zpark.springboot.vo;

import java.math.BigDecimal;

/**
 * @author lity
 *
 */
public class ProductInfoVO implements java.io.Serializable {

	private static final long serialVersionUID = -3229201214480435133L;
	/** 商品编号 */
	private String productId;
	/** 商品名称 */
	private String productName;
	/** 商品价格 */
	private BigDecimal productPrice;
	/** 商品描述 */
	private String productDescription;
	/** 商品图片 */
	private Byte[] productImage;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
