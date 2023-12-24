package org.example.spring.dao;

import org.example.model.Car;
import org.example.model.CarMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class CarDAOImpl implements CarDAO {
    private final JdbcTemplate jdbcTemplate;


    public CarDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    @Override
    public Car findCarByUuid(UUID carUuid) {
        return jdbcTemplate
                .queryForObject("SELECT * FROM car where car_uuid = ?"
                        ,new Object[]{ carUuid }
                        , new CarMapper());
    }

    @Override
    public List<Car> findAllCarsByMakeName(String make) {
        String sql = "SELECT * FROM car WHERE make = ?";
        return jdbcTemplate
                .query(sql, new Object[]{make}, new CarMapper());
    }

    @Override
    public void saveCar(Car car) {
        jdbcTemplate
                .update("INSERT INTO car (make, model, price) VALUES(?, ?, ?)",
                        car.getMake(),
                        car.getModel(),
                        car.getPrice());
    }

    @Override
    public void updateCar(Car car) {
    jdbcTemplate
            .update("UPDATE car SET make = ?, model = ?, price = ? WHERE car_uuid = ?",
                    car.getMake(),
                    car.getModel(),
                    car.getPrice(),
                    car.getCar_uuid()
            );
    }
}
