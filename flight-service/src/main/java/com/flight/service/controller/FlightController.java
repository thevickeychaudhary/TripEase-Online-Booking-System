package com.flight.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight.service.entity.Flight;
import com.flight.service.service_class.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {

	@Autowired
	private FlightService flightService;

	@GetMapping
	public List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}

	@GetMapping("/search")
	public List<Flight> search(@RequestParam String from, @RequestParam String to) {
		return flightService.searchFlights(from, to);
	}

	@PostMapping
	public Flight addFlight(@RequestBody Flight flight) {
		return flightService.saveFlight(flight);
	}
}
