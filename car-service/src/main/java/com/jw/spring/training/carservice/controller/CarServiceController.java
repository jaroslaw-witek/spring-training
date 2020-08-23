package com.jw.spring.training.carservice.controller;

import com.jw.spring.training.carservice.model.Car;
import com.jw.spring.training.carservice.repository.RepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class CarServiceController {

    @Autowired
    RepositoryInterface repo;

    @PostMapping("/cars")
    public Car postCar(@RequestParam(value = "brand") String brand,
                       @RequestParam(value = "model") String model,
                       @RequestParam(value = "color") String color){
        Car car = new Car(brand, model, color);
        return repo.save(car);
    }

    @GetMapping("/cars")
    public List<Car> findCar(@RequestParam(value = "brand", required = false) String brand,
                             @RequestParam(value = "model", required = false) String model,
                             @RequestParam(value = "color", required = false) String color){

        Car car = new Car(brand, model, color);
        return repo.findAll(Example.of(car));

    }

}
