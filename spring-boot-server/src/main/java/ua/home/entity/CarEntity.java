package ua.home.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name = "car")
public class CarEntity extends BaseEntity {
	
	private String carId;
	
	private String make;
	
	private String model;
	
	private String color;
	
	private String image;
	
	@Column(columnDefinition = "DECIMAL(2,1)")
	private String engine;
	
	@Column(columnDefinition = "DECIMAL(9,2)")
	private BigDecimal price;
	
	private LocalDate modelYear;
	
	private String transmission;
	
	private String typeOfDrive;
	
	private String fuelType;
	
	public CarEntity() {
		
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDate getModelYear() {
		return modelYear;
	}

	public void setModelYear(LocalDate modelYear) {
		this.modelYear = modelYear;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getTypeOfDrive() {
		return typeOfDrive;
	}

	public void setTypeOfDrive(String typeOfDrive) {
		this.typeOfDrive = typeOfDrive;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
}
