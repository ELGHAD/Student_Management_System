🎓 Student Management System (Java Console App)

A simple Java console-based CRUD application that lets you manage students — add, view, update, delete, and search — with data stored in a local text file.
This project was built using only Core Java (no frameworks) to practice OOP, collections, file handling, and input validation.

🧩 Features

➕ Add Student — add new students with a unique ID

      👀 View All Students — display all students stored in the system
      
      ✏️ Update Student — modify student name and grade
      
      🗑️ Delete Student — remove a student by ID
      
      🔍 Search Student — search by name or ID
      
      🧱 Unique ID Check — prevents duplicate student IDs
      
      🧾 Persistent Data — students saved to students.txt automatically

🚀 How to Run

     1. Clone or download this project:
      
      git clone https://github.com/YourUsername/student-management.git
      cd student-management
      
      
     2. Compile and run:
      
      javac Main.java
      java Main


     3. Follow the console menu:

      ===== 🎓 Student Management System =====
      1️⃣ Add Student
      2️⃣ View All Students
      3️⃣ Update Student
      4️⃣ Delete Student
      5️⃣ Search Student (by ID or Name)
      6️⃣ Exit
      👉 Enter choice:

💾 Data Persistence

All student data is stored automatically in a file named:

    students.txt


Each line follows the format:

    id,name,grade
