package pl.kodolamacz.podstawy;

/**
 * Created by acacko on 28.10.17
 */
public class Car {

    protected String color;

    public Car(String color) {
        this.color = color;
    }

    public String Beep() {
        return "Beeeeeep!" + color;
    }
}
