package com.rt.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.Dao.ProductDao;
import com.rt.Entity.ProductEntity;

@Component
public class ProductService {
	@Autowired
	ProductDao pDAo;

	public void addProduct(ProductEntity p) {
		pDAo.save(p);
	}

	public ProductEntity GetProductById(int productId) {
	     ProductEntity p1=null;
		Optional<ProductEntity> p=  pDAo.findById(productId);
		if(p.isPresent())
		{
			p1=p.get();
			return p1;
		}
		return p1;
	
		
	}

	public ProductEntity deleteProductById(int productId) {
		 pDAo.deleteById(productId);
		 return null;
	}

	public List<ProductEntity> GetAllProduct() {
		List<ProductEntity> productList=pDAo.findAll();
		return productList;
	}

//	public List<ProductEntity> getEmpName(String productName) {
//		 List<ProductEntity> productList=pDAo.findByName(productName);
//		return productList;
//	}

	public List<ProductEntity> getProductName(String productName) {
		 List<ProductEntity> productList=pDAo.findByName(productName);
		return productList;
	}

}