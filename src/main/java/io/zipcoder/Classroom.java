package io.zipcoder;

import java.sql.SQLOutput;
import java.util.*;

public class Classroom {

    Student[] students;
    Map<String, String> gradebook = new LinkedHashMap<>();


    public Classroom() {
        students = new Student[30];
    }

    public Classroom(int maxNumOfStudents) {
        this(new Student[maxNumOfStudents]);
    }

    public Classroom(Student[] arrayOfStudents) {
        this.students = arrayOfStudents;
    }


    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(Student[] student) {
        double sum = 0;
        for(Student element : student) {
            sum += element.getAverageExamScore();
        }
        Double studentAverage = sum / student.length;
        return studentAverage;
    }

    public void addStudent(Student studentToAdd) {

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                continue;
            } else if (students[i] == null) {
                students[i] = studentToAdd;
                break;
            } else {
                System.out.println("this shit is fucked up");
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        int indexOfMatch = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                indexOfMatch = i;
            }

            for (int j = 0; j < students.length - 1; j++) {
                if (j >= indexOfMatch) {
                students[j] = students[j + 1];
                }
            }
        }
    }

    public Student[] getStudentByScore() {
        List<Student> studentsList = new ArrayList<Student>(Arrays.asList(students));
        Collections.sort(studentsList);
        Student[] newSortedStudentsArray = new Student[studentsList.size()];
        for (int i = 0; i < studentsList.size(); i++) {
            newSortedStudentsArray[i] = studentsList.get(i);
        }
        return newSortedStudentsArray;
    }

    public String getGradeBook() {
        for (Student student : students) {
            if (student.getAverageExamScore() < 56.5) {
                gradebook.put(student.getLastName(), "F");
            } else if (student.getAverageExamScore() < 78 && student.getAverageExamScore() >= 56.5) {
                gradebook.put(student.getLastName(), "D");
            } else if (student.getAverageExamScore() < 86.4 && student.getAverageExamScore() >= 78) {
                gradebook.put(student.getLastName(), "C");
            } else if (student.getAverageExamScore() < 97.1 && student.getAverageExamScore() >= 86.4) {
                gradebook.put(student.getLastName(), "B");
            } else if (student.getAverageExamScore() >= 97.1 && student.getAverageExamScore() <= 100) {
                gradebook.put(student.getLastName(), "A");
            } else break;
        }
        return gradebook.toString();
    }








}
