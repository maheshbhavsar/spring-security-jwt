package com.springsecurity.jwt.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springsecurity.jwt.api.entity.User;
import com.springsecurity.jwt.api.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(101, "Mahesh", "mahesh", "mahesh@gmail.com"),
                new User(102, "admin", "admin", "admin@gmail.com"),
                new User(103, "guest", "guest", "guest@gmail.com"),
                new User(104, "user", "user", "user@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
