# Student Management System

A Java console application for managing student records through CRUD operations, search functionality, input validation, and local file persistence.

## Overview

The Student Management System is a lightweight application developed using Core Java without external frameworks. It provides a menu-driven interface for creating, viewing, updating, deleting, and searching student records.

Student information is stored in a local text file, allowing records to persist between application runs.

## Features

- **Add Students:** Create student records with unique IDs.
- **View Students:** Display all stored student records.
- **Update Records:** Modify student names and grades.
- **Delete Students:** Remove records using student IDs.
- **Search Students:** Find students by ID or name.
- **Unique ID Validation:** Prevent duplicate student identifiers.
- **File-Based Persistence:** Save and retrieve records using `students.txt`.
- **Console Interface:** Navigate the application through a simple interactive menu.

## Technology Stack

| Component | Technology |
|---|---|
| Language | Java |
| Programming Concepts | Object-Oriented Programming |
| Data Structures | Java Collections |
| Persistence | File I/O |
| User Interface | Command-Line Interface |

No external frameworks or third-party libraries are required.

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- A terminal or command prompt

Verify your Java installation:

```bash
java -version
javac -version
```

### 1. Clone the repository

Replace `YOUR_USERNAME` with the actual GitHub username if needed.

```bash
git clone https://github.com/YOUR_USERNAME/student-management.git
cd student-management
```

### 2. Compile the application

If `Main.java` and its required source files are in the current directory:

```bash
javac *.java
```

### 3. Run the application

```bash
java Main
```

### 4. Use the menu

Follow the prompts to add, view, update, delete, or search for student records.

## Data Persistence

Student records are stored in a local file named `students.txt`.

Each record follows this format:

```text
id,name,grade
```

Example:

```text
101,John Smith,15.5
102,Jane Doe,17.0
```

The file allows student records to be reused across application sessions, provided the application correctly loads and saves the file.

**Note:** Because records use a comma-separated format, names containing commas require appropriate parsing or escaping to avoid incorrect field separation.

## Concepts Demonstrated

- Object-oriented programming and class design
- CRUD operations
- Java collections and record management
- File reading and writing
- Input validation and duplicate checking
- Searching and updating data
- Console-based user interaction

## Potential Improvements

- Add automated unit tests for CRUD operations and validation.
- Improve error handling for missing, unreadable, or malformed data files.
- Use a more robust CSV format or a structured serialization format.
- Separate business logic, data access, and console interaction into distinct classes.
- Add a database-backed version using JDBC or Spring Boot.

## Author

**ELGHAD**

- GitHub: https://github.com/ELGHAD
- Portfolio: https://elghad.github.io/hamza-elrhadiouini-portfolio

## License

Add a `LICENSE` file if you intend to distribute this project under a specific open-source license.
