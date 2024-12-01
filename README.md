

# Category-Product Management System

This is a Spring Boot-based CRUD application for managing categories and products. The application includes REST APIs for basic operations such as creating, reading, updating, and deleting categories and products. It also implements server-side pagination and uses DTOs for clean data transfer.



## Features

1. **Category CRUD Operations**
   - Create, retrieve, update, and delete categories.
   - Pagination support for listing categories.

2. **Product CRUD Operations**
   - Create, retrieve, update, and delete products.
   - Products are linked to categories (One-to-Many relationship).
   - Fetch product details along with their associated category information.
   - Pagination support for listing products.

3. **Technologies Used**
   - Spring Boot
   - Spring Data JPA
   - Hibernate
   - MySQL
   - DTOs (Data Transfer Objects)
   - Pagination support with `Pageable`



## API Endpoints

### Category APIs

| HTTP Method | Endpoint                         | Description                       |
|-------------|----------------------------------|-----------------------------------|
| `GET`       | `/api/categories?page=3`         | Get all categories with pagination|
| `POST`      | `/api/categories`                | Create a new category             |
| `GET`       | `/api/categories/{id}`           | Get category details by ID        |
| `PUT`       | `/api/categories/{id}`           | Update category by ID             |
| `DELETE`    | `/api/categories/{id}`           | Delete category by ID             |



### Product APIs

| HTTP Method | Endpoint                         | Description                                    |
|-------------|----------------------------------|------------------------------------------------|
| `GET`       | `/api/products?page=2`           | Get all products with pagination               |
| `POST`      | `/api/products`                  | Create a new product                           |
| `GET`       | `/api/products/{id}`             | Get product details by ID (with category info) |
| `PUT`       | `/api/products/{id}`             | Update product by ID                           |
| `DELETE`    | `/api/products/{id}`             | Delete product by ID                           |



## Project Setup

### Prerequisites

- Java Development Kit (JDK 17 or higher)
- Maven
- MySQL database
- An IDE (IntelliJ IDEA, Eclipse, etc.)



### **Steps to Run**

1. **Clone the Repository**:
   bash
   git clone https://github.com/<your-username>/<repository-name>.git
   cd <repository-name>
   

2. **Configure the Database**:
   - Open the `src/main/resources/application.properties` file.
   - Update the database configuration with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/<database_name>
     spring.datasource.username=<your_username>
     spring.datasource.password=<your_password>
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the Project**:
   ```bash
   ./mvnw clean install
   ```

4. **Run the Application**:
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Test the APIs**:
   - Use Postman, Swagger UI, or a browser to test the endpoints (e.g., `http://localhost:8080/api/categories`).



## **Database Design**

### **Entities**
1. **Category**:
   - `id` (Primary Key)
   - `name` (String)

2. **Product**:
   - `id` (Primary Key)
   - `name` (String)
   - `price` (Double)
   - `description` (String)
   - `category` (Many-to-One relationship with `Category`)



## **Folder Structure**


src/
 └── main/
     ├── java/
     │    └── com/
     │        └── harshkoder/
     │            └── task/
     │                ├── NimaPtaskApplication.java  // Main application class
     │                ├── controller/          // REST Controllers
     │                ├── dto/                 // DTO Classes
     │                ├── entity/              // Entity Classes
     │                ├── repository/          // JPA Repositories
     │                └── service/             // Service Layer
     └── resources/
         ├── application.properties            // Database and Spring settings
         └── data.sql                          // Optional initial data




## **License**

This project is licensed under the MIT License. You can freely modify and distribute the code.

---

Feel free to replace `<your-username>` and `<repository-name>` with your GitHub details, and customize the README further if required.
