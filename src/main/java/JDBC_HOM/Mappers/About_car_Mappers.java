package JDBC_HOM.Mappers;

import JDBC_HOM.Models.About_car;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class About_car_Mappers {
    public static List<About_car> mepToListOfAbout_cars(ResultSet resultSet) throws SQLException {
        List<About_car> list=new ArrayList<>();
        while (resultSet.next()){
            About_car about_car=new About_car(resultSet.getInt(1),resultSet.getString(2)
                    ,resultSet.getString(3),resultSet.getInt(4));
            list.add(about_car);
        }
        return  list;
    }
}
