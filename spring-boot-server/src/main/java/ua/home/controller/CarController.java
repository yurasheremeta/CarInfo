package ua.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.home.domain.CarDTO;
import ua.home.service.CarService;

@RestController
@RequestMapping("car")
public class CarController {
	@Autowired
	private CarService carService;
	
	@PostMapping
	public ResponseEntity<Void> createCar(@RequestBody CarDTO dto){
		carService.create(dto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@GetMapping
	public ResponseEntity<List<CarDTO>> findAll(){
		return new ResponseEntity<List<CarDTO>>(carService.findAll() , HttpStatus.OK);
		
	}


}
