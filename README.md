# Java Quiz Application with Hibernate

Welcome to the Java Quiz Application! This is a command-line-based interactive quiz system built using Java and the Hibernate ORM framework. The application demonstrates core Hibernate concepts such as session management, transactions, CRUD operations, and performance optimization with second-level caching.

---

## 🚀 About The Project

This project is a console application that allows users to take a quiz with a variable number of questions. It fetches questions from a MySQL database, records the user's score, and displays a leaderboard sorted by the highest scores. It's an excellent example of using Hibernate for database persistence in a Java application.

A key feature of this project is the implementation of **Hibernate's Second-Level Cache** using Ehcache, which helps in optimizing performance by reducing database hits for frequently accessed data.

---

## ✨ Features

* **Interactive CLI**: Simple and easy-to-use command-line interface.
* **Dynamic Quiz Length**: Users can choose how many questions they want to answer.
* **Score Persistence**: Usernames and final scores are saved to the database.
* **Leaderboard**: Displays all user scores in descending order.
* **Hibernate ORM**: Manages all database interactions, mapping Java objects to database tables.
* **Second-Level Caching**: Implemented using **Ehcache** and **JCache** to boost query performance.
* **Detailed Logging**: Configured with **SLF4J Simple Logger** to show formatted SQL queries and parameter binding for easy debugging.

---

## 🛠️ Technologies Used

This project is built with the following technologies:

* **Core**: Java 24
* **Build Tool**: Maven
* **Database**: MySQL
* **ORM Framework**: Hibernate ORM 7.1.0.Final
* **Caching**: Ehcache 3 / JCache (for Hibernate 2nd Level Cache)
* **Logging**: SLF4J - Simple Logger
* **Dependencies**: JAXB (required for Hibernate 7+)

---

## 📋 Prerequisites & Setup

Follow these steps to get the project up and running on your local machine.

### Prerequisites

* **Java JDK 24** or later installed.
* **Apache Maven** installed.
* **MySQL Server** running.

### Installation & Configuration

1.  **Clone the repository:**
    ```sh
    git clone <your-repository-url>
    ```

2.  **Create the Database:**
    * Log in to your MySQL server.
    * Create a database. The project is configured to use a database named `college`.
    ```sql
    CREATE DATABASE college;
    ```

3.  **Configure Database Connection:**
    * Open the `src/main/resources/hibernate.cfg.xml` file.
    * Update the following properties with your MySQL username and password.
    ```xml
    <property name="hibernate.connection.username">your_username</property>
    <property name="hibernate.connection.password">your_password</property>
    ```
    **Note**: Hibernate is configured with `hbm2ddl.auto` set to `update`, so it will automatically create the necessary tables (`questions` and `user_score`) when the application first runs.

4.  **Build the Project:**
    * Navigate to the project's root directory in your terminal.
    * Run the Maven command to install dependencies and build the project.
    ```sh
    mvn clean install
    ```

---

## ▶️ How to Run

After a successful build, you can run the application directly from your IDE (like IntelliJ or Eclipse) by running the `main` method in the `ExecuteQuiz.class` file.

Upon running, the application will prompt you in the console:
1.  Enter your name.
2.  Enter the number of questions you want in the quiz.
3.  Answer the questions.
4.  Your final score will be displayed, and the leaderboard will be shown.

---

## 📂 Project Structure

Here's a brief overview of the key files and their roles:

* **`pom.xml`**: Defines all project dependencies, including Hibernate, MySQL Connector, and Ehcache.
* **`hibernate.cfg.xml`**: The main Hibernate configuration file for database connection, dialect, and cache settings.
* **`ehcache.xml`**: Configuration file for the Ehcache second-level cache, defining cache regions and policies.
* **`simplelogger.properties`**: Configures SLF4J Simple Logger to display formatted SQL queries for debugging.
* **Entities (`Question1.java`, `UserScore.java`)**: POJO classes mapped to the database tables using JPA annotations (`@Entity`, `@Id`, etc.).
* **DAOs (`Question1Dao.java`, `UserScoreDao.java`)**: Data Access Object classes that handle all the database CRUD operations for the entities.
* **`QuizService.java`**: Contains the core business logic for starting the quiz and showing the leaderboard.
* **`ExecuteQuiz.java`**: The main class and entry point of the application. It initializes Hibernate and starts the quiz service.

---

## 🔗 Connect with Me

Feel free to reach out if you have any questions or want to connect!

* **LinkedIn**: [https://www.linkedin.com/in/divyansh-java-developer/](https://www.linkedin.com/in/divyansh-java-developer/)
* **GitHub**: [https://github.com/divyansh000k](https://github.com/divyansh000k)
