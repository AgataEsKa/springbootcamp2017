package pl.kodolamacz.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

/**
 * Created by acacko on 29.10.17
 */
@Configuration
public class Beans {

    @Bean(initMethod = "init")
    @Scope(value = SCOPE_PROTOTYPE)
    public Leg createLeg() {
        return new Leg(5);
    }

    @Bean
    public Human getHuman(){
        return new Human(createLeg());
    }

    @Bean
    public Human getUnnormalHuman() {
        Human human = new Human();
        Leg leg = createLeg();
        leg.setFingerAmount(20);
        human.setLeg(leg);
        return human;
    }

}
