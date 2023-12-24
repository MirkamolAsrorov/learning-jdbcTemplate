package org.example.model;


import lombok.Data;

import java.util.UUID;

@Data
public class Car {
    private UUID car_uuid;
    private String make;
    private String model;
    private Double price;

}
