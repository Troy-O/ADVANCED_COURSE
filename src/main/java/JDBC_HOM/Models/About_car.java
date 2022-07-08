package JDBC_HOM.Models;

import java.util.Objects;

public class About_car {
    private int id;
    private    String color;
    private  String engine;
    private  double price;



    public About_car(int id, String color, String engine, double price) {
        this.id = id;
        this.color = color;
        this.engine = engine;
        this.price = price;
    }


    public About_car(String color, String engine, double price) {
        this.color = color;
        this.engine = engine;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        About_car about_car = (About_car) o;
        return id == about_car.id && Double.compare(about_car.price, price) == 0 && Objects.equals(color, about_car.color) && Objects.equals(engine, about_car.engine);
    }

    @Override
    public String toString() {
        return "About_car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
