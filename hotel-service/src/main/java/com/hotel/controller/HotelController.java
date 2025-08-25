package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping
	public List<Hotel> getHotels() {
		return hotelService.getAllHotels();

	}

	@PostMapping
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return hotelService.addHotel(hotel);
	}

}
