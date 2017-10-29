package pl.kodolamacz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Created by acacko on 29.10.17
 */
@Component
public class Human {

    @Autowired
    private Leg leg;

    public Human() {
        System.out.println("Bezparametrowy");
    }

//    public Human(Leg leg) {
//        Assert.notNull(leg, "Leg is NULL!");
//        this.leg = leg;
//        System.out.println("Wstrzykuję nogę");
//    }

    public Leg getLeg() {
        return leg;
    }

//    public void setLeg(Leg leg) {
//        this.leg = leg;
//    }

    @Override
    public String toString() {
        return "Human{" +
                "leg=" + leg +
                '}';
    }
}
