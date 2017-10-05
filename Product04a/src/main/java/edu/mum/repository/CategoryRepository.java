package edu.mum.repository;

import java.util.List;

import edu.mum.domain.Category;
import edu.mum.domain.Product;

 public interface CategoryRepository   {
	
 
		public Category getCategory(int id);
		
		public List<Category> getAll();
		   
	
}
 
