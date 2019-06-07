/**
 * 
 */
package com.zpark.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zpark.springboot.entity.OrderInfo;

/**
 * @author lity
 *
 */
public interface OrderInfoRepository extends JpaRepository<OrderInfo, String> {

}
