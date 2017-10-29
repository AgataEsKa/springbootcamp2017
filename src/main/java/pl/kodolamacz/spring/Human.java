package pl.kodolamacz.spring;

/**
 * Created by acacko on 29.10.17
 */
public class Human {

    private Leg leg;

    public Human() {}

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
