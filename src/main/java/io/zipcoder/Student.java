package io.zipcoder;

import java.util.ArrayList;

public class Student {

    String firstName;
    String lastName;
    ArrayList<Double> examScores;


    public Student() {

    }

    public Student(String firstName) {
        this.firstName = firstName;

    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Student(ArrayList<Double> examScores) {
                this.examScores = examScores;

    }

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public String getFirstName(String firstName) {
        return firstName;

    }

    public String getLastName(String lastName) {
        return lastName;
    }

    public String getExamScores(ArrayList<Double> examScores) {
        // needs to take arraylist, convert to string list, add all values together in one string, return string of Exam Scores
        int i = 0;
        int j = 1;
        String scoresString = "";

        for (Double element : examScores) {
            scoresString += "Exam " + j + " -> " + examScores.get(i) + "\n";
            i++;
            j++;
        }
        return scoresString;
    }

    public int getNumberOfExamsTaken(ArrayList<Double> examScores) {
        int numExams = examScores.size();
        return numExams;
    }

    public void addExamScore(double scoreToAdd) {
        examScores.add(scoreToAdd);
    }

    public void setExamScore(int examNumberToReplace, double replacementScore) {
        examScores.set(examNumberToReplace, replacementScore);

    }

    public double getAverageExamScore(ArrayList<Double> examScores) {
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
//        String studentFirstName = firstName;
//        String studentLastName = lastName;
//        Double avgExamScore = student.getAverageExamScore();
//        String examScoresString = student.getExamScores();
//        String summaryString = "Student name: " + studentFirstName + " " + studentLastName +"\n Average Score: " + avgExamScore + "\n" + examScoresString;
//
//        return summaryString;
//    }

}

