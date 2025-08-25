package com.flight.service.service_class;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.service.entity.Flight;
import com.flight.service.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository repo;

	public List<Flight> getAllFlights() {
		return repo.findAll();
	}

	public List<Flight> searchFlights(String from, String to) {
		return repo.findByFromCityAndToCity(from, to);
	}

	public Flight saveFlight(Flight flight) {
		return repo.save(flight);
	}
}
