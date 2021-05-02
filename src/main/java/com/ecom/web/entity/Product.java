package com.ecom.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	

	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long p_id;
	
	@Column(name="cusine")
	private String cusine;
	
	@Column(name="name")
	private String name;
	
	@Column(name="descr")
	private String descr;
	
	@Column(name="price")
	private float price;

	public Product() {
		
	}

	public Product(Long p_id, String cusine, String name, String descr, float price) {
		super();
		this.p_id = p_id;
		this.cusine = cusine;
		this.name = name;
		this.descr = descr;
		this.price = price;
	}

	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

	public String getCusine() {
		return cusine;
	}

	public void setCusine(String cusine) {
		this.cusine = cusine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return descr;
	}

	public void setDesc(String descr) {
		this.descr = descr;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", cusine=" + cusine + ", name=" + name + ", descr=" + descr + ", price=" + price
				+ "]";
	}


	
	

}
