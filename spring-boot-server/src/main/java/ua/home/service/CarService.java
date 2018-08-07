package ua.home.service;

import java.util.List;

//import org.springframework.stereotype.Service;

import ua.home.domain.CarDTO;

public interface CarService {
	
	void create(CarDTO dto);
	
	void update(CarDTO dto);
	
	void delete(String carId);
	
	List<CarDTO> findAll();
	
	CarDTO findByCarId(String carId);

}
