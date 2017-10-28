package pl.kodolamacz.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by acacko on 28.10.17
 */
public class Aplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");


    }
}
