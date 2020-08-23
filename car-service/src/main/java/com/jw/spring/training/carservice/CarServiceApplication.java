package com.jw.spring.training.carservice;

import com.jw.spring.training.carservice.model.Car;
import com.jw.spring.training.carservice.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarServiceApplication.class, args);
	}

}
