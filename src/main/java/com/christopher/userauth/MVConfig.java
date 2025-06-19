package com.christopher.userauth;

//marks class as Configuration-Class
import org.springframework.context.annotation.Configuration;
//Allows registering simple URL routes directly to view files, e.g. HTML
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//Interface that allows to configure Spring MVC
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVConfig implements WebMvcConfigurer { //MVConfig Implementing an Interface

    //Sets the routes to the html Files
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home"); // Shows home.html when /home is called
        registry.addViewController("/").setViewName("home"); // Shows home.html when / is called
        registry.addViewController("/hello").setViewName("home"); //Shows home.html when /hello is called
        registry.addViewController("/login").setViewName("login"); //Shows login.html when /login is called
    }
}
