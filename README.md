# Project Architecture
An example project that demonstrates an end-to-end cloud-native platform using Spring Cloud for building a practical microservices architecture.


![https://github.com/idak/microservices-example/blob/master/docs/archi-microservices.jpg](https://github.com/idak/microservices-example/blob/master/docs/archi-microservices.jpg)


# Mock Data

The microservices use an H2 database, the data and schema are loaded from data.sql and schama.sql files located at `src/main/resources`.


# Centralized Configuration

The configuration is in git repository ![https://github.com/idak/microservices-config](https://github.com/idak/microservices-config) and all services consuming configuration from, the Spring Cloud Config Server.

# Config Server

To run the config server, execute:

```sh

/gradlew config-server:build && java -jar config-server/build/libs/config-server.jar


```

The config for book-service and author-service are available here :

**Book cloud config :** [http://localhost:8888/book-service/master](http://localhost:8888/book-service/master)

**Author cloud config :** [http://localhost:8888/author-service/master](http://localhost:8888/author-service/master)

# Book microservice


To run the book microservice, execute:


```sh

./gradlew book-service:build && java -jar book-service/build/libs/book-service.jar

```

The  REST Api is available here [http://localhost:8080](http://localhost:8080)

# Author microservice

To run the book microservice, execute:

```sh

./gradlew author-service:build && java -jar author-service/build/libs/author-service.jar

```

The  REST Api is available here [http://localhost:8181](http://localhost:8080)

# Eureka Server
**@TODO**

# API Gateway
**@TODO**

# RabbitMQ and async Events
**@TODO**

# Docker
**@TODO**


