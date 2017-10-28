package pl.kodolamacz.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by acacko on 28.10.17
 */
public class Aplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

        Car car = context.getBean(Car.class);
//        Car car = (Car) context.getBean("car"); // ale lepiej:
        Car carDuplikaty = context.getBean("car", Car.class);
        Car car2 = context.getBean("car2", Car.class);
        Car car3 = context.getBean("car3", Car.class);
        System.out.println(car.toString());
        System.out.println(car2.toString());

        System.out.println("car2.getWheel() == car3.getWheel() -> " + (car2.getWheel() == car3.getWheel()));

        Wheel bean2 = context.getBean(Wheel.class);
        System.out.println(bean2.toString());

        System.out.println("bean.getWheel()=" + car.getWheel());

        System.out.println("Wheel1 = " + bean2 + ", Wheel2 = " + car.getWheel());

        context.close();

    }
}
