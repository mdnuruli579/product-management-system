package com.Spring.nurul.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.nurul.model.Product;
import com.Spring.nurul.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productrepository;

	@Override
	public Product saveProduct(Product product) {
		
		productrepository.save(product);
		return product;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product>list=null;
		
		list=productrepository.findAll();
		
		return list;
	}

	@Override
	public Product getProductById(Integer id) {
		Product product=productrepository.findById(id).get();
		return product;
	}

	@Override
	public String deleteProduct(Integer id) {
		Product product=productrepository.findById(id).get();
		if(product!=null) {
			productrepository.delete(product);
			return "Product Deleted Sucessfully";
		}
		return "Somthing worng";
	}

	@Override
	public Product editProduct(Product product, Integer id) {
		Product old=productrepository.findById(id).get();
		old.setProductName(product.getProductName());
		old.setDescription(product.getDescription());
		old.setPrice(product.getPrice());
		old.setStatus(product.getStatus());
		return product;
	}
	

}
