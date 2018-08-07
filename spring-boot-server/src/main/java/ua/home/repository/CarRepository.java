package ua.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.home.entity.CarEntity;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Long>{

	CarEntity findByCarId(String carId);
}
