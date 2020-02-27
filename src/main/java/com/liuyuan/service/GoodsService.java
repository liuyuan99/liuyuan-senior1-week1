package com.liuyuan.service;

import java.util.List;

import com.liuyuan.domain.Brand;
import com.liuyuan.domain.Goods;
import com.liuyuan.vo.GoodsVO;

import com.liuyuan.domain.Type;

public interface GoodsService {

	List<Goods> selects(GoodsVO goodsVO);

	
	  List<Brand> brand();
	  
	  List<Type> type();


	void add(Goods goods, Brand br, Type ty);
	

}
