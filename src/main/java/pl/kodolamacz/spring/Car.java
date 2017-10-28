package pl.kodolamacz.spring;

/**
 * Created by acacko on 28.10.17
 */
public class Car {

    private Wheel wheel;

    private String name;

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    public Car(String name) {
        this.name = name;
        this.wheel = new Wheel();
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return name;
    }
}
