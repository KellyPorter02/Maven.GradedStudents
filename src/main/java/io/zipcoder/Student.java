package io.zipcoder;

import java.util.ArrayList;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> examScores;


//    public Student() {
//
//    }
//
//    public Student(String firstName) {
//        this.firstName = firstName;
//
//    }
//
    // Constructor Methods

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Student(ArrayList<Double> examScores) {
                this.examScores = examScores;
                System.out.println(examScores);

    }

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
        System.out.println(examScores);
    }

    // Getters & Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;

    }

    public String getLastName() {
        return lastName;
    }


    public void setExamScore(int examNumberToReplace, double replacementScore) {
        examScores.set(examNumberToReplace, replacementScore);

    }

    public String getExamScores() {
        String stringValueOfExamScores = examScores.toString();
        return stringValueOfExamScores;

    }

    public int getNumberOfExamsTaken() {
        int numExams = examScores.size();
        return numExams;
    }

    // Other methods

    public void addExamScore(double scoreToAdd) {
        examScores.add(scoreToAdd);
    }

    public double getAverageExamScore() {
        double sumOfExamScores = 0;
        double numExamScores = examScores.size();
        int i = 0;
        for (Double element : examScores) {
            sumOfExamScores += examScores.get(i);
            i++;
        }
        double avgExamScore = sumOfExamScores / numExamScores;
        return avgExamScore;
    }


//    @Override
//    public String toString(String firstName, String lastName, Student student) {
//        return super.toString();
//        String studentFirstName = firstName;
//        String studentLastName = lastName;
//        Double avgExamScore = student.getAverageExamScore();
//        String examScoresString = student.getExamScores();
//        String summaryString = "Student name: " + studentFirstName + " " + studentLastName +"\n Average Score: " + avgExamScore + "\n" + examScoresString;
//
//        return summaryString;
//    }

}

