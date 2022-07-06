package Testings;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("Собака");
        Animal animal2=new Animal("Кіт");
        Animal animal3=new Animal("Хомяк");
        Adress adress=new Adress("Львів");
        List<Animal> animals=new ArrayList<>();
        animals.add(animal);
        animals.add(animal2);
        User user=new User("Діма",adress,19,animals);
        UserMethod userMethod=new UserMethod("Діма",adress,19,animals);
//        try {
//            userMethod.user_18(user);
//        } catch (Custom_exception e) {
//            throw new RuntimeException(e);
//        }
//
        userMethod.add_adress(user);
//        userMethod.remove_adress(user);
//        userMethod.add_animals_to_user(user,animal3);
//        userMethod.remove_animals_to_user(user,animal2);
//        userMethod.edit_fullname(user);


    }
}
