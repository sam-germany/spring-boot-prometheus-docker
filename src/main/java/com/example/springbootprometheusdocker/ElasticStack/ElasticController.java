package com.example.springbootprometheusdocker.ElasticStack;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
public class ElasticController {

    Logger logger=LoggerFactory.getLogger(ElasticController.class);

    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable int id) {
        List<User> users=getUsers();
        User user=users.stream().
                filter(u->u.getId()==id).findAny().orElse(null);
        if(user!=null){
            logger.info("user found : {}",user);
            return user;
        }else{
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("User Not Found with ID : {}",id);
            }
            return new User();
        }
    }


    private List<User> getUsers() {
        return Stream.of( new User(1, "a-firstname","a-lastname", "a-city"),
                          new User(2, "b-firstname","b-lastname", "b-city"),
                          new User(3, "c-firstname","c-lastname", "c-city"),
                          new User(4, "d-firstname","d-lastname", "d-city"))
                .collect(Collectors.toList());
    }

}
