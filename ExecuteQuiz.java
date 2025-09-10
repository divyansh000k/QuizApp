package backend.hibernate.projects.QuizApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.stat.internal.QueryStatisticsImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class ExecuteQuiz {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build())
                .addAnnotatedClass(Question1.class).addAnnotatedClass(UserScore.class)
                .buildMetadata().buildSessionFactory();

        Question1Dao question1Dao = new Question1Dao(sessionFactory);
        UserScoreDao userScoreDao = new UserScoreDao(sessionFactory);
        QuizService quizService = new QuizService(question1Dao,userScoreDao);


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String username = sc.nextLine();

        System.out.print("How many questions do you want in quiz? ");
        int limit = sc.nextInt();

        quizService.startQuiz(username, limit);
        quizService.showLeaderboard();

        sessionFactory.close();
        sc.close();
    }
}
