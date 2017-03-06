# Project Architecture
An example project that demonstrates an end-to-end cloud-native platform using Spring Cloud for building a practical microservices architecture.


![https://github.com/idak/microservices-example/blob/master/docs/archi-microservices.jpg](https://github.com/idak/microservices-example/blob/master/docs/archi-microservices.jpg)


# Data Mock

Microservices use an H2 database, schema and data are loaded from [schama.sql](https://github.com/idak/microservices-example/blob/master/author-service/src/main/resources/schama.sql) and [data.sql](https://github.com/idak/microservices-example/blob/master/author-service/src/main/resources/data.sql) files located at `src/main/resources`.


# Centralized Configuration (Config Server)

The configuration is in a git repository [https://github.com/idak/microservices-config](https://github.com/idak/microservices-config) and all services consuming configuration from the Spring Cloud Config Server.

To run the config server, execute:

```sh

./gradlew config-server:build && java -jar config-server/build/libs/config-server-0.1.0.jar


```

You can confirm that the Config Server is up by visiting :

**Book cloud config :** [http://localhost:8888/book-service/master](http://localhost:8888/book-service/master)

**Author cloud config :** [http://localhost:8888/author-service/master](http://localhost:8888/author-service/master)


# Service Registration (Eureka Server)

To run the config server, execute:

```sh
./gradlew eureka-server:build && java -jar eureka-server/build/libs/eureka-server-0.1.0.jar
```


# Book microservice


To run the book microservice, execute:


```sh

./gradlew book-service:build && java -jar book-service/build/libs/book-service-0.1.0.jar

```

Check out the book api :   [http://localhost:8080](http://localhost:8080)

# Author microservice

To run the book microservice, execute:

```sh

./gradlew author-service:build && java -jar author-service/build/libs/author-service-0.1.0.jar --server.port=8181

```

Check out the author api  [http://localhost:8181](http://localhost:8181)


# (Routing and Filtering) API Gateway

This API use Netflix Zuul to forward requests to all microservices, to run it, execute :

```sh

./gradlew api-gateway:build && java -jar api-gateway/build/libs/api-gateway-0.1.0.jar --server.port=9090

```

Now, author and book services are avialable at : [http://localhost:9090/books](http://localhost:9090/books) and [http://localhost:9090/authors](http://localhost:9090/authors)


To scale book service, use a different port for each instance :

```sh

java -jar book-service/build/libs/book-service-0.1.0.jar --server.port=8282

java -jar book-service/build/libs/book-service-0.1.0.jar --server.port=8383

```

To scale author service, execute : 

```sh

java -jar author-service/build/libs/author-service-0.1.0.jar --server.port=8484

java -jar author-service/build/libs/author-service-0.1.0.jar --server.port=8585

```

# RabbitMQ and async Events
**@TODO**

# Docker
**@TODO**


