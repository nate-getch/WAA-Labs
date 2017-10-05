package edu.mum.service;

import java.util.List;

import edu.mum.domain.Category;
import edu.mum.domain.Product;

 public interface CategoryService  {	
		public Category getCategory(int id);	
		public List<Category> getAll();	
}
 
