package org.example.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements RowMapper<Car> {
    @Override
    public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
        Car car = new Car();
        car.setMake(rs.getString("make"));
        car.setModel(rs.getString("model"));
        car.setPrice(rs.getDouble("price"));

        return car;
    }
}
