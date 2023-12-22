package org.example.spring.dao;

import org.example.model.Car;
import org.example.model.CarMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CarDAOImpl implements CarDAO {
    private final JdbcTemplate jdbcTemplate;
    private final RowMapper<Car> carRowMapper;


    public CarDAOImpl(JdbcTemplate jdbcTemplate, RowMapper<Car> carRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.carRowMapper = carRowMapper;

    }

    @Override
    public List<Car> findAllByMake(String make) {
        String sql = "SELECT * FROM car WHERE make = ?";
        List<Car> car = jdbcTemplate.query(
                sql, new Object[]{make}, new CarMapper());
        return car;
    }
}
