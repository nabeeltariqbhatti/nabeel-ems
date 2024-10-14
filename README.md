# RAK BANK EVENT MANAGEMENT SYSTEM



![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Apache Kafka](https://img.shields.io/badge/Apache%20Kafka-000?style=for-the-badge&logo=apachekafka) ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)


_Event Booking Backend._

| Links                                                                                                                                            | Description    |
|--------------------------------------------------------------------------------------------------------------------------------------------------| -------------- |
| [![General Badge](https://img.shields.io/badge/version-1.0-COLOR.svg?logo=LOGO")](https://github.com/nabeeltariqbhatti/rtabank-ems)| Backend - v1.0 |



| Feature                | Description                                                   |
|------------------------|---------------------------------------------------------------|
| **Language**            | Java                                                          |
| **Framework**           | Spring Boot                                                   |
| **API Documentation**   | Integrated with Swagger for API documentation                 |
| **Database**            | H2 Database (in-memory) for development and testing           |
| **Observability**       | Micrometer Observability using Zipkin for distributed tracing |
| **Messaging**           | Kafka for async messaging                                     |
| **Rate Limiting**       | Rate limiting managed through Spring Cloud Gateway            |
| **Testing**             | JUnit Jupiter 5 for testing                                   |

## Requirements

To run this project you would need:


- [JDK 21](https://www.oracle.com/java/technologies/javase/jdk22-archive-downloads.html)
- [Maven 3](https://maven.apache.org)
- [Kafka](https://kafka.apache.org/downloads)
- [Docker](https://docs.docker.com/engine/install/)



## Run Instructions

  You can simply run docker compose file and everything will be ready:

- [Docker Compose File](https://github.com/nabeeltariqbhatti/rtabank-ems/blob/master/docker-compose.yaml)

1. Download Docker Compose file and in the same  directory where its located run:
    ``` bash
      $ docker compose up

To run the application one by one you  can follow these steps
1. Clone the repository to your local machine
    ``` bash
     $ git clone https://github.com/nabeeltariqbhatti/nabeel-ems.git`
2. Navigate to the repo directory
   ``` bash
    $ cd  YOUR_REPO_NAME`
3. Navigate to the project
   ``` bash
    $ cd  PROJECT_DIRECTORY
4. Build the application using Maven
    ``` bash
      $ mvn clean install`
4. Run the application
    ``` bash
      $ mvn spring-boot:run`




Released under the Apache License 2.0. See the [LICENSE](https://github.com/codecentric/springboot-sample-app/blob/master/LICENSE) file.
