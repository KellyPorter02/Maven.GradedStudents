package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student> {

    private String firstName;
    private String lastName;
    ArrayList<Double> examScores = new ArrayList<>();
    private double averageExamScore;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        examScores = new ArrayList<Double>(Arrays.asList(testScores));
        this.averageExamScore = this.getAverageExamScore();

    }


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
        return stringValueOfExamScores;

    }

    public void resetExamScore(int examNumberToReplace, double replacementScore) {
        examScores.set(examNumberToReplace, replacementScore);

    }


    public int getNumberOfExamsTaken() {
        int numExams = examScores.size();
        return numExams;
    }


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

        @Override
    public String toString() {

        String studentFirstName = firstName;
        String studentLastName = lastName;
        Double avgExamScore = this.getAverageExamScore();
        String examScoresString = this.getExamScores();
        String summaryString = "Student name: " + studentFirstName + " " + studentLastName +"\n Average Score: " + avgExamScore + "\n" + examScoresString;

        return summaryString;
    }


    @Override
    public int compareTo(Student student) {
        if (this.averageExamScore < student.averageExamScore) {
            return 1;
        } else if (this.averageExamScore == student.averageExamScore) {
            return 0;
        } else
        return -1;
    }


}

