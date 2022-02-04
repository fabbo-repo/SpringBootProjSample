package com.proy.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proy.model.Product;
import com.proy.repo.IProductRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IProductRepo productRepo;
	
	@GetMapping("/productAdd")
	public String productAdd(
			@RequestParam(name="cod_product", required=false, defaultValue="1") String name, 
			Model model) {
		// Logica de negocio
		Product p = new Product();
		p.setCodProduct(17);
		p.setArticleName("Tenedores");
		p.setPrice(4.55);
		p.setOriginDate(new Date(System.currentTimeMillis()));
		p.setOriginCountry("ESP");
		// Añadir a base de datos:
		this.productRepo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
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