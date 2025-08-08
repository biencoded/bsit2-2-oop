public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Michael Jonard", 20, "BSCS", 89, 90, 87);
        Student s2 = new Student("Kap Niño Barzaga", 19, "BSCE", 76, 65, 60);
        Student s3 = new Student("Lebanon James", 21, "BSIT", 88, 89, 92);

        Student[] students = {s1, s2, s3};
        int passingCount = 0;

        for (Student stdnts : students) {
            stdnts.displayInfo();
            if (stdnts.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("Summary: " + passingCount + " out of " +
                students.length + " students are passing.");
    }
}