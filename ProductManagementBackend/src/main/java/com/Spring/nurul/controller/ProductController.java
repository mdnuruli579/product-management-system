package com.Spring.nurul.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.Spring.nurul.model.Product;
import com.Spring.nurul.service.ProductService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/save")
	public ResponseEntity<?>saveProduct(@RequestBody Product product){
		return  new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<?>getAllProduct(){
		return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
	}
	
	@GetMapping("/detail/{id}")
	public ResponseEntity<?>getProductById(@PathVariable Integer id){
		return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
	}
	@GetMapping("/delete/{id}")
	public ResponseEntity<?>deleteProduct(@PathVariable Integer id){
		return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
	}
	@PostMapping("/edit/{id}")
	public ResponseEntity<?>editProduct(@RequestBody Product product,@PathVariable Integer id){
		return  new ResponseEntity<>(productService.editProduct(product,id),HttpStatus.CREATED);
	}
	
}
