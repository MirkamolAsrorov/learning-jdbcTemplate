package org.example;

import org.example.model.Car;
import org.example.spring.config.AppConfig;
import org.example.spring.dao.CarDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CarDAO carDAO = context.getBean(CarDAO.class);

         List<Car> chevrolet = carDAO.findAllByMake("Chevrolet");
         for (Car car : chevrolet){
             System.out.println(car);
         }
        }
    }


