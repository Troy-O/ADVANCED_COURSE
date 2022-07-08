package JDBC_HOM.Dao.Impl;

import JDBC_HOM.Dao.Dao;
import JDBC_HOM.JDBC_con.MySqlConnector;
import JDBC_HOM.Mappers.About_car_Mappers;
import JDBC_HOM.Mappers.Car_Mappers;
import JDBC_HOM.Models.About_car;
import JDBC_HOM.Models.Car;

import java.sql.*;
import java.util.List;
import java.util.Optional;

public class Car_Dao implements Dao<Car,Integer> {
   private Connection connection;

    public Car_Dao() {
        this.connection=new MySqlConnector().getConnection();
    }

    @Override
    public List<Car> getAll() throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM car ");

        return Car_Mappers.mepToListOfCars(resultSet);
    }

    @Override
    public Optional<Car> getById(Integer id) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM car WHERE  id='" + id + "'");


        Car car = Car_Mappers.mepToListOfCars(resultSet).get(0);
        return Optional.of(car);
    }

    @Override
    public void insert(Car objects) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO  car(name,model,years) VALUES (?,?,?)"
        );
        preparedStatement.setString(1,objects.getName());
        preparedStatement.setString(2,objects.getModel());
        preparedStatement.setInt(3,objects.getYears());
        preparedStatement.execute();

    }

    @Override
    public void delete(Integer id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE  FROM  car where id=?");
        preparedStatement.setInt(1,id);
        preparedStatement.execute();


    }

    @Override
    public void close_connection() throws SQLException {
        this.connection.close();

    }


}
