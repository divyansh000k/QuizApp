package backend.hibernate.projects.QuizApp;

import org.hibernate.*;

import java.util.List;

public class UserScoreDao {
        private Session session;

    public UserScoreDao(SessionFactory sessionFactory) {
        this.session = sessionFactory.openSession();
    }

    // save the user score
    public void saveScore(UserScore uc) {
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.persist(uc);
            tx.commit();
            System.out.println("User score added successfully....");
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println("Error while save the score in the db");
        }
    }

    // get all the score from the db (Leaderboard)
    public List<UserScore> getAllScore() {
        try {
            List<UserScore> list = session.createQuery("FROM UserScore ORDER BY score DESC", UserScore.class).list();
            if (list.isEmpty()) {
                System.out.println("No score found in the db");
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error while fetching all scores");
            return null;
        }
    }
}
