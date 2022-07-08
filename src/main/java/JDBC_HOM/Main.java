package JDBC_HOM;

import JDBC_HOM.Dao.Dao;
import JDBC_HOM.Dao.Impl.About_car_Dao;
import JDBC_HOM.Dao.Impl.Car_Dao;
import JDBC_HOM.Models.About_car;
import JDBC_HOM.Models.Car;
import JDBC_HOM.Service.Impl.About_car_Service_imp;
import JDBC_HOM.Service.Impl.Car_Service_impl;
import JDBC_HOM.Service.Service_Car_;
import JDBC_HOM.Service.Service_about_car;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Dao<About_car,Integer> about_car_dao=new About_car_Dao();
        Service_about_car service_about_car=new About_car_Service_imp(about_car_dao);


//        service_about_car.displayAll();
//        System.out.println("__________________________________");
//        service_about_car.create(new About_car("Black","3.0V",12500));
//        service_about_car.create(new About_car("Green","2.0W",130000));
//        service_about_car.create(new About_car("Yellow","6.0V",50000));
//        System.out.println("__________________________________");
//        service_about_car.displayAll();
//        System.out.println("__________________________________");
//        service_about_car.displayById(3);
//        service_about_car.delete(1);
        Dao<Car,Integer> car_dao=new Car_Dao();
        Service_Car_ service_car_=new Car_Service_impl(car_dao);
        try {
            car_dao.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


//        service_car_.displayAll();
////        System.out.println("_________");
////        service_car_.create(new Car("BMW","X5",70000));
////            service_car_.displayById(2);
////        System.out.println("_________");
////        service_car_.displayAll();


    }
}
