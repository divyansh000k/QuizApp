package backend.hibernate.projects.QuizApp;

import jakarta.persistence.*;

@Entity
@Table(name = "user_score")
public class UserScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    private String username;
    private int score;
    private int totalQuestions;

    public UserScore() {
    }

    public UserScore(String username, int score, int totalQuestions) {
        this.username = username;
        this.score = score;
        this.totalQuestions = totalQuestions;

    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
