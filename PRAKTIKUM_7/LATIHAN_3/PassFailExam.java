package PRAKTIKUM_7.LATIHAN_3;

public class PassFailExam extends PassFailActivity {
       private int numberOfQuestions;
       private double pointsPerQuestion;
       private int numberMissed;

       public PassFailExam(int questions, int missed, double minPassing) {

              super(minPassing);
              this.numberOfQuestions = questions;
              this.numberMissed = missed;
       }
}