package JDBC_HOM.Service;

import JDBC_HOM.Models.About_car;
import JDBC_HOM.Models.Car;

public interface Service_Car_ {
    void displayAll();
    void displayById(int id);
    void create(Car car);
    void delete(int id);
}
