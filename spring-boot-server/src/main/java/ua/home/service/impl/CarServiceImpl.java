package ua.home.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.home.domain.CarDTO;
import ua.home.entity.CarEntity;
import ua.home.repository.CarRepository;
import ua.home.service.CarService;
import ua.home.service.utils.ObjectMapperUtils;
import ua.home.service.utils.StringUtils;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private ObjectMapperUtils modelMapper;
	@Autowired
	private StringUtils stringUtils;
	@Override
	public void create(CarDTO dto) {
		dto.setCarId(stringUtils.generate());
		carRepository.save(modelMapper.map(dto, CarEntity.class));
	}
	@Override
	public void update(CarDTO dto) {
		carRepository.save(modelMapper.map(dto, CarEntity.class));
	}
	@Override
	public void delete(String carId) {
		CarEntity car = carRepository.findByCarId(carId);
		carRepository.delete(car);
		
	}
	@Override
	public List<CarDTO> findAll() {
		return modelMapper.mapAll(carRepository.findAll(), CarDTO.class);
	}
	@Override
	public CarDTO findByCarId(String carId) {
		
		return modelMapper.map(carRepository.findByCarId(carId), CarDTO.class);
	}
	
	
}
