package pl.kodolamacz.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by acacko on 29.10.17
 */
public class Aplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Beans.class);

        Human human = context.getBean(Human.class);
        Leg leg = context.getBean(Leg.class);

        System.out.println(human);
        System.out.println(leg);

        System.out.println("leg == human.getLeg() = " + (leg == human.getLeg()));

//        Human unnormalHuman = context.getBean("getUnnormalHuman", Human.class);


        context.close();

    }
}
