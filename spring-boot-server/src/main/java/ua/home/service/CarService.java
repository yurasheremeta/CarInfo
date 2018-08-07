package ua.home.service;

import java.util.List;

import ua.home.domain.CarDTO;

public interface CarService {
	
	void create(CarDTO dto);
	
	void update(CarDTO dto);
	
	void delete(String carId);
	
	List<CarDTO> findAll();
	
	CarDTO findByCarId(String carId);

}
