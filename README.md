📘 Quiz App (Hibernate + MySQL)

A Java-based Quiz Application built using Hibernate ORM and MySQL.
The app allows users to take quizzes with a custom number of questions, records their scores, and maintains a leaderboard 🏆.

🚀 Features

🎯 Attempt quizzes with a chosen number of questions.

📝 Multiple-choice questions stored in MySQL database.

📊 Tracks individual user scores.

🏆 Leaderboard showing top performers.

⚡ Hibernate ORM for database interaction.

🛠️ Simple logging setup to debug SQL queries.

🛠️ Tech Stack

☕ Java 24

🐬 MySQL

📦 Maven (dependency management)

🔗 Hibernate ORM (v7.1)

📝 SLF4J Simple Logger

📂 Project Structure
quiz-app-hibernate/
│
├── src/main/java/backend/hibernate/projects/QuizApp/
│    ├── ExecuteQuiz.java         # Main runner (entry point of the app)
│    ├── QuizService.java         # Core quiz logic (quiz flow + leaderboard)
│    ├── Question1.java           # Entity for quiz questions
│    ├── UserScore.java           # Entity for user scores
│    ├── Question1Dao.java        # DAO for question operations
│    ├── UserScoreDao.java        # DAO for score operations
│
├── pom.xml                       # Maven dependencies and project config
├── hibernate.cfg.xml             # Hibernate configuration (DB + ORM setup)
├── ehcache.xml                   # Cache configuration
├── simplelogger.properties       # Logging setup
└── README.md                     # Project documentation

⚙️ Configuration

Database Setup (MySQL 🐬)

Create a schema named college.

Update DB credentials in hibernate.cfg.xml.

Dependencies (Maven 📦)

Hibernate Core

MySQL Connector

SLF4J Simple Logger

Logging (📝)

Configured in simplelogger.properties for SQL debugging and formatted output.

📝 Usage Flow

User enters their name.

Application asks quiz questions (based on number chosen).

Final score is stored in DB.

Leaderboard 🏆 is displayed with user scores.
