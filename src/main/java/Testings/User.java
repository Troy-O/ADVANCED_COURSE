package Testings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private String fullName;
    Adress adress;
    private int age;
    List<Animal> list=new ArrayList<Animal>();

    public User(String fullName, Adress adress, int age, List<Animal> list) {
        this.fullName = fullName;
        this.adress = adress;
        this.age = age;
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", adress=" + adress +
                ", age=" + age +
                ", list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(fullName, user.fullName) && Objects.equals(adress, user.adress) && Objects.equals(list, user.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, adress, age, list);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
