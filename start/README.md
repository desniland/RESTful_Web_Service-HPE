##Proposal for a RESTful Web Service  {BACKEND}

-This project purpose is learn  basics of Java Spring Boot, HPE GreenLake and RESTful Web Services

#Projects Objectives
  1)  Explore the technical documentation for Java Spring Boot and GreenLake Cloud Platform
  2)  Write a proposal for a RESTful web service to manage a list of employees

##Containerizing, packaging, and running a Spring Boot application

#Getting started

> Clone the Git repository and use the projects that are provided inside:

$ git clone https://github.com/openliberty/guide-spring-boot.git
$ cd guide-spring-boot


- The start directory contains the starting project that you will build upon.

- The finish directory contains the finished project that you will build.

##prerequisites.

> Java SDK 17+
> Maven
> Git

##Building and running application

- LINUX

$ cd start
$ mvnw.cmd package

- You can now run the application in the embedded Tomcat web container by executing the JAR file that you built:

$ java -jar target/guide-spring-boot-0.1.0.jar

> Go to the http://localhost:8080/hello URL to access the application.
