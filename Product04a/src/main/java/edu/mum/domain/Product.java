package edu.mum.domain;
import java.io.Serializable;

import edu.mum.domain.Category;

public class Product implements Serializable {
    private static final long serialVersionUID = 5784L;
	private long id;
	private String name;
    private String description = "This is a Product";
    private float price;
    private Category category;

    public Product() {}
    
    public Product (long id,String name,String description,float price,Category category) {
    	this.id = id;
    	this.name = name;
    	this.description = description;
    	this.price = price;
    	this.category = category;
    	
    }
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
    public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
		
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

    }