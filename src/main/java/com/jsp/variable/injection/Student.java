package com.jsp.variable.injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "Akash")
	private String name;
	@Value(value = "akashkolekar20111998@gmail.com")
	private String email;

	public void studentDetails() {
		System.out.println(this.name);
		System.out.println(this.email);
		

	}

}
