# Clean Architecture Application with Spring Boot

## Overview

This project is a demonstration of **Clean Architecture** principles implemented using **Spring Boot** and **Maven**. The goal is to achieve a modular and maintainable architecture that adheres to the **Separation of Concerns** principle. The application is structured to ensure that the **business logic** is independent of frameworks, databases, and external systems.

---

## Clean Architecture Principles

**Clean Architecture** focuses on creating a system where:

- **Entities**: Represent core business rules and remain independent of the surrounding layers.
- **Use Cases**: Define application-specific business rules and act as the application's orchestrators.
- **Interface Adapters**: Transform data from external systems (e.g., databases, APIs) to match the application's core rules.
- **Frameworks & Drivers**: Handle implementation details like controllers, repositories, or external APIs.


- **Frameworks & Drivers**  
  This layer contains the external tools and frameworks, such as Spring Boot, used to interact with the application. It handles implementation details like controllers, web configurations, and database setups.

- **Interface Adapters**  
  Responsible for adapting external data (e.g., HTTP requests, database data) into a format suitable for the core application.  
  Example components:  
  - **DTOs**: Data Transfer Objects for request/response mapping.  
  - **Repositories**: For data persistence.

- **Use Cases**  
  Contains the application-specific business rules. Use cases define workflows and coordinate interactions between Entities and Adapters. This layer is the orchestration center of the system.

- **Entities**  
  Represents the core business logic of the application. Entities are independent of frameworks, databases, or external systems. They ensure that the business rules remain consistent regardless of external changes.

---

## Features

- **Separation of Concerns**: Each layer is isolated, making the codebase easier to maintain and scale.  
- **Testability**: Business logic is decoupled from external dependencies, enabling easier unit testing.  
- **Framework Independence**: The core layers (Entities and Use Cases) are independent of frameworks like Spring.  
- **Modularization**: Encourages high cohesion within layers and low coupling between them.

---

## Project Structure

The application is divided into the following modules:

1. **Core Module**  
   Contains the core business logic:
   - **Entities**: Core business objects.
   - **Use Cases**: Application-specific workflows.

2. **Adapters Module**  
   Responsible for transforming data and bridging external systems with the core:
   - **REST Controllers**: For handling API requests.
   - **DTOs**: For mapping data.
   - **Persistence**: For database operations.

3. **Frameworks Module**  
   Handles technical details like dependency injection, web configuration, and database setup:
   - **Spring Boot Configuration**
   - **Repositories and JPA**

## Prerequisites

Ensure you have the following installed:

- **Java 17+**
- **Maven 3.8+**
- **PostgreSQL (or any database of choice)**

---
## Key Dependencies
* Spring Boot: Framework for dependency injection and web configuration.
* Spring Data JPA: For database operations.
* JUnit 5: For unit and integration testing.
---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/rayennebr/demo_clean_architecture.git
cd clean-architecture-app
```

# Contributors
## Rayenne BRIK 
### Full Stack Developer.
# License
This project is licensed under the MIT License. See the LICENSE file for details.

