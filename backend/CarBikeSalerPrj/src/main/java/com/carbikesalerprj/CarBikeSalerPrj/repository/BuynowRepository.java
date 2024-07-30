package com.carbikesalerprj.CarBikeSalerPrj.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carbikesalerprj.CarBikeSalerPrj.model.Buynow;

@Repository
@Qualifier("buyRepo")
public interface BuynowRepository extends JpaRepository<Buynow, Long> {

}
