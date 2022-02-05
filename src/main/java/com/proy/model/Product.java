package com.proy.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	private int cod_product;
	
	@Column(name="article_name")
	private String article_name;

	@Column(name="price")
	private double price;

	@Column(name="section")
	private String section;

	@Column(name="origin_country")
	private String origin_country;

	@Column(name="origin_date")
	private Date origin_date;

	/**
	 * @return the cod_product
	 */
	public int getCodProduct() {
		return cod_product;
	}

	/**
	 * @param cod_product the cod_product to set
	 */
	public void setCodProduct(int cod_product) {
		this.cod_product = cod_product;
	}

	/**
	 * @return the article_name
	 */
	public String getArticleName() {
		return article_name;
	}

	/**
	 * @param article_name the article_name to set
	 */
	public void setArticleName(String article_name) {
		this.article_name = article_name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the section
	 */
	public String getSection() {
		return section;
	}

	/**
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}

	/**
	 * @return the origin_country
	 */
	public String getOriginCountry() {
		return origin_country;
	}

	/**
	 * @param origin_country the origin_country to set
	 */
	public void setOriginCountry(String origin_country) {
		this.origin_country = origin_country;
	}

	/**
	 * @return the origin_date
	 */
	public Date getOriginDate() {
		return origin_date;
	}

	/**
	 * @param origin_date the origin_date to set
	 */
	public void setOriginDate(Date origin_date) {
		this.origin_date = origin_date;
	}
}
