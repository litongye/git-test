/**
 * 
 */
package com.zpark.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zpark.springboot.entity.OrderDetail;

/**
 * @author lity
 *
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

}
