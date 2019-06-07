package com.zpark.springboot;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.junit4.SpringRunner;

import com.zpark.springboot.dao.ClassifyRepository;
import com.zpark.springboot.entity.Classify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private ClassifyRepository repository;

	@Test
	public void contextLoads() {
		// ---------------------添加-------------------------
		// Classify classify = new Classify();
		// classify.setClassifyName("汉子必选");
		// classify.setClassifyOrder(1);
		//
		// Classify save = dao.save(classify);
		// System.out.println(save != null ? "成功" : "失败");
		// ---------------------添加-------------------------

		// ---------------------查询-------------------------
		// Classify classify = dao.findById(1).get();
		// System.out.println(classify);
		// ---------------------查询-------------------------

		// ---------------------修改-------------------------
		// Classify classify = dao.findById(3).get();
		// classify.setClassifyOrder(2);
		// dao.save(classify);
		// ---------------------修改-------------------------

		// ---------------------自定义查询-------------------------
		// List<Classify> list = dao.findByClassifyOrder(2);
		// for (Classify classify : list) {
		// System.out.println(classify);
		// }

		// List<Integer> orders = new ArrayList<>();
		// orders.add(1);
		// orders.add(2);
		//
		// List<Classify> list = dao.findByClassifyOrderIn(orders);
		// for (Classify classify : list) {
		// System.out.println(classify);
		// }
		// ---------------------自定义查询-------------------------
		
		// ---------------------分页查询-------------------------
		//of(页码,每页显示的行数)
		PageRequest page = PageRequest.of(0, 2,Sort.by(Direction.ASC, "classifyOrder"));
		Page<Classify> pageMsg = repository.findAll(page);
		List<Classify> list = pageMsg.getContent();
		for (Classify classify : list) {
			System.out.println(classify);
		}
		System.out.println("共" + pageMsg.getTotalPages() + "页");
		System.out.println("当前" + (pageMsg.getNumber() + 1) + "页");
		System.out.println("共" + pageMsg.getTotalElements() + "行");
		System.out.println("当前页共" + pageMsg.getNumberOfElements() + "行");
		// ---------------------分页查询-------------------------
		

	}

}
