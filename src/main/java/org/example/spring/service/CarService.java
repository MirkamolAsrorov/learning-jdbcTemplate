package org.example.spring.service;

import org.example.model.Car;
import org.example.spring.dao.CarDAO;

import java.util.UUID;

public class CarService {
    public Car getCarByUuid(CarDAO carDAO, UUID carUuid){
        System.out.println("Car with uuid:" + carUuid);
        return carDAO.findCarByUuid(carUuid);
    }

    public void getAllCarsByMakeName(CarDAO carDAO, String make){
        System.out.println("List of Cars: " + "\t");
        System.out.println(carDAO.findAllCarsByMakeName(make));
    }

    public void addCar(CarDAO carDAO,
                        String make,
                        String model,
                        Double price){
        Car car = new Car();
        car.setMake(make);
        car.setModel(model);
        car.setPrice(price);

        carDAO.saveCar(car);

        System.out.println("Car is saved");
    }

    public void updateCarProperties(
            CarDAO carDAO,
            UUID carUUID,
            String make,
            String model,
            Double price
    ){
        Car car = carDAO.findCarByUuid(carUUID);

        if (car == null) {
            System.err.println("Car Not Found");

        }

        car.setMake(make);
        car.setModel(model);
        car.setPrice(price);

        carDAO.updateCar(car);
        carDAO.saveCar(car);
        System.out.println("Car is updated");
    }

}
