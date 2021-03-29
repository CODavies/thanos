package chapterFour;

public class CalculateGrade {

    public String calculate(int Grade) {
        if (Grade >= 90) {
            return "A";
        } else if (Grade >= 80) {
            return "B";
        } else if (Grade >= 70) {
            return "C";
        } else {
            return "F";
        }

    }

}
