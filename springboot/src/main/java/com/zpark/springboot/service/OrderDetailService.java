/**
 * 
 */
package com.zpark.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpark.springboot.dao.OrderDetailRepository;


/**
 * @author lity
 *
 */
@Service
public class OrderDetailService {

	@Autowired
	private OrderDetailRepository orderDetailRepository;
}
