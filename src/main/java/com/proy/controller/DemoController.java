package com.proy.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proy.model.Product;
import com.proy.repo.IProductRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IProductRepo productRepo;
	
	@GetMapping("/productAdd")
	public String productAdd(
			@RequestParam(name="id", required=false) Integer id, 
			@RequestParam(name="name", required=true) String name, 
			@RequestParam(name="price", required=true) Double price, 
			@RequestParam(name="section", required=true) String section, 
			@RequestParam(name="country", required=true) String country, 
			Model model) {
		// Logica de negocio
		Product p = new Product();
		// Al no asignar un id, spring boot le dará uno propio que cumpla
		// la restriccion de clave primaria
		p.setCodProduct(id);
		p.setArticleName(name);
		p.setPrice(price);
		p.setSection(section);
		p.setOriginDate(new Date(System.currentTimeMillis()));
		p.setOriginCountry(country);
		// Añadir a base de datos:
		this.productRepo.save(p);
		return "index";
	}
	
	@GetMapping("/productList")
	public String productList(
			@RequestParam(name="cod_product", required=false, defaultValue="1") String name, 
			Model model) {
		// Se envia hacia la vista la lista de producto
		model.addAttribute("products", this.productRepo.findAll());
		return "product-list";
	}
}