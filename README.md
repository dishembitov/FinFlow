# FinFlow - Microservices Architecture for Internet Banking with Java Spring Boot

This is a comprehensive internet banking system built with Spring Boot microservices architecture, providing a full-featured banking API infrastructure for financial operations.

### Quick Start Guide

1. Repository cloning:

```bash
$ git clone https://github.com/dishembitov/FinFlow.git
```

2. Navigate to Docker configuration directory:

```bash
$ cd FinFlow/docker-compose
```
3. Start application using docker-compose:

3. Launch the application stack using Docker Compose:

```bash
$ docker-compose up -d
```

#### Docker Containers

Container | IP | Port Mapping |
--- | --- | --- |
openzipkin_server | 172.25.0.12 | 9411
keycloak_web | 172.25.0.11 | 8080
keycloak_postgre_db | 172.25.0.10 | 5432(Closed Port)
mysql_dishembitov_app | 172.25.0.9 | 3306
finflow-config-server | 172.25.0.8 | 8090
finflow-service-registry | 172.25.0.7 | 8081
finflow-api-gateway | 172.25.0.6 | 8082
finflow-user-service | 172.25.0.5 | 8083
finflow-fund-transfer-service | 172.25.0.4 | 8084
finflow-utility-payment-service | 172.25.0.3 | 8085
core-banking-service | 172.25.0.2 | 8092

### API Testing Suite

A comprehensive Postman collection is available for API testing:

[Postman Collection](https://raw.githubusercontent.com/dishembitov/FinFlow/main/postman_collection/finflow_microservices.postman_collection.json)

Import the collection and select the `LOCAL_DOCKER_SETUP` environment configuration.

#### Sample Test Data

The system comes pre-configured with test data including:
- Demo accounts and user profiles in the core banking database
- Pre-configured Keycloak instance with realms, clients, and user credentials

Begin testing with the `AUTHENTICATION` endpoint in the finflow collection.

```
Test Login Credentials: ib_admin@mail.com / password
```

### Services

1. **User Service** - Handles all user operations including registrations and retrieval, consuming Keycloak REST API for user management while utilizing a local PostgreSQL database.

2. **Fund Transfer Service** - Manages all fund transfers between accounts and pushes messages to a centralized RabbitMQ queue for the Notification service.

3. **Payment Service** - Includes all API endpoints for processing utility payments and sends notification messages to RabbitMQ.

4. **Notification Service** - (pending) Registered under the service registry, consumes messages from RabbitMQ and pushes necessary notifications.

5. **Banking Core Service** - Provides core banking functionality with account management, user profiles, transaction processing, and banking operation handlers.

6. **API Gateway** - Provides a unified entry point for all microservices with routing and security capabilities.

7. **Service Registry** – Netflix Eureka server for service discovery and registration.

8. **Config Server** – Spring Cloud Config server backed by Git repository for centralized configuration management.

### Technology Stack

1. Java 21
2. Spring Boot 3.2.4
3. Spring Cloud 2023.0.0
4. Netflix Eureka (Service Discovery)
5. Spring Cloud Gateway (API Routing)
6. Spring Cloud Config (Centralized Configuration)
7. Zipkin (Distributed Tracing)
8. Spring Cloud Sleuth (Log Correlation)
9. OpenFeign (Declarative REST Client)
10. RabbitMQ (Message Broker)
11. MySQL (Primary Data Store)
12. PostgreSQL (Keycloak Database)
13. Keycloak (Identity & Access Management)
14. Docker / Docker Compose (Containerization)