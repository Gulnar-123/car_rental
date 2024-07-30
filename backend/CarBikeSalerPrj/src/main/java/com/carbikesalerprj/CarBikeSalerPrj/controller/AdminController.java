package com.carbikesalerprj.CarBikeSalerPrj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbikesalerprj.CarBikeSalerPrj.model.AdminLogin;
import com.carbikesalerprj.CarBikeSalerPrj.model.Register;
import com.carbikesalerprj.CarBikeSalerPrj.repository.AdminLoginRepository;
import com.carbikesalerprj.CarBikeSalerPrj.repository.RegisterRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/car_bike_saler/")
public class AdminController {
	@Autowired
	@Qualifier("admRepo")
    AdminLoginRepository admRepo;
	@GetMapping("/admin/{emailid}/{password}")
	public AdminLogin login(@PathVariable("emailid") String emailid,@PathVariable("password") String password)	
	{		
		return admRepo.findByEmailIdAndPassword(emailid,password);
	}
}


