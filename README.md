# NeurixLearn Platform - Backend API

> A comprehensive educational platform that provides a complete REST API for managing courses, users, assessments, and learning materials.

## 📋 Overview

**NeurixLearn Platform Backend** is a Spring Boot-based REST API designed to support scalable educational platforms. It enables seamless integration with educational applications, supporting course enrollment, progress tracking, exam management, and personalized learning experiences.

### 🎯 Key Features

- **Course Management**: Create, update, and manage courses with sections and units
- **User Management**: User profiles, authentication, and role-based access control
- **Assessment System**: Exams, questions, and answer tracking
- **Enrollment Management**: Course enrollment with progress tracking
- **Material Management**: Educational materials (lectures, notes, tutorials)
- **Payment Processing**: Payment management for premium courses
- **API Documentation**: Interactive Swagger UI (OpenAPI 3.0)
- **JWT Authentication**: Secure token-based authentication

### 🏗️ Architecture

The project follows **Domain-Driven Design (DDD)** and **Clean Architecture** principles:

```
├── domain/              → Business logic and domain models
├── application/         → Use cases and application services
├── infrastructure/      → Data persistence and external services
└── interfaces/          → REST controllers and API resources
```

### 🛠️ Technology Stack

- **Framework**: Spring Boot 3.3.5
- **Language**: Java 23
- **Database**: MySQL 8.0+
- **ORM**: JPA/Hibernate 6.5.3
- **Security**: Spring Security + JWT (io.jsonwebtoken)
- **Documentation**: Springdoc OpenAPI 2.6.0
- **Build Tool**: Maven 3.x
- **Testing**: JUnit 5 + Spring Boot Test

### 📦 Project Structure

- **20 Test Classes** covering unit and integration tests
- **194 Java Source Files** implementing core business logic
- **13 JPA Repositories** for data access
- **Multi-Module Design** with profile, learne, and shared modules

## 🚀 Getting Started

### Prerequisites

- Java 23+
- Maven 3.6+
- MySQL 8.0+ (or H2 for development)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/arquitectura-soft/NeurixLearn-Backend.git
   cd NeurixLearn-Backend
   ```

2. **Configure Database** (edit `src/main/resources/application.properties`)
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/learne-platform
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. **Build the project**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

5. **Access Swagger UI**
   - Open: http://localhost:8080/swagger-ui.html
   - API Docs: http://localhost:8080/v3/api-docs

## 📚 API Documentation

### Main Endpoints

- **Courses**: `/api/v1/courses`
- **Users**: `/api/v1/users`
- **Exams**: `/api/v1/exams`
- **Questions**: `/api/v1/questions`
- **Materials**: `/api/v1/materials`
- **Enrollments**: `/api/v1/enrollments`

### Authentication

API uses JWT (JSON Web Tokens) for authentication:

```bash
Authorization: Bearer <your-jwt-token>
```

Configure JWT secret in `application.properties`:
```properties
authorization.jwt.secret=your-secret-key
authorization.jwt.expiration.days=7
```

## ✅ Testing

Run all tests:
```bash
mvn test
```

Run specific test class:
```bash
mvn test -Dtest=UserControllerTest
```

## 🔧 Configuration

### Environment Variables

- `SPRING_DATASOURCE_URL`: Database connection URL
- `SPRING_DATASOURCE_USERNAME`: Database username
- `SPRING_DATASOURCE_PASSWORD`: Database password

### Application Properties

Key configurations in `application.properties`:
- `spring.jpa.hibernate.ddl-auto=update` → Auto-create/update database schema
- `spring.jpa.show-sql=true` → Log SQL queries
- `spring.h2.console.enabled=true` → Enable H2 console (development)

## 📖 Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.5/maven-plugin)
* [Spring Data JPA](https://docs.spring.io/spring-boot/3.3.5/reference/data/sql.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.3.5/reference/using/devtools.html)
* [Spring Security](https://docs.spring.io/spring-boot/3.3.5/reference/web/spring-security.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.3.5/reference/web/servlet.html)
* [Springdoc OpenAPI](https://springdoc.org/)

### Useful Guides

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

## 🤝 Contributing

Contributions are welcome! Please follow these guidelines:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the Apache License 2.0 - see the LICENSE file for details.

## 📞 Contact & Support

For questions, issues, or suggestions, please open an issue on the GitHub repository.

---

**Version**: 1.0.0  
**Last Updated**: May 2026  
**Maintainers**: NeurixLearn Team

