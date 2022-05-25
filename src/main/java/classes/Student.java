package classes;

import enums.Status;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private int grade;
    private Status status;
    private static HashMap<String, Student> students = new HashMap<>();


    public Student(String name, int grade, Status status) {
        setName(name);
        setGrade(grade);
        setStatus(status);
        students = new HashMap<>();
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {

        if (grade < 0 || grade > 100) {
            System.err.println("Grade must be on range of 0 - 100");
            throw new IllegalArgumentException();
        }
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }

    public HashMap<String, Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> studentsA, HashMap<String, Student> students) {

        for (Student s : studentsA) {
            students.put(s.getName(), s);
        }

    }


    public static void upGradeStudents(HashMap<String, Student> students) {
        double increment = 1.1;
        for (Student s : students.values()) {
            s.setGrade((int) (s.grade * increment));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", status=" + status +
                '}';
    }

}