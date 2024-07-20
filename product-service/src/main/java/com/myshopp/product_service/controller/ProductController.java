package com.myshopp.product_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myshopp.product_service.dto.ProductRequest;
import com.myshopp.product_service.service.ProductService;

import lombok.RequiredArgsConstructor;

//Exposing Rest API 
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	//Sending content so invoke Post Mapping
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductRequest productrequest) {
    
		//notice the method delegation of creating product to the class ProductService to divide responsibilities
		//createProduct method is from the productService class and not a recursion of the above method.
		productService.createProduct(productrequest);
	
	}
}