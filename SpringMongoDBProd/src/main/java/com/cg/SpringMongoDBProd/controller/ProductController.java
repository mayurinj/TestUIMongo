package com.cg.SpringMongoDBProd.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.SpringMongoDBProd.bean.Product;
import com.cg.SpringMongoDBProd.dao.ProductDao;

@RestController

public class ProductController {

	@Autowired
	ProductDao dao;
	@PostMapping(value="/proddemo/create/")
	public Product createProd(@RequestBody Product prod)
	{
		dao.save(prod);
		return prod;
	}
	@GetMapping(value="/proddemo/products")
	public List<Product> getAllProducts()
	{
		return dao.findAll();
	}
	
	@DeleteMapping(value="/proddemo/delete/{id}")
	public String deleteById(@PathVariable String id)
	{
		dao.deleteById(id);
		return "data deleted successfully";
	}
	
	@PutMapping(value="/proddemo/update/{id}")
	public String update(@RequestBody Product prod,@PathVariable String id)
	{
		prod.setId(id);
		dao.save(prod);
		return "Updated";
		
	}
}
