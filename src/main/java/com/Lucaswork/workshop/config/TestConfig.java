package com.Lucaswork.workshop.config;

import com.Lucaswork.workshop.entities.User;
import com.Lucaswork.workshop.repositorys.UserRepositorys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepositorys userRepositorys;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "Maria@gmail.com","199929929","123123");
        User u2 = new User(null, "Paulo Brown", "TioPaulo@gmail.com","12231229","123123");
        userRepositorys.saveAll(Arrays.asList(u1,u2));
    }
}
