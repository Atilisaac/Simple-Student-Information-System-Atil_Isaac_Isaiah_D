Simple Student Information System
Overview

A Java Swing-based Student Information System to manage student records in a MySQL database. Users can add, update, delete, and view students via a simple graphical interface. The JTable updates dynamically to reflect all changes in the database.

Features

Add Student

Automatically generates a student ID.

Validates required fields and numeric age input.

JTable refreshes to show all students after adding.

Update Student

Enter a student ID and click Update to load student info into the form fields.

Edit the details and click Update again to save changes.

JTable updates automatically.

Delete Student

Enter a student ID and click Delete.

Shows a confirmation dialog with the student’s details before deletion.

Show Students

Displays all students in the JTable.

If an ID is entered, filters to show only that student.

Responsive GUI

Main panel stays centered even when resizing or maximizing the window.

JTable displays all students dynamically.

Technologies Used

Java 17+ (Swing GUI)

MySQL (Database)

JDBC (Database connection)

NetBeans IDE (Development)

Database Setup

Install MySQL.

Create a database:

CREATE DATABASE student_information_system;

Create the students table:

CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

Update your DBConnection.java with your credentials:

connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/student_information_system",
    "root",
    "your_password_here"
);
How to Run

Open the project in NetBeans.

Ensure MySQL server is running.

Build and run the project.

Use the GUI to add, update, delete, and view students.

Button Instructions
Add Button

Fill First Name, Last Name, Age, Email fields.

Leave ID empty (it is auto-generated).

Click Add → student is added to the database and JTable refreshes.

Screenshot Example:


Update Button

Enter a Student ID.

Click Update → fills form fields with student info.

Edit fields as needed.

Click Update again → saves changes to database and refreshes JTable.

Screenshot Example:


Delete Button

Enter a Student ID.

Click Delete → shows a confirmation dialog with student info.

Confirm deletion → removes student from database and refreshes JTable.

Screenshot Example:


Show Button

Enter a Student ID to filter, or leave blank to show all students.

Click Show → displays results in JTable.

Screenshot Example:


Notes

Do not type a student ID when adding new students; the database generates it.

JTable always shows the current state of the database.

Make sure database credentials are correct in DBConnection.java.

Author

Administrator
Learning project: Java Swing + MySQL Student Information System
