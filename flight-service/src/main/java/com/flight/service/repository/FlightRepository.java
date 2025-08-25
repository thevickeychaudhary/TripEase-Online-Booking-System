package com.flight.service.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.service.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByFromCityAndToCity(String fromCity, String toCity);
}
