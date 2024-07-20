package com.myshopp.product_service.service;

import org.springframework.stereotype.Service;
import com.myshopp.product_service.dto.ProductRequest;
import com.myshopp.product_service.model.Product;
import com.myshopp.product_service.repository.ProductRepository;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j //for logging purposes
@Builder
public class ProductService {

	private final ProductRepository productRepository;
	
	//constructor
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	
	public void createProduct(ProductRequest productRequest) {
	
	//map Product Request to the Product Model
	Product product = Product.builder()
			.name(productRequest.getName())
			.description(productRequest.getDescription())
			.price(productRequest.getPrice())
			.build();
	
	productRepository.save(product);
	log.info("Product " + product.getId()+ "saved");
	
	}

	
	}

