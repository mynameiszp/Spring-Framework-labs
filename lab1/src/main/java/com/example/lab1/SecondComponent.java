package com.example.lab1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SecondComponent implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Second");
    }
}
