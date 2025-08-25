package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Hotel;
import com.hotel.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	public List<Hotel> getAllHotels() 
	{
		return hotelRepository.findAll();
	}
	public Hotel addHotel(Hotel hotel)
	{
		return hotelRepository.save(hotel);
	}
}
