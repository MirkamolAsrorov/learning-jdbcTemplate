package org.example;

import org.example.spring.config.AppConfig;
import org.example.spring.dao.CarDAO;
import org.example.spring.service.CarService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CarDAO carDAO = context.getBean(CarDAO.class);
        CarService carService = new CarService();

        //one of method from carService should be called here!

    }
    }


