package org.example.spring.dao;

import org.example.model.Car;

import java.util.List;
import java.util.UUID;

public interface CarDAO {
    Car findCarByUuid(UUID carUuid);
    List<Car> findAllCarsByMakeName(String make);

    void saveCar(Car car);

    void updateCar(Car car);
}
