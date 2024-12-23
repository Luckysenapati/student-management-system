# student-management-system
The Student Management System is a comprehensive web application developed to organize and  manage student-related data effectively. It eliminates the need for manual record-keeping by offering a  centralized and automated system. The project ensures data security, reliability, and ease of access,  contributing to better administrative workflows.

Technologies Used
- *Programming Language*: Java 22
- *Frameworks*:
  - Spring Boot for backend development
  - Spring MVC for handling web requests
  - Spring Data JPA (Hibernate) for database interactions
- *Frontend*: Thymeleaf as the template engine and Bootstrap CSS for responsive design
- *Database*: MySQL for data storage
- *Development Environment*: Eclipse STS (Spring Tool Suite)

#### **1. StudentManagementSystemApplication (Main Class)**
This is the entry point of the Spring Boot application. It contains the main() method, which uses SpringApplication.run() to bootstrap the application. The @SpringBootApplication annotation enables auto-configuration, component scanning, and configuration support.

#### **2. StudentController (Controller Class)**
This class manages HTTP requests and serves as the intermediary between the view and the service layer. It uses @Controller to indicate it handles web requests.  

*Key Features:*
- **List Students (/students): Retrieves all students and displays them on the "students" view.
- **Create Student Form (/students/new): Displays a form to create a new student.
- **Save Student (/students): Handles form submission and saves the new student data.
- **Edit Student Form (/students/edit/{id}): Displays a form to edit an existing student's data.
- **Update Student (/students/{id}): Updates student details in the database.
- **Delete Student (/students/{id}): Deletes a student by ID.

#### **3. Student (Entity Class)**
This is the data model for the application, mapped to the "students" table in the database. It uses JPA annotations for ORM (Object-Relational Mapping).  

*Attributes:*
- id: Unique identifier for a student, mapped to "Regd. no."
- firstName: Stores the first name of the student.
- lastName: Stores the last name of the student.
- email: Stores the email address of the student.

The class includes constructors, getters, and setters for encapsulating the data.

#### **4. StudentRepository (Repository Interface)**
This interface extends JpaRepository, providing CRUD operations for the Student entity. It abstracts database operations, allowing developers to interact with the database without writing SQL queries.

#### **5. StudentService (Service Interface)**
This interface defines the core functionalities related to student management.  

*Methods:*
- getAllStudents(): Retrieves all student records.
- saveStudent(Student student): Saves a new student.
- getStudentById(Long id): Fetches a student by their ID.
- updateStudent(Student student): Updates an existing student's details.
- deleteStudentById(Long id): Deletes a student by their ID.

#### **6. StudentServiceImpl (Service Implementation Class)**
This class implements the StudentService interface and contains the business logic. It uses @Service to indicate it’s a service layer component.  

*Key Responsibilities:*
- Fetch all students from the database using findAll() from StudentRepository.
- Save a new student or update an existing one using save() from StudentRepository.
- Retrieve a specific student by ID using findById().
- Delete a student by ID using deleteById().

### *Class Interactions*
1. **Controller (StudentController): Handles HTTP requests and sends data to views or calls the service layer for business logic.
2. **Service Layer (StudentService, StudentServiceImpl): Manages the application's core business logic, interacting with the repository to perform CRUD operations.
3. **Repository (StudentRepository): Communicates directly with the database, performing the actual data operations.
4. **Entity (Student): Represents the database table structure and holds the application's data model.

This layered architecture ensures clear separation of concerns, making the application modular, maintainable, and scalable.
