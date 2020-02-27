package com.liuyuan.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liuyuan.domain.Brand;
import com.liuyuan.domain.Goods;
import com.liuyuan.service.GoodsService;
import com.liuyuan.vo.GoodsVO;

import com.liuyuan.domain.Type;

@Controller
public class GoodsController {

	@Resource
	private GoodsService service;
	
	//分页+列表
	@RequestMapping("selects")
	public String selects(Model m,GoodsVO goodsVO) {
		if(goodsVO.getPageNum()==null) {
			goodsVO.setPageNum(1);
		}
		PageHelper.startPage(goodsVO.getPageNum(), 3);
		List<Goods> list = service.selects(goodsVO);
		PageInfo<Goods> info = new PageInfo<Goods>(list);
		m.addAttribute("info", info);
		m.addAttribute("goodsVO", goodsVO);
		return "selects";
	}
	
	@ResponseBody
	@RequestMapping("type")
	public List<Type> type(){
		//获取所有种类		
		return service.type();
	}
	
	@ResponseBody
	@RequestMapping("brand")
	public List<Brand> brand(){
		//获取所有类型
		return service.brand();
	}
	
	
	@RequestMapping("toAdd")
	public String toAdd(){
		return "/add";
	}
	
	@RequestMapping("add")
	public String add(Goods goods,@RequestParam("file")MultipartFile file,Brand br,Type ty,HttpServletRequest request) throws IllegalStateException, IOException {
	
		if (file.getSize()>0) {
			String path="D:\\year\\month9cms\\liuyuan-senior1-week1\\src\\main\\webapp\\file\\";
			//不记得了
			String filename = file.getOriginalFilename();
			File file2=new File(path,  filename);
			file.transferTo(file2);
			goods.setImg("/img/"+filename);
		}
		service.add(goods,br,ty);
		return "redirect:/selects";
	}
}
