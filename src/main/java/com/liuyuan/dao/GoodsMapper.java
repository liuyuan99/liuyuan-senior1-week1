package com.liuyuan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.liuyuan.domain.Brand;
import com.liuyuan.domain.Goods;
import com.liuyuan.vo.GoodsVO;

import com.liuyuan.domain.Type;

public interface GoodsMapper {

	  List<Goods> selects(GoodsVO goodsVO);
		
	  List<Brand> brand();
	  
	  List<Type> type();

	void addGoods(Goods goods);

	void addType(Type ty);

	void addBrand(Brand br);
	  
	

}
