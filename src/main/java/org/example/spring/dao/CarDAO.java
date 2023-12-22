package org.example.spring.dao;

import org.example.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> findAllByMake(String make);
}
