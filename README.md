# Alerta Vecinal Backend

Backend implementation for AlertaVecinal app

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install.

* [JDK 8](https://www.oracle.com/technetwork/java/javase/downloads/) - Java Development Kit
* [MariaDB](https://mariadb.com/) - Relational Database 


### Installing API

Step 1 Clone this repo 

```
git clone https://github.com/Ashdart/backend.git
```

then compile and download al dependencies

```
mvnw clean install
```

Create an empty MaraDB database

```
CREATE DATABASE mydb;
```

Change the root password in application-local.properties file if needed. 

```
spring.datasource.password=<YOUR ROOT PASSWORD>
```

## Running the backend 

```
mvnw spring-boot:run
```

## Coding style tests

We are using EditorConfig to format code in a standarized way, please make sure you are using and EditorConfig plugin for you IDE

* [EditorConfig](https://editorconfig.org/) - EditorConfig helps maintain consistent coding styles for multiple developers working on the same project across various editors and IDEs

## Deployment

```
mvnw clean package
```
WAR File will be created under ./target/alertavecinal.war

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [Maven](https://maven.apache.org/) - Dependency Management
* [SWAGGER](https://swagger.io/) - Simplify API development for users, teams, and enterprises with the Swagger open source and professional toolset