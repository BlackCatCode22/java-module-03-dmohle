// dH 9/10/24
// App.java
// String point to create objects from my classes
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {

        System.out.println("\n\nWelcome to classes and object-oriented programming!\n");

        Student myNewStudent = new Student();

        myNewStudent.age = 64;
        myNewStudent.gpa = 3.4;
        myNewStudent.major = "History";
        myNewStudent.firstName = "Dennis";
        myNewStudent.lastName = "Mohle";
        myNewStudent.onProbation = true;

        // Output some stuff about our new object
        System.out.println("\n The first name of our student is: " + myNewStudent.firstName + "\n\n");

        // Create two more students.
        Student anotherStudent = new Student();
        Student oneMoreStu = new Student();

        oneMoreStu.major = "history";

        anotherStudent.age = 44;

        // How many students?
        System.out.println(" \n There were " + Student.getNumOfStudents() + " Student objects created!" );

        // Create a phone object
        Phone myNewPhone = new Phone();

        myNewPhone.model = "Pixel 8";
        myNewPhone.numOfCameras = 3;

        System.out.println("\n myNewPhone has " + myNewPhone.numOfCameras + " cameras!\n");

        // Create 100 students with an ArrayList - a handy data structure that is
        // flexible in size.

        ArrayList<Student> myStudentList = new ArrayList<Student>();

        for (int i = 0; i < 100; i++) {
            Student myStudent = new Student();
            myStudent.firstName = "Student " + Integer.toString(i);
            myStudent.age = 99;
            myStudentList.add(myStudent);
        }

        // Output the ArrayList of 100 students
        for (int i = 0; i<100; i++) {
            // Output the Student object.
            System.out.println("\n Student's first name is " + myStudentList.get(i).firstName);
        }


    }
}