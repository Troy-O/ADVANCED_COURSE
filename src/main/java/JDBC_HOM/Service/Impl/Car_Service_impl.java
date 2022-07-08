package JDBC_HOM.Service.Impl;

import JDBC_HOM.Dao.Dao;
import JDBC_HOM.Dao.Impl.Car_Dao;
import JDBC_HOM.Models.About_car;
import JDBC_HOM.Models.Car;
import JDBC_HOM.Service.Service_Car_;
import JDBC_HOM.Service.Service_about_car;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class Car_Service_impl implements Service_Car_ {
    Dao<Car,Integer> car_dao;

    public Car_Service_impl( Dao<Car,Integer> car_dao) {
        this.car_dao = car_dao;
    }

    @Override
    public void displayAll() {
        try {
            List<Car> car = car_dao.getAll();
            car.forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public void displayById(int id) {
        Optional<Car> optional= null;
        try {
            optional = car_dao.getById(id);
            if (optional.isPresent()){
                System.out.println(optional.get());
            }else {
                System.out.println("Not found record with id"+id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(Car car) {
        try {
            car_dao.insert(car);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(int id) {
        try {
            car_dao.delete(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
