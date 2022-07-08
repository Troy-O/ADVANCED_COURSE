package JDBC_HOM.Models;

import JDBC.car_about.About_car;

import java.util.Objects;

public class Car {
    private int id;
    private String name;
    private String model;
    private int years;


    public Car(int id, String car, String model, int years) {
        this.id = id;
        this.name = car;
        this.model = model;
        this.years = years;
    }

    public Car(String car, String model, int years) {
        this.name = car;
        this.model = model;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", car='" + name + '\'' +
                ", model='" + model + '\'' +
                ", years=" + years +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car1 = (Car) o;
        return id == car1.id && years == car1.years && Objects.equals(name, car1.name) && Objects.equals(model, car1.model);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, years);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String car) {
        this.name = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }


}
