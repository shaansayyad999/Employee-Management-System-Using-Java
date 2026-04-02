# Employee Management System (Week 4)

## 📌 Project Overview

This project is a console-based Employee Management System developed using Java. It demonstrates the use of collections (ArrayList and HashMap) along with file handling and exception handling. The system allows users to manage employee records efficiently with features like adding, updating, deleting, searching, and generating reports.

---

## ⚙️ Features Implemented

* Add new employee details
* View all employees
* Search employee (by ID, name, department)
* Update employee details
* Delete employee records
* Generate reports (total, average, highest & lowest salary)
* Save data to file
* Load data from file

---

## 🛠️ Technologies Used

* Java
* ArrayList (for storing employees)
* HashMap (for fast lookup by ID)
* File Handling (ObjectInputStream & ObjectOutputStream)
* Exception Handling (try-catch)

---

## 📂 Project Structure

EmployeeManagementSystem/

├── src/
│   ├── Employee.java
│   ├── EmployeeManagementSystem.java
│   ├── EmployeeFileHandler.java
│   ├── EmployeeReportGenerator.java

├── data/
│   └── employees.dat

├── docs/
│   └── documentation.md

├── README.md

---

## 🚀 Setup Instructions

1. Open terminal / command prompt

2. Navigate to project folder:
   cd src

3. Compile all files:
   javac *.java

4. Run the program:
   java EmployeeManagementSystem

---

## 📸 Sample Functionalities

### ➤ Add Employee

User can input employee details like ID, name, department, position, and salary.

### ➤ View Employees

Displays all stored employee records.

### ➤ Search Employee

* By ID
* By Name
* By Department

### ➤ Reports

Shows:

* Total employees
* Total salary
* Average salary
* Highest & lowest salary

### ➤ File Handling

* Save employee data to file
* Load employee data from file

---

## 📄 Sample Data Format

ID: E001
Name: Shaan Sayyad
Department: Engineering
Position: Software Developer
Salary: 85000

ID: E002
Name: Naresh Late
Department: Marketing
Position: Manager
Salary: 95000

ID: E003
Name: Karan Gaikwad
Department: HR
Position: Specialist
Salary: 75000

ID: E004
Name: Rahul Sharma
Department: Engineering
Position: Senior Developer
Salary: 105000

---

## ✅ Technical Requirements Met

* Used ArrayList for dynamic data storage
* Used HashMap for efficient searching
* Implemented full CRUD operations
* Applied file handling for data persistence
* Implemented exception handling for safe execution
* Added search and reporting features

---
## Screenshots
Menu screen
Add employees
View all
Search (3 types)
Update
Delete
Report
Save
Load
Exit

## 📝 Conclusion

This project successfully demonstrates the practical use of Java collections, file handling, and object-oriented programming concepts. It provides a simple and efficient way to manage employee data through a menu-driven interface.

---

## 👨‍💻 Author

Shaan Nazim Sayyad -
Developer Arena Intenship
