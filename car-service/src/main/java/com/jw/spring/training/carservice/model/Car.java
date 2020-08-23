package com.jw.spring.training.carservice.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy= GenerationType.SEQUENCE)
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    public Car(){

    }
    public Car(String brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
}

