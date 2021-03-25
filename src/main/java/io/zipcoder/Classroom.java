package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    Student[] students;
    int maxNumOfStudents;


    public Classroom() {

        Student[] students = new Student[30];
    }

    public Classroom(int maxNumOfStudents) {
        this.maxNumOfStudents = maxNumOfStudents;

    }

    public Classroom(Student[] arrayOfStudents) {
        this.students = arrayOfStudents;
    }


    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(Student[] student) {
        double sum = 0;
        for(Student forEachObjOfTheArray: student) {
            sum += forEachObjOfTheArray.getAverageExamScore();
        }
        Double studentAverage = sum / student.length;
        return studentAverage;
    }

    public void addStudent(Student[] studentArr, Student studentToAdd) {
        int lengthOfArray = studentArr.length - 1;
        studentArr[lengthOfArray] = studentToAdd;

    }

    public void removeStudent(String firstName, String lastName) {}

    public Student[] getStudentByScore() { return null; }

    public void getGradeBook() {}



}
