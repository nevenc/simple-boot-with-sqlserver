package com.example;

import com.example.domain.SuperHero;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationLoader implements CommandLineRunner {

    private static final Faker FAKER = new Faker();

    @Autowired
    private SuperHeroRepository repository;

    @Override
    public void run(String... strings) throws Exception {

        // add 100 new heroes
        for (int i=0; i<100; i++) {
            repository.save(new SuperHero(FAKER.superhero().name(),FAKER.superhero().power()));
        }

    }

}
