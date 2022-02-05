package com.proy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proy.model.Product;
import com.proy.repo.IProductRepo;

@RestController
@RequestMapping("rest") // ruta para acceder a los getmapping
public class RestDemoController {

	@Autowired
	private IProductRepo productRepo;
	
	@GetMapping("/productList") // Obtencion de datos
	public List<Product> listProducts() {
		return this.productRepo.findAll();
	}
	
	@PostMapping("/productInsert") // Insercion de datos
	public void insertProducts(@RequestBody Product p) {
		/* 	Ejemplo:
		  	{
		   		"price": 3.99,
		    	"section": "cocina",
		    	"codProduct": 2,
		    	"articleName": "Cucharas",
		    	"originDate": "2022-02-05",
		    	"originCountry": "ESP"
		  	} */
		this.productRepo.save(p);
	}
	
	@PutMapping("/productUpdate") // Actualizacion de datos
	public void updateProducts(@RequestBody Product p) {
		/* 	Ejemplo:
	  	{
	   		"price": 15.99,
	    	"section": "cocina",
	    	"codProduct": 2,
	    	"articleName": "Cucharas",
	    	"originDate": "2022-02-25",
	    	"originCountry": "FRA"
	  	} */
		this.productRepo.save(p);
	}
	
	@DeleteMapping("/productDelete/{id}") // Eliminacion de datos
	public void deleteProducts(@PathVariable("id" ) Integer id) {
		this.productRepo.deleteById(id);
	}
}
