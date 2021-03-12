package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {

//    @Test
//    public void constructorWithFirstAndLastTest() {
//        // : Given
//        String expectedFirstName = "Kelly";
//        String expectedlastName = "Porter";
//
//        // When
//        Student testStudent = new Student(expectedFirstName, expectedlastName);
//
//        // Then
//        String actualFirstName = testStudent.getFirstName();
//        String actualLastName = testStudent.getLastName();
//
//
//        Assert.assertEquals(expectedFirstName, actualFirstName);
//        Assert.assertNotEquals("Joe", actualFirstName);
//        Assert.assertEquals(expectedlastName, actualLastName);
//        Assert.assertNotEquals("Dirt", actualLastName);
//
//    }

//    @Test
//    public void constructorArrayListTest() {
//        // : Given
//        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
//        expectedExamScoresArr.add(100.0);
//        expectedExamScoresArr.add(95.0);
//        expectedExamScoresArr.add(123.0);
//        expectedExamScoresArr.add(96.0);
//
//        String expectedArrayString = expectedExamScoresArr.toString();
//
//        // When
//        Student testStudent = new Student(expectedExamScoresArr);
//
//        // Then
//
//        int expectedArrayLength = 4;
//        int actualArrayLength = testStudent.getNumberOfExamsTaken();
//        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();
//        String actualArrayString = testStudent.getExamScores();
//
//        Assert.assertEquals(expectedArrayString, actualArrayString);
//        Assert.assertNotEquals(null, actualArrayString);
//
//    }

    @Test
    public void constructorWithFirstLastAndArrayTest() {
        // : Given
        String expectedFirstName = "Kelly";
        String expectedLastName = "Porter";

        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        String expectedArrayString = Arrays.toString(expectedArr);

        // When
        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // Then
        String actualFirstName = testStudent.getFirstName();
        String actualLastName = testStudent.getLastName();


        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();
        String actualArrayString = testStudent.getExamScores();


        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedArrayString, actualArrayString);


    }

    @Test
    public void constructorWithFirstLastAndArrayTestNeg() {
        // : Given
        String expectedFirstName = "Kelly";
        String expectedLastName = "Porter";

        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        String expectedArrayString = Arrays.toString(expectedArr);

        // When
        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // Then
        String actualFirstName = testStudent.getFirstName();
        String actualLastName = testStudent.getLastName();


        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();
        String actualArrayString = testStudent.getExamScores();


        Assert.assertNotEquals("W", actualFirstName);
        Assert.assertNotEquals("T", actualLastName);
        Assert.assertNotEquals("F", actualArrayString);

    }


    @Test
    public void setFirstNameTest() {
        // Given
        String expectedFirstName = "Kelly";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // When
        testStudent.setFirstName("Lena");
        String actualFirstName = testStudent.getFirstName();

        // Then
        Assert.assertEquals("Lena", actualFirstName);

    }

    @Test
    public void setFirstNameTestNeg() {
        // Given
        String expectedFirstName = "Kelly";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // When
        testStudent.setFirstName(expectedFirstName);
        String actualFirstName = testStudent.getFirstName();

        // Then

        Assert.assertNotEquals("yeet", actualFirstName);

    }

    @Test
    public void setLastName() {
        // Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // When
        testStudent.setLastName("Smart");
        String actualLastName = testStudent.getLastName();

        // Then
        Assert.assertEquals("Smart", actualLastName);

    }

    @Test
    public void setLastNameNeg() {
        // Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // When
        testStudent.setLastName("Donnelly");
        String actualLastName = testStudent.getLastName();

        // Then
        Assert.assertNotEquals("Khandelwal", actualLastName);

    }

    @Test
    public void getFirstNameTest() {
        // Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);


        // When
        String actual = testStudent.getFirstName();

        // Then
        Assert.assertEquals(expectedFirstName, actual);

    }

    @Test
    public void getFirstNameTestNeg() {
        // Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);


        // When
        String actual = testStudent.getFirstName();

        // Then

        Assert.assertNotEquals("Marceline", actual);

    }

    @Test
    public void getLastNameTest() {
        // Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // When
        String actual = testStudent.getLastName();

        // Then
        Assert.assertEquals(expectedLastName, actual);
        Assert.assertNotEquals(" ", actual);
    }

    @Test
    public void getLastNameTestNeg() {
        // Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        // When
        String actual = testStudent.getLastName();

        // Then
        Assert.assertEquals(expectedLastName, actual);
        Assert.assertNotEquals(" ", actual);
    }

    @Test
    public void getExamScoresTest() {
        // : Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        // When
        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        String expectedArrayString = Arrays.toString(expectedArr);


        // Then

        String actualArrayString = testStudent.getExamScores();


        Assert.assertEquals(expectedArrayString, actualArrayString);

    }

    @Test
    public void getExamScoresTestNeg() {
        // : Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        // When
        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        String expectedArrayString = Arrays.toString(expectedArr);


        // Then

        String actualArrayString = testStudent.getExamScores();

        Assert.assertNotEquals("i like turtles", actualArrayString);
    }

    @Test
    public void resetExamScoreTest() {
        // : Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        // When
        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        int expectedIndToReplace = 0;
        double expectedScoreToReplace = 35.0;
        //After we reset the element 0 to 35.0
        String expectedArrayString = "[35.0, 95.0, 123.0, 96.0]";

        testStudent.resetExamScore(expectedIndToReplace, expectedScoreToReplace);
        String actualArrayString = testStudent.getExamScores();


        // Then

        Assert.assertEquals(expectedArrayString, actualArrayString);
        Assert.assertNotEquals("", actualArrayString);

    }

    @Test
    public void resetExamScoreTestNeg() {
        // : Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] expectedArr = {100.0, 95.0, 123.0, 96.0};

        // When
        Student testStudent = new Student(expectedFirstName, expectedLastName, expectedArr);

        int expectedIndToReplace = 0;
        double expectedScoreToReplace = 35.0;

        String expectedArrayString = "[35.0, 95.0, 123.0, 96.0]";

        testStudent.resetExamScore(expectedIndToReplace, expectedScoreToReplace);
        String actualArrayString = testStudent.getExamScores();


        // Then

        Assert.assertNotEquals("", actualArrayString);

    }
