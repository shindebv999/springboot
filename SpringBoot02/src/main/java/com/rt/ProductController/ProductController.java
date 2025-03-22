package com.rt.ProductController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.Entity.ProductEntity;
import com.rt.Services.ProductService;
@RequestMapping("/product")
@CrossOrigin("*")
@RestController
public class ProductController {
	@Autowired
	ProductService pService;

	@Value("${Message}")
	private String wlcMsg;
	
	@Value("${WebsiteName}")
	private String webName;
	
	@PostMapping
	public String addroduct(@RequestBody ProductEntity p) {
	//	pService.addProduct(p);		
	//	return "Product Add";
	    try {
	        pService.addProduct(p);
	        return "Product added successfully";
	    } catch (Exception e) {
	        // Handle exceptions and return an appropriate response
	        return "Failed to add product";
	    }

		
	}

	@GetMapping("/productId/{productId}")
	public ProductEntity GetProductById(@PathVariable int productId) {
		ProductEntity p = pService.GetProductById(productId);
		System.out.println(wlcMsg);
		System.out.println(webName);
		return p;
	}

	@DeleteMapping("/productId/{productId}")
	public ProductEntity deleteProductById(@PathVariable int productId) {
		ProductEntity p = pService.deleteProductById(productId);
		return p;
	}
	
   @GetMapping(produces="application/json")
   public List<ProductEntity> getAllEmp(){
	 List<ProductEntity>   productList= pService.GetAllProduct();
	return productList;
   }
   
//   @GetMapping("/product/productName/{productName}")
//   public List<ProductEntity> getProductName(@PathVariable String productName){
//	 List<ProductEntity>   productList= pService.getEmpName(productName);
//	return productList;
//   }
   @GetMapping("/productName/{productName}")
   public List<ProductEntity> getProductName(@PathVariable String productName){
	 List<ProductEntity>   productList= pService.getProductName(productName);
	return productList;
   }
}
