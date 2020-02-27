package com.liuyuan.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuyuan.dao.GoodsMapper;
import com.liuyuan.domain.Brand;
import com.liuyuan.domain.Goods;
import com.liuyuan.service.GoodsService;
import com.liuyuan.vo.GoodsVO;

import com.liuyuan.domain.Type;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsMapper mapper;

	@Override
	public List<Goods> selects(GoodsVO goodsVO) {
		// TODO Auto-generated method stub
		return mapper.selects(goodsVO);
	}

	@Override
	public List<Brand> brand() {
		// TODO Auto-generated method stub
		return mapper.brand();
	}

	@Override
	public List<Type> type() {
		// TODO Auto-generated method stub
		return mapper.type();
	}

	@Override
	public void add(Goods goods,  Brand br, Type ty) {
		// TODO Auto-generated method stub
		mapper.addGoods(goods);
//		mapper.addType(ty);
//		mapper.addBrand(br);
	}

	
	
	
	
}
