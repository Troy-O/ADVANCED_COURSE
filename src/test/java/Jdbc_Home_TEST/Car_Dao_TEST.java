package Jdbc_Home_TEST;

import JDBC_HOM.Dao.Dao;
import JDBC_HOM.Dao.Impl.Car_Dao;
import JDBC_HOM.Models.Car;
import JDBC_HOM.Service.Impl.Car_Service_impl;
import JDBC_HOM.Service.Service_Car_;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Car_Dao_TEST {



    @BeforeEach
    void befor_each_test(){
        Dao<Car,Integer> car_dao=new Car_Dao();
        Service_Car_ service_car_=new Car_Service_impl(car_dao);

    }
}
