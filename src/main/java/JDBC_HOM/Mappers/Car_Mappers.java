package JDBC_HOM.Mappers;

import JDBC_HOM.Models.Car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Car_Mappers {
    public static List<Car> mepToListOfCars(ResultSet resultSet) throws SQLException {
        List<Car> list=new ArrayList<>();
        while (resultSet.next()){
            Car car=new Car(resultSet.getInt(1),resultSet.getString(2)
                    ,resultSet.getString(3),resultSet.getInt(4));
            list.add(car);
        }
        return list;
    }
}
