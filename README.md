# springboot-assignment-app

[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 11](https://www.oracle.com/mx/java/technologies/javase/jdk11-archive-downloads.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Questions and Answers

1. Can you implement the sing() method for the bird?
    How did you unit test it: I've called the method on the test packages to check the 
    How did you optimize the code for maintainability? Name things clearly and consistently.
2. Tests passed for Duck And Chicken talk
3. Chicken is the younger version of rooster. Without using inheritance a rooster could be the primitive version of the chicken.
4. We invoke the animal's or phone talk method for each case so we don't need add the sounds to parrot class

## Deploying the application to k8s