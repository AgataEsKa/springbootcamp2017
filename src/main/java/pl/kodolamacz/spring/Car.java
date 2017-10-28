package pl.kodolamacz.spring;

import java.util.regex.Pattern;

/**
 * Created by acacko on 28.10.17
 */
public class Car {

    private Wheel wheel;

    private String name;

    private Pattern pattern;

    public Car(){}

    public Car(Wheel wheel) {
        this.wheel = wheel;
    }

    public Car(String carName) {
        this.name = carName;
        this.wheel = new Wheel();
    }

    //    wymagane public, void i bez argumentów
    public void init(){
        System.out.println("START CAR");
    }

    // te same restrykcje
    public void destroy() {
        System.out.println("STOP CAR");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Pollution produceStaticPollution() {
        return new Pollution();
    }

    public Pollution producePollution() {
        return new Pollution();
    }
}
