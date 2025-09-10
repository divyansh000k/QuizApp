package backend.hibernate.projects.QuizApp;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")

public class Question1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int qid;

    private String qText;
    private String op1;
    private String op2;
    private String op3;
    private String op4;

    private int correctAns;

    public Question1() {
    }

    @Override
    public String toString() {
        return "Question1{" +
                "qid=" + qid +
                ", qText='" + qText + "\n" +
                ", op1='" + op1 + "\n" +
                ", op2='" + op2 + "\n" +
                ", op3='" + op3 + "\n" +
                ", op4='" + op4 + "\n" +
                '}';
    }

    public Question1(String qText, String op1, String op2, String op3, String op4, int correctAns) {
        this.qText = qText;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.correctAns = correctAns;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getqText() {
        return qText;
    }

    public void setqText(String qText) {
        this.qText = qText;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public int getCorrectAns() {
        return correctAns;
    }

    public void setCorrectAns(int correctAns) {
        this.correctAns = correctAns;
    }
}
