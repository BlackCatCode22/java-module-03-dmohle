public class Student {
    private static int numOfStudents = 0;

    // Create a constructor for our new objects.
    public Student() {
        numOfStudents++;
    }

    public static int getNumOfStudents() {
        return numOfStudents;
    }

    // Give our Student class a few fields
    String firstName;
    String lastName;
    String major;
    double gpa;
    int age;
    boolean onProbation;
}
