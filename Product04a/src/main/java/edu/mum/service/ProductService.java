package edu.mum.service;

import java.util.List;

import edu.mum.domain.Product;

 public interface ProductService   {
	
	public List<Product> getAll();
	
	public void save(Product product);
	
	
		   
}
 
