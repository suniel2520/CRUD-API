package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sunil = new Student(
                  "Sunil Kumar Gupta",
                  "sunielgupta2@gmail.com",
                  LocalDate.of(2000, Month.FEBRUARY, 8)
            );

            Student abhi = new Student(
                    "Abhisekh Barman",
                    "abhibest420@gmail.com",
                    LocalDate.of(1999, Month.AUGUST, 27)
            );

            repository.saveAll(
                    List.of(sunil, abhi)
            );

        };
    }
}
