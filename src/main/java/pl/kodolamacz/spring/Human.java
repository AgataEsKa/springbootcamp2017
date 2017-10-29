package pl.kodolamacz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by acacko on 29.10.17
 */
@Component
public class Human {

    private Leg leg;

    public Human() {}

    @Autowired
    public Human(Leg leg) {
        this.leg = leg;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Human{" +
                "leg=" + leg +
                '}';
    }
}
