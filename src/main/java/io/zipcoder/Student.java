package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

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

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        Double[] testScoresRegArrType = testScores;
        ArrayList<Double> testScoresAsArrList = new ArrayList<Double>(Arrays.asList(testScoresRegArrType));
        examScores = testScoresAsArrList;
        System.out.println(examScores);

    }

//    public Student(ArrayList<Double> examScores) {
//        this.examScores = examScores;
//        System.out.println(examScores);
//
//    }

//    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.examScores = examScores;
//      //**** examScores.addAll(Arrays.asList(examScores)); use this!!!
//        System.out.println(examScores);
//    }

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

    public String getExamScores() {
        String stringValueOfExamScores = examScores.toString();
        System.out.println(stringValueOfExamScores);
        return stringValueOfExamScores;

    }

    public void resetExamScore(int examNumberToReplace, double replacementScore) {
        examScores.set(examNumberToReplace, replacementScore);
        System.out.println(examScores.set(examNumberToReplace, replacementScore));

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

//    public String toString() {
//
//        String studentFirstName = firstName;
//        String studentLastName = lastName;
//        Double avgExamScore = student.getAverageExamScore();
//        String examScoresString = student.getExamScores();
//        String summaryString = "Student name: " + studentFirstName + " " + studentLastName +"\n Average Score: " + avgExamScore + "\n" + examScoresString;
//
//        return summaryString;
//    }


}

