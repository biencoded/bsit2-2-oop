public class Main {

    public void displayResult(String studentName, double average) {
        System.out.println("Student: " + studentName + ", Average: " + average);
    }

    public void displayResult(String studentName, double average, String letterGrade) {
        System.out.println("Student: " + studentName + ", Average: " + average + ", Letter Grade: " + letterGrade);
    }

    public static void main(String[] args) {
        GradeCalculator calculator = new GradeCalculator();
        Main mainApp = new Main();

        String studentName = "John Smith";
        double[] grades = {85.5, 92.0, 78.5, 90.0};

        double average = calculator.calculateAverage(grades);
        String letterGrade = calculator.getLetterGrade(average);

        mainApp.displayResult(studentName, average);
        mainApp.displayResult(studentName, average, letterGrade);
    }
}