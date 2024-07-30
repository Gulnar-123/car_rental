package com.carbikesalerprj.CarBikeSalerPrj.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.carbikesalerprj.CarBikeSalerPrj.model.Product;

@Repository
@Qualifier("proRepo")
public interface ProductRepository extends JpaRepository<Product, Long> {
	@Query(nativeQuery = true,value = "select * from product where type=:type")
	ArrayList<Product> findAllByType(@Param("type") String type);

	

}
