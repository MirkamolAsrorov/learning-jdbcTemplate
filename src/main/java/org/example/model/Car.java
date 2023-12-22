package org.example.model;


import java.util.Objects;
import java.util.UUID;


public class Car {
    private UUID car_uuid;


    public void setCar_uuid(UUID car_uuid) {
        this.car_uuid = car_uuid;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public UUID getCar_uuid() {
        return car_uuid;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    private String make;
    private String model;
    private Double price;

    @Override
    public String toString() {
        return "Car{" +
                "car_uuid=" + car_uuid +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(car_uuid, car.car_uuid) && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car_uuid, make, model, price);
    }
}
