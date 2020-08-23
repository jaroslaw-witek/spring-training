package com.jw.spring.training.carservice.repository;

import com.jw.spring.training.carservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryInterface extends JpaRepository<Car, Long> {
//    public List<Car> getCars();
//
//    public Long addCar(Car car);
//
//    public Car getCar(Long id);
//
//    public Car findCar(String color);
}
