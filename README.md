# 🔗 Spring Boot URL Shortener

A simple and efficient **URL Shortener web application** built using **Spring Boot**. The application converts long URLs into short, shareable URLs and stores the data in a relational database.

## 🚀 Features

* Create short URLs from long URLs
* Redirect users from short URLs to the original URL
* Validate URL existence before creating short links
* Persistent URL storage using PostgreSQL
* Database versioning and migration using Flyway
* Exception handling for unavailable short URLs
* Server-side rendered UI using Thymeleaf
* User authentication and authorization
* Create private short URLs for authenticated users
* User-specific URL management
* Pagination for URL results
* Clean layered project structure
* Maven Wrapper included for easy setup
* Docker support

## 🛠️ Tech Stack

| Technology      | Purpose                        |
| --------------- | ------------------------------ |
| Java            | Programming Language           |
| Spring Boot     | Backend Framework              |
| Spring Data JPA | Database Access                |
| Spring Security | Authentication & Authorization |
| PostgreSQL      | Relational Database            |
| Flyway          | Database Migration             |
| Thymeleaf       | Server-side UI                 |
| Maven           | Build & Dependency Management  |
| Docker          | Containerization               |
| HTML/CSS        | Frontend                       |

## 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.ananya.urlshortner
│   │       ├── domain
│   │       │   ├── entities
│   │       │   ├── models
│   │       │   ├── services
│   │       │   ├── exceptions
│   │       │   └── repositories
│   │       ├── models
│   │       │   └── PagedResult.java
│   │       ├── web
│   │       │   └── controllers
│   │       ├── ApplicationProperties.java
│   │       └── SpringBootUrlShortnerApplication.java
│   │
│   └── resources
│       ├── db
│       │   └── migration
│       │       ├── V1__create_table.sql
│       │       └── V2__insert_sample_data.sql
│       ├── static
│       │   └── css
│       ├── templates
│       │   ├── error
│       │   ├── index.html
│       │   └── layout.html
│       ├── GlobalExceptionHandler.java
│       └── application.properties
│
└── test
    └── java
```

## ⚙️ How to Run Locally

### 1. Clone the repository

```bash
git clone https://github.com/itsananya252/url-shortner.git
```

### 2. Navigate to the project

```bash
cd url-shortner
```

### 3. Configure PostgreSQL

Make sure PostgreSQL is installed and running.

Create a database for the application and update the database configuration in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/urlshortner
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

> Replace the database name, username, and password with your local PostgreSQL configuration.

### 4. Run the application

Using Maven Wrapper:

**Windows**

```powershell
.\mvnw.cmd spring-boot:run
```

**Linux/macOS**

```bash
./mvnw spring-boot:run
```

Or run the application directly from IntelliJ IDEA.

### 5. Open the application

Once the application starts, open:

```text
http://localhost:8080
```

## 🗄️ Database Migration

This project uses **Flyway** to manage database schema changes.

Migration files are located at:

```text
src/main/resources/db/migration/
```

Current migrations:

* `V1__create_table.sql` — Creates the required database tables.
* `V2__insert_sample_data.sql` — Inserts sample data.

Flyway automatically applies pending migrations when the application starts.

## 🔐 Authentication & Authorization

The application supports **user authentication and authorization** using Spring Security.

Authenticated users can create and manage their own private short URLs. URL data can be associated with the authenticated user, providing user-specific URL management.

## 🔒 Private Short URLs

Users can create **private short URLs** that are associated with their authenticated account.

The application ensures that private URL data is managed according to the authenticated user's access.

## 📄 Pagination

The application supports **pagination** when retrieving URL results.

Pagination makes it easier to handle a large number of URLs without loading all records at once.

Example pagination parameters:

```text
?page=0&size=10
```

The project includes a dedicated `PagedResult` model for handling paginated results.

## 🔄 Application Flow

```text
User enters Long URL
        ↓
Spring Boot Controller
        ↓
Authentication / Authorization
        ↓
URL Validation
        ↓
Short URL Service
        ↓
PostgreSQL Database
        ↓
Short URL generated
        ↓
User receives Short URL
        ↓
Short URL requested
        ↓
Original URL retrieved
        ↓
Redirect to Original URL
```

## 🧪 Testing

The project includes Spring Boot test configuration under:

```text
src/test/java
```

Run tests using:

**Windows**

```powershell
.\mvnw.cmd test
```

**Linux/macOS**

```bash
./mvnw test
```

## 🐳 Running with Docker

Make sure Docker is installed and running.

Build the application:

```bash
./mvnw clean package
```

Build the Docker image:

```bash
docker build -t spring-boot-url-shortener .
```

Run the container:

```bash
docker run -p 8080:8080 spring-boot-url-shortener
```

The application will be available at:

```text
http://localhost:8080
```

> Make sure the required PostgreSQL database configuration is available when running the application with Docker.

## 🔐 Configuration

Database credentials and application-specific configuration should be kept in:

```text
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/urlshortner
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

For production environments, sensitive credentials should be provided through environment variables or external configuration rather than committing them to Git.

## 📦 Build JAR

To create the executable JAR:

**Windows**

```powershell
.\mvnw.cmd clean package
```

**Linux/macOS**

```bash
./mvnw clean package
```

The generated JAR will be available inside:

```text
target/
```

## 📌 Future Improvements

* Add custom aliases for shortened URLs
* Add URL expiration
* Add click/visit analytics
* Add REST API documentation with Swagger/OpenAPI
* Improve Docker-based deployment
* Add rate limiting
* Deploy the application to a cloud platform

## 👩‍💻 Author

**Ananya Dixit**

GitHub:
https://github.com/itsananya252

## ⭐ Support

If you find this project useful, consider giving the repository a ⭐ on GitHub.
