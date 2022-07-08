package JDBC_HOM.Service;

import JDBC_HOM.Models.About_car;

public interface Service_about_car {
    void displayAll();
    void displayById(int id);
    void create(About_car about_car);
    void delete(int id);
}
