package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

//    @Test
//    public void addExamScoreTest() {
//        // : Given
//        String expectedFirstName = "Monali";
//        String expectedLastName = "Litouka";
//        Double[] testNewArray = {100.0, 95.0, 123.0, 96.0};
//
//        // When
//        Student testStudent = new Student(expectedFirstName, expectedLastName, testNewArray);
//        Double scoreToPassIn = 75.0;
//
//        // Then
//        testStudent.addExamScore(scoreToPassIn);
//        int expectedArrayLength = testNewArray.length;
//
//        int actualArrayLength = testStudent.getNumberOfExamsTaken();
//
//
//        Assert.assertEquals(expectedArrayLength, actualArrayLength);
//        Assert.assertNotEquals(351, actualArrayLength);

         //****   Assert.assertTrue()
//    }


    @Test
    public void getAverageExamScoreTest() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0};
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0};
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);

        Student[] arrayOfStudents = {student1, student2, student3};
        Classroom classroom1 = new Classroom(arrayOfStudents);

        System.out.println(student1.getAverageExamScore());
        System.out.println(student2.getAverageExamScore());
        System.out.println(student3.getAverageExamScore());
        Double expectedClassroomExamAvg = (student1.getAverageExamScore() + student2.getAverageExamScore() + student3.getAverageExamScore()) / 3;
        System.out.println(expectedClassroomExamAvg);

        Double actualClassroomExamAvg = classroom1.getAverageExamScore(arrayOfStudents);

        Assert.assertEquals(expectedClassroomExamAvg, actualClassroomExamAvg);
    }

    @Test
    public void getAverageExamScoreTestNeg() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0};
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0};
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);

        Student[] arrayOfStudents = {student1, student2, student3};
        Classroom classroom1 = new Classroom(arrayOfStudents);

        System.out.println(student1.getAverageExamScore());
        System.out.println(student2.getAverageExamScore());
        System.out.println(student3.getAverageExamScore());
        Double expectedClassroomExamAvg = (student1.getAverageExamScore() + student2.getAverageExamScore() + student3.getAverageExamScore()) / 3;
        System.out.println(expectedClassroomExamAvg);

        Double actualClassroomExamAvg = classroom1.getAverageExamScore(arrayOfStudents);

        Assert.assertNotEquals(52.0, actualClassroomExamAvg);
    }

}
