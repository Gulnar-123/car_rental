package com.carbikesalerprj.CarBikeSalerPrj.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String productname,price,type;

	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="product_images",joinColumns= {
			@JoinColumn(name="product_id")
	},
	inverseJoinColumns= {
			@JoinColumn(name="image_id")
	}
	)
	private Set<ImageModel> productImages;



	public Set<ImageModel> getProductImages() {
		return productImages;
	}
	public void setProductImages(Set<ImageModel> productImages) {
		this.productImages = productImages;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Product(String productname, String price, String type) {
		super();
		this.productname = productname;
		this.price = price;
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	


}
