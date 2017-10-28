package pl.kodolamacz.podstawy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acacko on 28.10.17
 */
public class Mercedes extends Car {

    public Mercedes(String color) {
        super(color);
    }

    @Override
    public String Beep() {
        return "Mercedes beep!" + color;
    }

    public static void main(String[] args) {
        List<Car> list = new ArrayList<>();

        Car car1 = new Car("Czerwony");
        Car car2 = new Mercedes("Czerwony");

        list.add(car1);
        list.add(car2);

        list.forEach(car -> System.out.println(car.Beep()));
    }
}
