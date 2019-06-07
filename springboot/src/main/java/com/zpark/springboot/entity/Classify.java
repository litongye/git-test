/**
 * 
 */
package com.zpark.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

/**
 * 分类表classify实例类
 * 
 * @author lity
 *
 */
@Entity
@DynamicUpdate // 动态更新
public class Classify implements java.io.Serializable {

	private static final long serialVersionUID = 4173646031933762334L;

	/** 分类编号 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classifyId;

	/** 分类名称 */
	private String classifyName;

	/** 分类排序编号 */
	private Integer classifyOrder;

	public Integer getClassifyId() {

		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Classify [classifyId=" + classifyId + ", classifyName=" + classifyName + ", classifyOrder="
				+ classifyOrder + "]";
	}

}
