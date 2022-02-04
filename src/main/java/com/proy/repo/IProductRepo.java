package com.proy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proy.model.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
