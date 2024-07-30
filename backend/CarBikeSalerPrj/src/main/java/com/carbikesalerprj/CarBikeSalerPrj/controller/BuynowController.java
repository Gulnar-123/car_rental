package com.carbikesalerprj.CarBikeSalerPrj.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbikesalerprj.CarBikeSalerPrj.model.Buynow;
import com.carbikesalerprj.CarBikeSalerPrj.repository.BuynowRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/car_bike_saler/")
public class BuynowController {
	@Autowired
	@Qualifier("buyRepo")
	BuynowRepository buyRepo;
	@GetMapping("/buynow")
	public ArrayList<Buynow> buynow()
	{
		return (ArrayList<Buynow>)buyRepo.findAll();
	}
	@PostMapping("/buynow")
	public Buynow handlepost(@RequestBody Buynow b)
	{
		return buyRepo.save(b);
	}

}
