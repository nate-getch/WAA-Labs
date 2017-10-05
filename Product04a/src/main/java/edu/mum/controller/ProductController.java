package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.domain.Category;
import edu.mum.domain.Product;
import edu.mum.service.CategoryService;
import edu.mum.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	
	ProductController() {
		
	}
 	
	/*
	// Setter based injection....
	@Autowired
	ProductController(ProductService productService,CategoryService categoryService) {
		this.categoryService =  categoryService;
		this.productService = productService;
	}*/
 	
    @RequestMapping(value={"/","/product"}, method = RequestMethod.GET)
    public String inputProduct(Model model) {
    	model.addAttribute("addProduct", new Product());
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
      
        return "ProductForm";
    }


	@RequestMapping(value="/product", method = RequestMethod.POST)
     public String saveProduct(@ModelAttribute("addProduct") Product product, Model model ) {

/*  Replace method declaration with:
    	// The following will crash and burn because No Product to bind in signature
        public String saveProduct(Model model ) {
    	Product product = new Product();
    	model.addAttribute(product);
*/  
		if(product.getCategory().getId() != 0) {
	    	Category category = categoryService.getCategory(product.getCategory().getId());
	        product.setCategory(category);

	    	productService.save(product);
	    	model.addAttribute(product);
	        return "ProductDetails";
		}
		else {
			return "redirect:/product";
		}

    }
    
    
    @RequestMapping(value="/listproducts")
    public String listProducts(Model model ) {
    	
    	
		List<Product> list = productService.getAll();
		model.addAttribute("products",  list);
    	
        return "ListProducts";
    }
    
  /*  @RequestMapping(value={"/","/product"}, method = RequestMethod.GET)
    public String inputProduct(Product oldProduct, Product newProduct, Model model) {
 
    	// Which "product" "survives in model [ both can NOT be in Map...?
        newProduct.setDescription("NEW");
        oldProduct.setDescription("OLD");         
        Product product = (Product)model.asMap().get("product");
        System.out.println(product.getDescription() );
  
        // NOW which one ???!!?? Still only ONE in Map
         product = new Product();
         product.setDescription("EXTRA");
        model.addAttribute(product);
        
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
     
     
   	return "ProductForm";
    }
 */
    
}
