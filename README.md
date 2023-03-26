# Lagalt-Backend
Lagalt project backend


Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 11](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
- postgre sql database setup
- Keyclock server

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `LagaltBackendApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```


# Project overview
The site will be used to facilitate connecting individuals in creative fields with projects
that need their specific skill sets.

- This project uses Oauth2 keyclock serve for google authentication 
