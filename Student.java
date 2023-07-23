public class Student {
    public static void main(String[] args) {
        // Score (0-100)
        int score = 79;
        String grade = null;

        // Using a switch statement to determine the grade based on the score
        switch (score / 10) {
            // for scores >= 90
            case 10:
            case 9:
                grade = "A";
                break;
            // for scores >= 80 and < 90
            case 8:
                grade = "B";
                break;
            // for scores >= 70 and < 80
            case 7:
                grade = "C";
                break;
            // for scores >= 60 and < 70
            case 6:
                grade = "D";
                break;
            // for scores >= 50 and < 60
            case 5:
                grade = "E";
                break;
            // for scores < 50
            default:
                grade = "F";
                break;
        }

        // Display the result
        System.out.println("Grade = " + grade);
    }
}
