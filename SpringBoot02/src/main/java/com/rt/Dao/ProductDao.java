package com.rt.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rt.Entity.ProductEntity;

public interface ProductDao extends JpaRepository<ProductEntity, Integer> {
//   @Query(value="select * from productdeatails where productName=? ", nativeQuery=true)
//	List<ProductEntity> findByName(String productName);
   
   @Query(value="select p from ProductEntity p where p.productName=:pname ", nativeQuery=false)
 	List<ProductEntity> findByName(@Param("pname")String pname);

	


}
