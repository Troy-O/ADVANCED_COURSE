package JDBC_HOM.Service.Impl;

import JDBC_HOM.Dao.Dao;
import JDBC_HOM.Dao.Impl.About_car_Dao;
import JDBC_HOM.Models.About_car;
import JDBC_HOM.Service.Service_about_car;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class About_car_Service_imp implements Service_about_car {

    Dao<About_car,Integer> about_car_dao;

    public About_car_Service_imp(Dao<About_car,Integer> about_car_dao) {
        this.about_car_dao = about_car_dao;
    }

    @Override
    public void displayAll() {
        try {
            List<About_car>about_cars=about_car_dao.getAll();
            about_cars.forEach(System.out::println);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void displayById(int id) {
        Optional<About_car>optional= null;
        try {
            optional = about_car_dao.getById(id);
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
    public void create(About_car about_car) {
        try{
            about_car_dao.insert(about_car);
        }catch (Exception e){
            e.getMessage();
            e.getStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try{
            about_car_dao.delete(id);
        }catch (Exception e){
            e.getMessage();
            e.getStackTrace();
        }

    }
}
