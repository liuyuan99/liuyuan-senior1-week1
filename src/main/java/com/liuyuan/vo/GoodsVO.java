package com.liuyuan.vo;

import com.liuyuan.domain.Brand;
import com.liuyuan.domain.Goods;
import com.liuyuan.domain.Type;

public class GoodsVO extends Goods{

	private Integer pageNum;//分页
	private String tname;//种类
	private String bname;//品牌
	private Double m1;//单价1
	private Double m2;//单价2
	private String name; //商品名称
	private String english;//英文名称
	private String other;//商品标签
	
	
	public GoodsVO(Integer id, String name, String english, Integer bid, Integer tid, String count, double money,
			Integer num, String other, String img, Type type, Brand brand, Integer pageNum, String tname, String bname,
			Double m1, Double m2, String name2, String english2, String other2) {
		super(id, name, english, bid, tid, count, money, num, other, img, type, brand);
		this.pageNum = pageNum;
		this.tname = tname;
		this.bname = bname;
		this.m1 = m1;
		this.m2 = m2;
		name = name2;
		english = english2;
		other = other2;
	}
	public GoodsVO() {
		super();
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getbname() {
		return bname;
	}
	public void setbname(String bname) {
		this.bname = bname;
	}
	public Double getM1() {
		return m1;
	}
	public void setM1(Double m1) {
		this.m1 = m1;
	}
	public Double getM2() {
		return m2;
	}
	public void setM2(Double m2) {
		this.m2 = m2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	@Override
	public String toString() {
		return "GoodsVO [pageNum=" + pageNum + ", tname=" + tname + ", bname=" + bname + ", m1=" + m1 + ", m2=" + m2
				+ ", name=" + name + ", english=" + english + ", other=" + other + "]";
	}
	
	
}
