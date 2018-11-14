package com.amit.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.amit.model.Products;

@Path("/product")
public class ProductRestService {
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public Products getAllProducts() {
		
		Products products = new Products();
		products.setName("Abc");
		products.setQuantity(10);
		products.setPrice(23.03);
		
		return products;
		
	}

}
