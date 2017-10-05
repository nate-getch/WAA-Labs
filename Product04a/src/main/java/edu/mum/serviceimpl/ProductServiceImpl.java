package edu.mum.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.Product;
import edu.mum.repository.ProductRepository;
import edu.mum.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
    	public List<Product> getAll() {
		return productRepository.getAll();
	}
	
	public void save(Product product) {
		productRepository.save(product);
		return ;
	}
	
	
		   
}
 
