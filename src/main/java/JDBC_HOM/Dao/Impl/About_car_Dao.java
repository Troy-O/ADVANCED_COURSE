package JDBC_HOM.Dao.Impl;

import JDBC_HOM.Dao.Dao;
import JDBC_HOM.JDBC_con.MySqlConnector;
import JDBC_HOM.Mappers.About_car_Mappers;
import JDBC_HOM.Models.About_car;

import java.sql.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class About_car_Dao implements Dao<About_car,Integer> {
    private Connection connection;



    public About_car_Dao() {
        this.connection=new MySqlConnector().getConnection();
    }



    @Override
    public List<About_car> getAll() throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM  about_car ");

        return About_car_Mappers.mepToListOfAbout_cars(resultSet);
    }

    @Override
    public Optional<About_car> getById(Integer id) throws SQLException {
        Statement statement = null;
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM about_car WHERE  id='" + id + "'");


        About_car about_car = About_car_Mappers.mepToListOfAbout_cars(resultSet).get(0);
        return Optional.of(about_car);
    }

    @Override
    public void insert(About_car aboutCar) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "INSERT INTO  about_car (color,engine,price) VALUES (?,?,?)"
        );
        preparedStatement.setString(1,aboutCar.getColor());
        preparedStatement.setString(2,aboutCar.getEngine());
        preparedStatement.setDouble(3,aboutCar.getPrice());
        preparedStatement.execute();
    }

    @Override
    public void delete(Integer id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "DELETE FROM about_car WHERE  id=?"
        );
        preparedStatement.setInt(1,id);
        preparedStatement.execute();

    }
    @Override
    public void close_connection() throws SQLException {
        this.connection.close();
    }
}
