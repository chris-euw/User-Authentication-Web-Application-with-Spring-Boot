# User-Authentication-Web-Application-with-Spring-Boot
A Spring Boot web application demonstrating user authentication with Spring Security, Thymeleaf, and H2. Built by following the official Spring guide, this project showcases form-based login, protected routes, and view rendering with MVC.
This is a learning Project for myself to understand better how the Spring boot Applications work. I try to understand each step and comment my code for my own and other peoples understanding. Learning Documentation: https://www.notion.so/User-Authentication-Web-App-with-Spring-Boot-in-Java-215fec30d26f80ecae5df570dadce491?source=copy_link

# User Authentication Web Application with Spring Boot

This is a simple Spring Boot web application that demonstrates **user authentication** using **Spring Security**, **Thymeleaf**, and **H2 database**.  
It follows the official [Spring Security Getting Started Guide](https://spring.io/guides/gs/securing-web/) to provide a clear learning example of form-based login.

---

## Features

-  Form-based login with Spring Security
-  Role-based access control
-  In-memory user authentication
-  HTML templates using Thymeleaf
-  Lightweight, in-memory H2 database
-  View routing via Spring MVC

---

## Technologies used

- Java 21
- Spring Boot 3.5.x
- Spring Security
- Thymeleaf
- H2 Database
- Maven (build tool)

---

## Getting Started

###  Clone the repo
```bash
git clone https://github.com/chris-euw/User-Authentication-Web-Application-with-Spring-Boot.git
cd User-Authentication-Web-Application-with-Spring-Boot

### Clone the repo

```bash
git clone https://github.com/chris-euw/User-Authentication-Web-Application-with-Spring-Boot.git
cd User-Authentication-Web-Application-with-Spring-Boot
```

### Run the Application

```bash
./mvnw spring-boot:run
```

### Default Credentials

- **Username:** `user`  
- **Password:** *(auto-generated, check console output)*  
  *(To customize, edit `WebSecurityConfig.java`)*

---

## Based on the official Spring Security guide  
Created by **chris-euw**.

