package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SSMPApplication {

    public static void main(String[] args) {
        System.out.println("this is hot fix----------");
        System.out.println("??????");
        System.out.println("this is hot fix2----------");
        System.out.println("this is push-test");
        System.out.println("this is pull-test");
        SpringApplication.run(SSMPApplication.class, args);     
    }

}
