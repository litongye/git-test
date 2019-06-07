/**
 * 
 */
package com.zpark.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpark.springboot.dao.ProductInfoRepository;
import com.zpark.springboot.entity.ProductInfo;

/**
 * @author lity
 *
 */
@Service
public class ProductInfoService {

	@Autowired
	private ProductInfoRepository productInfoRepository;

	public List<ProductInfo> findByProductStatus(Integer productStatus) throws RuntimeException {
		return this.productInfoRepository.findAll();
	}
}
