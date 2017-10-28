package pl.kodolamacz.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by acacko on 28.10.17
 */
public class Aplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");

//        Car bean = context.getBean(Car.class); // tutaj będzie błąd braku unikalności Beana Car
        Car bean = context.getBean("car", Car.class);
        System.out.println(bean.toString());

        Wheel bean2 = context.getBean(Wheel.class);
        System.out.println(bean2.toString());

        System.out.println("bean.getWheel()=" + bean.getWheel());

        System.out.println("Wheel1 = " + bean2 + ", Wheel2 = " + bean.getWheel());

    }
}
