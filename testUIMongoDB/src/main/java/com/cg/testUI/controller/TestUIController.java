package com.cg.testUI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.cg.testUI.model.Product;

@RestController
public class TestUIController {
	
	@Autowired
	RestTemplate rest ;
	
	@GetMapping("/products/")
	public Product[] dispProducts()
	{
		Product[] cust =  rest.getForObject("http://product-crud/proddemo/products", Product[].class);
		return cust;
	}
	@PostMapping("/add/")
	public Product addProduct(@RequestBody Product prod)
	{
		Product prod1 =rest.postForObject("http://product-crud/proddemo/create/", prod, Product.class);
		return prod1;
		
	}
	/*
	@GetMapping("/products/{id}")
	public String dispCustomer(@PathVariable("id") int id,Model model)
	{
		Customer cust = rest.getForObject("http://customer-crud/proddemo/"+id, Product.class);
		model.addAttribute("cust",cust);
		return "customer";
	}*/
}
