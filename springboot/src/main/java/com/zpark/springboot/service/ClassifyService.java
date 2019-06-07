/**
 * 
 */
package com.zpark.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpark.springboot.dao.ClassifyRepository;
import com.zpark.springboot.entity.Classify;

/**
 * @author lity
 *
 */
@Service
public class ClassifyService {

	@Autowired
	private ClassifyRepository repository;

	public List<Classify> findAll() throws RuntimeException {
		return this.repository.findAll();
	}

}
