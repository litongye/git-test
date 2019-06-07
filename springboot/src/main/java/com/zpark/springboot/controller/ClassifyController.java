/**
 * 
 */
package com.zpark.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zpark.springboot.entity.Classify;
import com.zpark.springboot.entity.ProductInfo;
import com.zpark.springboot.service.ClassifyService;
import com.zpark.springboot.service.ProductInfoService;
import com.zpark.springboot.vo.ClassifyVO;
import com.zpark.springboot.vo.ProductInfoVO;
import com.zpark.springboot.vo.ResultVO;

/**
 * @author lity
 *
 */
@RestController
@RequestMapping("/buyer/classify")
public class ClassifyController {

	@Autowired
	private ClassifyService classifyService;

	@Autowired
	private ProductInfoService productInfoService;

	@GetMapping(value = "findAll")
	public ResultVO<List<ClassifyVO>> findAll() {
		ResultVO<List<ClassifyVO>> result = new ResultVO<>();
		try {
			// 查询所有分类信息
			List<Classify> classifyList = this.classifyService.findAll();
			// 查询所有上架商品信息
			List<ProductInfo> productList = this.productInfoService.findByProductStatus(0);
			// 组合数据

			// 创建保存最终结果的List集合
			List<ClassifyVO> resultList = new ArrayList<>();

			ClassifyVO classifyVO = null;
			ProductInfoVO productInfoVO = null;
			List<ProductInfoVO> productInfoList = null;
			for (Classify classify : classifyList) {
				classifyVO = new ClassifyVO();
				BeanUtils.copyProperties(classify, classifyVO);
				productInfoList = new ArrayList<>();

				for (ProductInfo productInfo : productList) {
					if (classify.getClassifyId().equals(productInfo.getClassifyId())) {
						productInfoVO = new ProductInfoVO();
						BeanUtils.copyProperties(productInfo, productInfoVO);
						productInfoList.add(productInfoVO);
					}
				}
				classifyVO.setProductInfoList(productInfoList);
				resultList.add(classifyVO);
			}
			// 封装数据
			result.setCode(0);
			result.setMsg("success");
			result.setData(resultList);
		} catch (Exception e) {
			result.setCode(1);
			result.setMsg("error");
		}
		return result;
	}
}
