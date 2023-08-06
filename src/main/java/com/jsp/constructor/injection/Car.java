package com.jsp.constructor.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	String name;
	String brand;

	public Car(@Value(value = "TATA") String name, @Value(value = "Nexon") String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	public void printCar() {
		System.out.println(name);
		System.out.println(brand);
	}
}
