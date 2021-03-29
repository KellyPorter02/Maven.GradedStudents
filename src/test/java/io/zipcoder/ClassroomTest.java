package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ClassroomTest {

    @Test
    public void nulleryConstructorTest1() {
        int expectedArrayLength = 30;
        Classroom testClassroom = new Classroom();


        Student[] returnedStudentArray = testClassroom.getStudents();
        int returnedArrayLength = returnedStudentArray.length;

        Assert.assertEquals(expectedArrayLength, returnedArrayLength);
    }

    @Test
    public void nulleryConstructorTest2() {

        Classroom testClassroom = new Classroom();


        Student[] returnedStudentArray = testClassroom.getStudents();
        int returnedArrayLength = returnedStudentArray.length;

        Assert.assertNotEquals(null, returnedArrayLength);
    }

    @Test
    public void ConstructorTestMaxStudents1() {
        int givenMaxStudentLength = 50;
        Classroom testClassroom = new Classroom(givenMaxStudentLength);


        Student[] returnedStudentArray = testClassroom.getStudents();
        int returnedArrayLength = returnedStudentArray.length;

        Assert.assertEquals(givenMaxStudentLength, returnedArrayLength);
    }

    @Test
    public void ConstructorTestMaxStudents2() {
        int givenMaxStudentLength = 50;
        Classroom testClassroom = new Classroom(givenMaxStudentLength);


        Student[] returnedStudentArray = testClassroom.getStudents();
        int returnedArrayLength = returnedStudentArray.length;

        Assert.assertNotEquals(null, returnedArrayLength);
    }

    @Test
    public void ConstructorTestStudentArray1() {
        Double[] student1Scores = {55.0, 65.0, 75.0, 99.0};
        Double[] student2Scores = {35.0, 89.0, 57.0, 65.0};
        Student student1 = new Student("Kelly", "Porter", student1Scores);
        Student student2 = new Student("Jack", "Walls", student2Scores);
        Student[] testArrayOfStudents = {student1, student2};

        Classroom testClassroom = new Classroom(testArrayOfStudents);

        Student[] returnedStudentArray = testClassroom.getStudents();

        Assert.assertEquals(testArrayOfStudents, returnedStudentArray);
    }

    @Test
    public void ConstructorTestStudentArray2() {
        Double[] student1Scores = {55.0, 65.0, 75.0, 99.0};
        Double[] student2Scores = {35.0, 89.0, 57.0, 65.0};
        Student student1 = new Student("Kelly", "Porter", student1Scores);
        Student student2 = new Student("Jack", "Walls", student2Scores);
        Student[] testArrayOfStudents = {student1, student2};

        Classroom testClassroom = new Classroom(testArrayOfStudents);

        Student[] returnedStudentArray = testClassroom.getStudents();

        Assert.assertNotEquals(null, returnedStudentArray);
    }


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
    public void getStudentsTest() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0};
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0};
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);

        Student[] arrayOfStudents = {student1, student2, student3};
        Classroom classroom1 = new Classroom(arrayOfStudents);

        Student[] actualStudentsArr = classroom1.getStudents();

        Assert.assertEquals(arrayOfStudents, actualStudentsArr);

    }


    @Test
    public void getStudentsTestNeg() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0};
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0};
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);

        Student[] arrayOfStudents = {student1, student2, student3};
        Classroom classroom1 = new Classroom(arrayOfStudents);

        Student[] actualStudentsArr = classroom1.getStudents();

        Assert.assertNotEquals(3, actualStudentsArr);

    }


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

        Double expectedClassroomExamAvg = (student1.getAverageExamScore() + student2.getAverageExamScore() + student3.getAverageExamScore()) / 3;

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

        Double expectedClassroomExamAvg = (student1.getAverageExamScore() + student2.getAverageExamScore() + student3.getAverageExamScore()) / 3;

        Double actualClassroomExamAvg = classroom1.getAverageExamScore(arrayOfStudents);

        Assert.assertNotEquals(52.0, actualClassroomExamAvg);
    }


    @Test
    public void addStudentTest1() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0};
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0};
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0};
        Double[] studentArr4 = {99.0, 96.0, 94.0, 97.0};
        Double[] studentArr5 = {99.0, 56.0, 45.0, 52.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);
        Student student4 = new Student("Xiong", "Yuan", studentArr4);
        Student student5 = new Student("Gregory", "Donnelly", studentArr5);

        Classroom classroom1 = new Classroom(5);
        classroom1.addStudent(student1);
        classroom1.addStudent(student2);
        classroom1.addStudent(student3);
        classroom1.addStudent(student4);
        classroom1.addStudent(student5);


        Student[] expectedStudentArray = {student1, student2, student3, student4, student5};
        Student[] returnedStudentArray = classroom1.getStudents();
        System.out.println(Arrays.toString(expectedStudentArray));
        System.out.println(Arrays.toString(returnedStudentArray));

        Assert.assertEquals(expectedStudentArray, returnedStudentArray);
    }

    @Test
    public void addStudentTest2() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0};
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0};
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0};
        Double[] studentArr4 = {99.0, 96.0, 94.0, 97.0};
        Double[] studentArr5 = {99.0, 56.0, 45.0, 52.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);
        Student student4 = new Student("Xiong", "Yuan", studentArr4);
        Student student5 = new Student("Gregory", "Donnelly", studentArr5);

        Classroom classroom1 = new Classroom(5);
        classroom1.addStudent(student1);
        classroom1.addStudent(student2);
        classroom1.addStudent(student3);
        classroom1.addStudent(student4);
        classroom1.addStudent(student5);


        Student[] expectedStudentArray = {student1, student2, student3, student4, student5};
        Student[] returnedStudentArray = classroom1.getStudents();
        System.out.println(Arrays.toString(expectedStudentArray));
        System.out.println(Arrays.toString(returnedStudentArray));

        Assert.assertNotEquals(null, returnedStudentArray);
    }

    @Test
    public void removeStudentTest1() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0};
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0};
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0};
        Double[] studentArr4 = {99.0, 96.0, 94.0, 97.0};
        Double[] studentArr5 = {99.0, 56.0, 45.0, 52.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);
        Student student4 = new Student("Xiong", "Yuan", studentArr4);
        Student student5 = new Student("Gregory", "Donnelly", studentArr5);

        Student[] initialArrayOfStudents = {student1, student2, student3, student4, student5};

        Classroom testClassroom = new Classroom(initialArrayOfStudents);
        testClassroom.removeStudent(student3.getFirstName(), student3.getLastName());

        Student[] expectedStudentArray = {student1, student2, student4, student5, null};
        Student[] returnedStudentArray = testClassroom.getStudents();

        System.out.println(Arrays.toString(expectedStudentArray));
        System.out.println(Arrays.toString(returnedStudentArray));

        Assert.assertEquals(expectedStudentArray, returnedStudentArray);
    }

    @Test
    public void getStudentByScoreTest1() {
        Double[] studentArr1 = {65.0, 34.0, 87.0, 98.0}; // 71.0  1  exp: 1,3,2
        Double[] studentArr2 = {85.0, 42.0, 12.0, 88.0}; // 56.75  3
        Double[] studentArr3 = {99.0, 56.0, 45.0, 52.0}; // 63.0  2
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);

        Student[] arrayOfStudents = {student1, student2, student3};
        Classroom classroom1 = new Classroom(arrayOfStudents);

        Student[] expectedSortedByScore = {student1, student3, student2};
        Student[] returnedArray = classroom1.getStudentByScore();

        Assert.assertEquals(expectedSortedByScore, returnedArray);
    }

    @Test
    public void getStudentByScoreTest2() {
        Double[] studentArr1 = {99.0, 56.0, 45.0, 52.0}; // 63.0  2
        Double[] studentArr2 = {65.0, 34.0, 87.0, 98.0}; // 71.0  1  exp: 2,1,3 lena,kelly,monali
        Double[] studentArr3 = {85.0, 42.0, 12.0, 88.0}; // 56.75  3
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);

        Student[] arrayOfStudents = {student1, student2, student3};
        Classroom classroom1 = new Classroom(arrayOfStudents);

        Student[] expectedSortedByScore = {student2, student1, student3};
        Student[] returnedArray = classroom1.getStudentByScore();

        Assert.assertEquals(expectedSortedByScore, returnedArray);
    }

    @Test
    public void getGradeBookTest1() {
        Double[] studentArr1 = {100.0,100.0,100.0,100.0};
        Double[] studentArr2 = {80.0,80.0,80.0,80.0};
        Double[] studentArr3 = {65.0,65.0,65.0,65.0};
        Double[] studentArr4 = {55.0,55.0,55.0,55.0,};
        Double[] studentArr5 = {90.0,90.0,90.0,90.0};
        Double[] studentArr6 = {45.0,45.0,45.0,45.0};
        Double[] studentArr7 = {76.0,76.0,76.0,76.0};
        Double[] studentArr8 = {75.0,75.0,75.0,75.0};
        Double[] studentArr9 = {98.0,98.0,98.0,98.0};
        Double[] studentArr10 = {95.0,95.0,95.0,95.0};
        Double[] studentArr11 = {86.0,86.0,86.0,86.0};
        Double[] studentArr12 = {60.0,60.0,60.0,60.0};
        Double[] studentArr13 = {70.0,70.0,70.0,70.0};
        Double[] studentArr14 = {85.0,85.0,85.0,85.0};
        Student student1 = new Student("Kelly", "Porter", studentArr1);
        Student student2 = new Student("Lena", "Litouka", studentArr2);
        Student student3 = new Student("Monali", "Khandelwal", studentArr3);
        Student student4 = new Student("Chris", "Allen", studentArr4);
        Student student5 = new Student("Jorge", "Tapia", studentArr5);
        Student student6 = new Student("Ryan", "Huffford", studentArr6);
        Student student7 = new Student("Abe", "Figuero", studentArr7);
        Student student8 = new Student("Justin", "Banks", studentArr8);
        Student student9 = new Student("Hazel", "Name", studentArr9);
        Student student10 = new Student("Greg", "Donnelly", studentArr10);
        Student student11 = new Student("Theresa", "Mashura", studentArr11);
        Student student12 = new Student("Ashley", "Smart", studentArr12);
        Student student13 = new Student("Xiong", "Yuan", studentArr13);
        Student student14 = new Student("Mike", "Vong", studentArr14);
        Student[] arrayOfStudents = {student1, student2, student3, student4, student5, student6
        , student7, student8, student9, student10, student11, student12, student13, student14};

        Classroom classroom1 = new Classroom(arrayOfStudents);

        Student[] returnedArray = classroom1.getStudentByScore();
        String expectedGradesMapString = "{Porter=A, Litouka=C, Khandelwal=D, Allen=F, Tapia=B, Huffford=F, Figuero=D, Banks=D, Name=A, Donnelly=B, Mashura=C, Smart=D, Yuan=D, Vong=C}";
        String returnedGradesMap = classroom1.getGradeBook();

        Assert.assertEquals(expectedGradesMapString, returnedGradesMap);
    }

}
