/**
 * 
 */
package com.zpark.springboot.dao;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.zpark.springboot.entity.Classify;

/**
 * @author lity
 *
 */

public interface ClassifyRepository extends org.springframework.data.jpa.repository.JpaRepository<Classify, Integer> {

	/**
	 * 根据分类排序编号查询分类信息
	 * 
	 * @param classifyOrder
	 *            分类编号
	 * @return
	 */
	public abstract List<Classify> findByClassifyOrder(Integer classifyOrder);

	/**
	 * 根据一组分类排序编号查询相应的分类信息(因为参数为集合，所以方法名字后面必须以In结尾)
	 * 
	 * @param classifyOrder
	 *            一组分类编号
	 * @return
	 */
	public abstract List<Classify> findByClassifyOrderIn(List<Integer> classifyOrder);
	

	
}
