/**
 * 
 */
package com.zpark.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpark.springboot.dao.OrderInfoRepository;


/**
 * @author lity
 *
 */
@Service
public class OrderInfoService {

	@Autowired
	private OrderInfoRepository orderInfoRepository;
}
