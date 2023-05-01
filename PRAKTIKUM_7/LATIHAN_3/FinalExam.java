package PRAKTIKUM_7.LATIHAN_3;

public class FinalExam extends GradeActivity {
       private int numberOfQuestions;
       private int numberMissed;
       private double pointsPerQuestion;
       public FinalExam(int questions, int missed) {
       numberOfQuestions = questions;
       numberMissed = missed;
       }
       public double getPointsPerQuestion() {
       return pointsPerQuestion;
       }
       public int getNumberMissed() {
       return numberMissed;
       }
}       
