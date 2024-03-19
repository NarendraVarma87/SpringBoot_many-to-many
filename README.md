# Many-to-Many Demo Application
This is a demo application showcasing a many-to-many relationship between students and courses using Spring Boot and MySQL.

# Prerequisites
Java 8 or higher
MySQL

# Technologies Used
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>MySQL</li>
</ul>

# API Endpoints
Common url : localhost:9060/student/data

GET /get : Get a list of all students.

GET /get/{student_id}: Get a student by ID.

POST /add : Create a new student.

DELETE /delete/student/{student_id}: Delete a student by ID.

Get /find/{studentName} : Get student by Name.

Get /search/{fee} : Get Fee of Courses that are below Fee.

# Sample output 1 (/student/data/get/1)
{
    "studentId": 1,
    "studentName": "basant",
    "studentEmail": "narendra123@gmail.com",
    "studentDept": "DEV",
    "courses": [
        {
            "courseId": 1,
            "courseTitle": "Machine Learning",
            "abbreviation": "ML",
            "modules": 10,
            "fee": 4000.0
        }
    ],
    "studentAge": 30
}
# sample output 2 (/student/data/get/5)
{
    "studentId": 5,
    "studentName": "Varma",
    "studentEmail": "narendravarma@gmail.com",
    "studentDept": "DEV",
    "courses": [
        {
            "courseId": 5,
            "courseTitle": "Machine Learning",
            "abbreviation": "ML",
            "modules": 20,
            "fee": 4000.0
        },
        {
            "courseId": 6,
            "courseTitle": "Spring Boot",
            "abbreviation": "SB",
            "modules": 11,
            "fee": 2500.0
        },
        {
            "courseId": 7,
            "courseTitle": "Database Systems",
            "abbreviation": "DS",
            "modules": 5,
            "fee": 1800.0
        }
    ],
    "studentAge": 22
}




