package com.liuyuan.domain;

import java.util.List;

public class Goods {

	private Integer id;
	private String name;
	private String english;
	private Integer bid;
	private Integer tid;
	private String count;
	private double money;
	private Integer num;
	private String other;
	private String img;
	

	private Type type;
	private Brand brand;

	public Goods(Integer id, String name, String english, Integer bid, Integer tid, String count, double money,
			Integer num, String other, String img, Type type, Brand brand) {
		super();
		this.id = id;
		this.name = name;
		this.english = english;
		this.bid = bid;
		this.tid = tid;
		this.count = count;
		this.money = money;
		this.num = num;
		this.other = other;
		this.img = img;
		this.type = type;
		this.brand = brand;
	}
	public Goods() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getOther() {
		return other;
	}
	public void setOther(String other) {
		this.other = other;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", english=" + english + ", bid=" + bid + ", tid=" + tid
				+ ", count=" + count + ", money=" + money + ", num=" + num + ", other=" + other + ", img=" + img
				+ ", type=" + type + ", brand=" + brand + "]";
	}
	
	
}
