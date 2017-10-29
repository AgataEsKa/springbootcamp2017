package pl.kodolamacz.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by acacko on 29.10.17
 */

@Service
public class UserService {


    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void doSomething(){
        System.out.println(userRepository);
    }



}
