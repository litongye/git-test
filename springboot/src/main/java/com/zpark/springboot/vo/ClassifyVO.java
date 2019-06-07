/**
 * 
 */
package com.zpark.springboot.vo;

import java.util.List;

/**
 * @author lity
 *
 */
public class ClassifyVO implements java.io.Serializable {

	private static final long serialVersionUID = 2259237175977530416L;

	/** 分类名称 */
	private String classifyName;

	/** 分类排序编号 */
	private Integer classifyOrder;

	/** 商品信息 */
	private List<ProductInfoVO> productInfoList;

	public String getClassifyName() {
		return classifyName;
	}

	public void setClassifyName(String classifyName) {
		this.classifyName = classifyName;
	}

	public Integer getClassifyOrder() {
		return classifyOrder;
	}

	public void setClassifyOrder(Integer classifyOrder) {
		this.classifyOrder = classifyOrder;
	}

	public List<ProductInfoVO> getProductInfoList() {
		return productInfoList;
	}

	public void setProductInfoList(List<ProductInfoVO> productInfoList) {
		this.productInfoList = productInfoList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
