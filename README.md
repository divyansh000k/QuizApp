📘 Quiz App (Hibernate + MySQL)

A Java-based Quiz Application built using Hibernate ORM and MySQL.
This app allows users to take quizzes with a chosen number of questions, stores their scores, and displays a leaderboard 🏆.

🚀 Features

🎯 Attempt quizzes with a custom number of questions.

📝 Multiple-choice questions stored in MySQL.

📊 Tracks individual user scores.

🏆 Leaderboard showing all participants’ performance.

⚡ Hibernate ORM for seamless DB interaction.

🛠️ Simple logging setup for formatted SQL queries.

🛠️ Tech Stack

☕ Java 24

🐬 MySQL

📦 Maven

🔗 Hibernate ORM (7.1)

📝 SLF4J Simple Logger

📂 Project Structure

ExecuteQuiz.java → Main runner (entry point of the app)

QuizService.java → Core quiz logic (quiz flow + leaderboard)

Question1.java → Entity for quiz questions

UserScore.java → Entity for user scores

Question1Dao.java → DAO for question operations

UserScoreDao.java → DAO for score operations

pom.xml → Maven dependencies and project config

hibernate.cfg.xml → Hibernate configuration (DB + ORM setup)

ehcache.xml → Cache configuration

simplelogger.properties → Logging setup

README.md → Project documentation

⚙️ Configuration
🐬 Database Setup

Open MySQL and create a schema:

CREATE DATABASE college;


Inside hibernate.cfg.xml, update:

<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">YOUR_PASSWORD</property>
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/college</property>


🔑 Replace root with your MySQL username and YOUR_PASSWORD with your MySQL password.
📌 Default DB name is college. Change if required.

📦 Dependencies (pom.xml)

The project already includes:

Hibernate Core

MySQL Connector

SLF4J Logger

👉 Run mvn clean install to download dependencies.

📝 Logging

simplelogger.properties is configured to:

Show executed SQL queries.

Show parameter values bound in queries.

Format SQL output for readability.

📝 Usage Flow

Run ExecuteQuiz.java.

Enter your name when prompted.

Choose number of questions (e.g., 10 for a quick quiz).

Answer MCQs one by one.

Final score is saved in DB.

Leaderboard 🏆 is displayed with username -> score/total.

👤 Author

Divyansh Kushwaha

🌐 [GitHub][https://www.linkedin.com/in/divyansh-java-developer/]

💼 [LinkedIn][]

💡 Aspiring Java Backend Developer | Hibernate & Spring Enthusiast
