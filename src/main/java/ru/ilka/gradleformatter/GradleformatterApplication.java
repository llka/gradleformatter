package ru.ilka.gradleformatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "ru.ilka.gradleformatter")
public class GradleformatterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleformatterApplication.class, args);
    }

}
