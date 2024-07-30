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

import com.carbikesalerprj.CarBikeSalerPrj.model.Feedback;
import com.carbikesalerprj.CarBikeSalerPrj.repository.FeedbackRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/car_bike_saler/")
public class FeedbackController {
	@Autowired
	@Qualifier("feedRepo")
	FeedbackRepository feedRepo;
	@GetMapping("/feedback")
	public ArrayList<Feedback> feedback()
	{
		return (ArrayList<Feedback>)feedRepo.findAll();
	}
	@PostMapping("/feedback")
	public Feedback savefeedback(@RequestBody Feedback f)
	{
		return feedRepo.save(f);
	}

}
