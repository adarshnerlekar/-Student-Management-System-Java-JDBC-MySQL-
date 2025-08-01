# -Student-Management-System-Java-JDBC-MySQL-
This is a **console-based Student Management System** project built using **Core Java**, **JDBC**, and **MySQL**.   It manages students using both **ArrayList (in-memory)** and **MySQL database (persistent)**.
## 📌 Features

- ➕ Add a new student  
- 👀 View all students  
- 🔍 Search student by roll number  
- ✏️ Update student details  
- ❌ Delete student  
- 💾 Data stored in both ArrayList and MySQL table

---

## 🛠️ Tech Stack

| Technology | Description |
|------------|-------------|
| Java       | Core Java (OOP, ArrayList, Scanner) |
| JDBC       | Java Database Connectivity |
| MySQL      | Database for storing student data |
| Console    | User interface via terminal |


## 🧑‍💻 How to Run the Project
### ✅ Step 1: Create MySQL Database & Table
```sql
CREATE DATABASE mystudentdata;
USE mystudentdata;

CREATE TABLE students (
    rollno INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);
⚠️ If you used a different DB or table name, update it inside DBConnection.java and StudentDAO.java.


📸 Demo (Sample Console Output)
Welcome to Student Management System
------------------------------------
1. Add Student
2. View Student
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Enter Your Choice:

🙋‍♂️ Author
Made with ❤️ by Adarsh
Connect with me on LinkedIn (www.linkedin.com/in/adarsh-nerlekar).


