package com.jsp.setter.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {

	private String name;
	private String color;

	public String getName() {
		return name;
	}

	@Value(value = "Cello")
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	@Value(value = "Blue")
	public void setColor(String color) {
		this.color = color;
	}

	public void printDetails() {
		System.out.println(this.name);
		System.out.println(this.color);
	}

}
