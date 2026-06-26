# Eureka Server

[![CI](https://github.com/Axel-DaMage/fullstack-ss-eureka-server/actions/workflows/ci.yml/badge.svg)](https://github.com/Axel-DaMage/fullstack-ss-eureka-server/actions/workflows/ci.yml)
[![Docker](https://github.com/Axel-DaMage/fullstack-ss-eureka-server/actions/workflows/docker.yml/badge.svg)](https://github.com/Axel-DaMage/fullstack-ss-eureka-server/actions/workflows/docker.yml)
![Java](https://img.shields.io/badge/java-17-orange)
![Spring Cloud](https://img.shields.io/badge/spring%20cloud-2022.0.4-blue)

Eureka service discovery server for Sanos y Salvos microservices.

## Stack

- Java 17, Spring Boot 3.1.2
- Spring Cloud Netflix Eureka Server
- Maven

## Quick start

```bash
mvn clean install
mvn spring-boot:run
```

## Configuration

```yaml
server:
  port: 8761

eureka:
  client:
    registerWithEureka: false
    fetchRegistry: false
```

## Endpoints

| Path | Description |
|------|-------------|
| `/` | Eureka dashboard |
| `/eureka/apps` | Registered applications (XML) |
| `/actuator/health` | Health check |

All microservices register at `http://eureka-server:8761/eureka/`.
