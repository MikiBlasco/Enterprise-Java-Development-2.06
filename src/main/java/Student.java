
// then create Student objects for 4 of your classmates.
// create a Map with a key of the student name and a value of a Student object.

import java.util.HashMap;

public class Student {
    private String name;
    private int grade;
    private HashMap<String, Student> students = new HashMap<>();

    public Student(String name, int grade, HashMap<String, Student> students) {
        setName(name);
        setGrade(grade);
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {

        if ( grade < 0 || grade > 100){
            System.err.println("Grade must be on range of 0 - 100");
            throw new IllegalArgumentException();
        }
        this.grade = grade;
    }

    public HashMap<String, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<String, Student> students) {
        this.students = students;
    }



}
