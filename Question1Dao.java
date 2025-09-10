package backend.hibernate.projects.QuizApp;

import org.hibernate.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Question1Dao {
    private Session session;

    public Question1Dao(SessionFactory sessionFactory) {
        this.session = sessionFactory.openSession();
    }
    // save question in the db
    public void saveQuestion(Question1 q) {
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            session.persist(q);
            tx.commit();
            System.out.println("Question and Answers saved successfully....");
        } catch (Exception e) {
            if (tx == null) tx.rollback();
            e.printStackTrace();
        }
    }

    // show the one question by id
    public Question1 getQuestion(int id) {
        try {
            Question1 q1  = session.find(Question1.class, id);
            if (q1 == null) {
                System.out.println("No question found with this Id " + id);
            }
            return q1;
        } catch (Exception e) {
            System.out.println("Error while fetching question with this Id "+id);
            return null;
        }
    }

    // show all the question
    public List<Question1> getAllQuestions() {
        try {
            List<Question1> list = session.createQuery("FROM Question1", Question1.class).list();
            if (list.isEmpty()) {
                System.out.println("No question found in the db");
            }
            return list;
        } catch (Exception e) {
            System.out.println("Error while fetching all questions");
            return null;
        }
    }

    // delete the question from the db
    public void deleteQuestion(int id) {
        Question1 q = session.find(Question1.class, id);
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            if (q != null) {
                session.remove(q);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.out.println("Error while delete the question");
        }
    }

    // get demanded no of questions
    public List<Question1> getLimitedQuestion(int limit) {
        try{
            List<Question1> all = session.createQuery("FROM Question1", Question1.class).list();
            Collections.shuffle(all);
            return all.subList(0, Math.min(limit, all.size()));
        } catch (Exception e) {
            System.out.println("Error while fetching the questions");
            return null;
        }
    }
}
