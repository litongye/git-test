/**
 * 
 */
package com.zpark.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zpark.springboot.entity.ProductInfo;

/**
 * @author lity
 *
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

	/**
	 * 查询上架商品信息
	 * 
	 * @param productStatus
	 *            是否上架
	 * @return
	 */
	public List<ProductInfo> findByProductStatus(Integer productStatus);
}
