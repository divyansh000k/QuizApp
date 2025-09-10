package backend.hibernate.projects.QuizApp;

import java.util.List;
import java.util.Scanner;

public class QuizService {
        private Question1Dao question1Dao;
        private UserScoreDao userScoreDao;

    public QuizService(Question1Dao question1Dao, UserScoreDao userScoreDao) {
        this.question1Dao = question1Dao;
        this.userScoreDao = userScoreDao;
    }

    public void startQuiz(String username, int limit) {
        List<Question1> question1s = question1Dao.getLimitedQuestion(limit);
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome "+ username + " let's start the quiz");
        for(Question1 q : question1s) {
            System.out.println("Q. " + q.getqText());
            System.out.println("1. "+ q.getOp1());
            System.out.println("2. "+ q.getOp2());
            System.out.println("3. "+ q.getOp3());
            System.out.println("4. "+ q.getOp4());

            System.out.print("Enter your choice (1 - 4): ");
            int userAns = sc.nextByte();

            if (userAns == q.getCorrectAns()) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer was option: " +q.getCorrectAns());
            }
        }
        System.out.println("Quiz finished! Your score: "+ score+"/"+question1s.size());

        // save score in the db
        UserScore userScore = new UserScore(username, score, limit);
        userScoreDao.saveScore(userScore);
    }

    public void showLeaderboard() {
        List<UserScore> scores = userScoreDao.getAllScore();
        System.out.println("---Leaderboard🏆----");
        for(UserScore us : scores) {
            System.out.println(us.getUsername() + " -> " + us.getScore()+"/"+us.getTotalQuestions());
        }
    }
}