//

//
//    @Test
//    public void getNumberOfExamsTakenTest() {
//        // : Given
//        String expectedFirstName = "Kelly";
//        String expectedlastName = "Porter";
//
//
//        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
//        expectedExamScoresArr.add(100.0);
//        expectedExamScoresArr.add(95.0);
//        expectedExamScoresArr.add(123.0);
//        expectedExamScoresArr.add(96.0);
//        expectedExamScoresArr.add(15.0);
//
//        // When
//        Student testStudent = new Student(expectedFirstName, expectedlastName, expectedExamScoresArr);
//
//        // Then
//        int expectedArrayLength = expectedExamScoresArr.size();
//        int actualArrayLength = testStudent.getNumberOfExamsTaken();
//
//
//        Assert.assertEquals(expectedArrayLength, actualArrayLength);
//        Assert.assertNotEquals(351, actualArrayLength);
//    }
//
    @Test
    public void addExamScoreTest() {
        // : Given
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] testNewArray = {100.0, 95.0, 123.0, 96.0};

        // When
        Student testStudent = new Student(expectedFirstName, expectedLastName, testNewArray);
        Double scoreToPassIn = 75.0;

        // Then
        testStudent.addExamScore(scoreToPassIn);
        int expectedArrayLength = testNewArray.length;

        int actualArrayLength = testStudent.getNumberOfExamsTaken();


        Assert.assertEquals(expectedArrayLength, actualArrayLength);
        Assert.assertNotEquals(351, actualArrayLength);
    }

    @Test
    public void setFirstName() {
    }

    @Test
    public void testSetLastName() {
    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void getExamScores() {
    }

    @Test
    public void resetExamScore() {
    }

    @Test
    public void getNumberOfExamsTaken() {
    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void getAverageExamScore() {
    }
//
//    @Test
//    public void getAverageExamScoreTest() {
//
//    }


}