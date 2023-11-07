package dev.macula.samples.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackageClasses = {dev.macula.boot.starter.system.controller.SystemController})
@SpringBootApplication
public class MaculaSamplesService2Application {
    public static void main(String[] args) {
        SpringApplication.run(MaculaSamplesService2Application.class, args);
    }
}
