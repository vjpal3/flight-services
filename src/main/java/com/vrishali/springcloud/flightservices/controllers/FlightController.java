package com.vrishali.springcloud.flightservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrishali.springcloud.flightservices.model.Flight;
import com.vrishali.springcloud.flightservices.repository.FlightRepository;

@RestController
public class FlightController {
	
	@Autowired
	private FlightRepository repository;
	
	@GetMapping("/flights")
	public List<Flight> getAllFlights() {
		
		return repository.findAll();
	}
}
