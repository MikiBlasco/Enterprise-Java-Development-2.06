import classes.Student;
import enums.Status;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {



        Student s1 = new Student("Flanagan", 10, Status.APROVADO);
        Student s2 = new Student("Marina", 20, Status.SUSPENDIDO);
        Student s3 = new Student("Ale", 60, Status.SUSPENDIDO);
        Student s4 = new Student("Carwi", 90, Status.APROVADO);


        ArrayList studentsA = new ArrayList<>();
        studentsA.add(s1);
        studentsA.add(s2);
        studentsA.add(s3);
        studentsA.add(s4);

        HashMap<String, Student> students = new HashMap<>();

        System.out.println("-------before Set Students--------------------------------------------");
        System.out.println("entrySet: " + students.entrySet());

        Student.setStudents(studentsA, students);

        System.out.println("-------After Set Students--------------------------------");
        System.out.println("entrySet: " + students.entrySet());


        System.out.println("-------Grades before UpGrade-------------------------------------");
        for(Student s : students.values()) {
            System.out.println(s.getName() + ": " + s.getGrade());
        }
        Student.upGradeStudents(students);
        System.out.println("-------Grades After UpGrade-------------------------------------");
        for(Student s : students.values()) {
            System.out.println(s.getName() + ": " + s.getGrade());
        }
        System.out.println("-------------------------------------");

        /*
        students.put(s1.getName(), s1);
        students.put(s2.getName(), s2);
        students.put(s3.getName(), s3);
        students.put(s4.getName(), s4);
        */

        System.out.println("-------Print by Get Name (is the key) on the HashMap------------------------");
        System.out.println("get flanagan: " + students.get("Flanagan"));
        System.out.println("get Marina: " + students.get("Marina"));
        System.out.println("get Ale: " +  students.get("Ale"));
        System.out.println("get Carwi: " + students.get("Carwi"));
        System.out.println("------------------------------------------------");


        System.out.println("------------------------------------------------");
        System.out.println("-------KeySet of students: " + students.keySet());
        System.out.println("-------Values of students: " + students.values());
        System.out.println("-------entrySet of students: " + students.entrySet());
        System.out.println("------------------------------------------------");
        System.out.println("-------FOR EACH students Values----------------------------------------");

        for(Student s : students.values()){
            System.out.println("Values For: " + s);
        }
        System.out.println("-------FOR EACH students Values - Names----------------------------------------");
        for(Student s : students.values()){
            System.out.println("Values For getName(): " + s.getName());
        }
        System.out.println("-------FOR EACH students KeySet - Names----------------------------------------");
        for (String s : students.keySet()){
            System.out.println("KeySetFor: " + s);
        }

    }
}
