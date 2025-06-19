package com.christopher.userauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

///Marks class as Source of Spring beans
//Automatically configures the App Based on dependencies
//Automatically finds and wires up other classes(controllers & services)
@SpringBootApplication
public class UserAuthenticationAppApplication {

    public static void main(String[] args) throws Throwable {
        //Boots up the entire Spring context, starts Tomcat serve
        SpringApplication.run(UserAuthenticationAppApplication.class, args);
    }

}
