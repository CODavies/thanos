package chapterFour;

import java.sql.SQLOutput;

public class calculateGradeTest {
    public static void main(String[] args) {
        CalculateGrade calculateGrade = new CalculateGrade();
        System.out.println("Student Score is: " + calculateGrade.calculate(40));
    }
}
