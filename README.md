# Project Architecture
An example project that demonstrates an end-to-end cloud-native platform using Spring Cloud for building a practical microservices architecture.


![https://github.com/idak/microservices-example/blob/v1.sprint.1/docs/archi-microservices.jpg](https://github.com/idak/microservices-example/blob/v1.sprint.1/docs/archi-microservices.jpg)


# Mock Data

The microservices use an H2 database, the data and schema are loaded from data.sql and schama.sql files located at src/main/resources.


# Run the Book microservice


To run the book microservice, execute:

```sh

./gradlew book-service:build && java -jar book-service/build/libs/book-service.jar

```

The  REST Api is available here [http://localhost:8080](http://localhost:8080)

# Run the Author microservice

To run the book microservice, execute:

```sh

./gradlew author-service:build && java -jar author-service/build/libs/author-service.jar

```

The  REST Api is available here [http://localhost:8181](http://localhost:8080)

@TODO
Other components are in progress