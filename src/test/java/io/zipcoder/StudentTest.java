package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;




public class StudentTest {

    @Test
    public void constructorWithFirstAndLastTest() {
        // : Given
        String expectedFirstName = "Kelly";
        String expectedlastName = "Porter";

        // When
        Student testStudent = new Student(expectedFirstName, expectedlastName);

        // Then
        String actualFirstName = testStudent.getFirstName();
        String actualLastName = testStudent.getLastName();


        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertNotEquals("Joe", actualFirstName);
        Assert.assertEquals(expectedlastName, actualLastName);
        Assert.assertNotEquals("Dirt", actualLastName);

    }

    @Test
    public void constructorArrayListTest() {
        // : Given
        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
        expectedExamScoresArr.add(100.0);
        expectedExamScoresArr.add(95.0);
        expectedExamScoresArr.add(123.0);
        expectedExamScoresArr.add(96.0);

        String expectedArrayString = expectedExamScoresArr.toString();

        // When
        Student testStudent = new Student(expectedExamScoresArr);

        // Then

        int expectedArrayLength = 4;
        int actualArrayLength = testStudent.getNumberOfExamsTaken();
        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();
        String actualArrayString = testStudent.getExamScores();

        Assert.assertEquals(expectedArrayString, actualArrayString);
        Assert.assertNotEquals(null, actualArrayString);

    }

    @Test
    public void constructorWithFirstLastAndArrayTest() {
        // : Given
        String expectedFirstName = "Kelly";
        String expectedlastName = "Porter";

        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
        expectedExamScoresArr.add(100.0);
        expectedExamScoresArr.add(95.0);
        expectedExamScoresArr.add(123.0);
        expectedExamScoresArr.add(96.0);

        String expectedArrayString = expectedExamScoresArr.toString();

        // When
        Student testStudent = new Student(expectedFirstName, expectedlastName, expectedExamScoresArr);

        // Then
        String actualFirstName = testStudent.getFirstName();
        String actualLastName = testStudent.getLastName();

        int expectedArrayLength = 4;
        int actualArrayLength = testStudent.getNumberOfExamsTaken();
        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();
        String actualArrayString = testStudent.getExamScores();


        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertNotEquals("W", actualFirstName);
        Assert.assertEquals(expectedlastName, actualLastName);
        Assert.assertNotEquals("T", actualLastName);
        Assert.assertEquals(expectedArrayString, actualArrayString);
        Assert.assertNotEquals("F", actualArrayString);

    }


    @Test
    public void setFirstNameTest() {
        // Given
        Student testStudent = new Student("Leon", "Porter");
        String expected = "Kelly";

        // When
        testStudent.setFirstName(expected);
        String actual = testStudent.getFirstName();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertNotEquals(" ", actual);
    }

    @Test
    public void setLastNameTest() {
        // Given
        Student testStudent = new Student("Kelly", "Walls");
        String expected = "Porter";

        // When
        testStudent.setLastName(expected);
        String actual = testStudent.getLastName();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertNotEquals(" ", actual);
    }

    @Test
    public void getFirstNameTest() {
        // Given
        String expected = "Kelly";
        Student testStudent = new Student(expected, "");

        // When
        String actual = testStudent.getFirstName();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertNotEquals(" ", actual);
    }

    @Test
    public void getLastNameTest() {
        // Given
        String expected = "Porter";
        Student testStudent = new Student("", expected);

        // When
        String actual = testStudent.getLastName();

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertNotEquals(" ", actual);
    }

    @Test
    public void setExamScoreTest() {
        // : Given
        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
        expectedExamScoresArr.add(100.0);
        expectedExamScoresArr.add(95.0);
        expectedExamScoresArr.add(123.0);
        expectedExamScoresArr.add(96.0);

        int expectedIndToReplace = 0;
        double expectedScoreToReplace = 35.0;

        // When
        Student testStudent = new Student(expectedExamScoresArr);
        testStudent.setExamScore(expectedIndToReplace, expectedScoreToReplace);

        String expectedArrayString = expectedExamScoresArr.toString();

        // Then

        String actualArrayString = testStudent.getExamScores();


        Assert.assertEquals(expectedArrayString, actualArrayString);
        Assert.assertNotEquals("", actualArrayString);

    }

    @Test
    public void getExamScoresTest() {
        // : Given
        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
        expectedExamScoresArr.add(100.0);
        expectedExamScoresArr.add(95.0);
        expectedExamScoresArr.add(123.0);
        expectedExamScoresArr.add(96.0);

        String expectedArrayString = expectedExamScoresArr.toString();

        // When
        Student testStudent = new Student(expectedExamScoresArr);

        // Then

        ArrayList<Double> actualExamScoresArr = new ArrayList<Double>();
        String actualArrayString = testStudent.getExamScores();


        Assert.assertEquals(expectedArrayString, actualArrayString);
        Assert.assertNotEquals("i like turtles", actualArrayString);
    }

    @Test
    public void getNumberOfExamsTakenTest() {
        // : Given
        String expectedFirstName = "Kelly";
        String expectedlastName = "Porter";


        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
        expectedExamScoresArr.add(100.0);
        expectedExamScoresArr.add(95.0);
        expectedExamScoresArr.add(123.0);
        expectedExamScoresArr.add(96.0);
        expectedExamScoresArr.add(15.0);

        // When
        Student testStudent = new Student(expectedFirstName, expectedlastName, expectedExamScoresArr);

        // Then
        int expectedArrayLength = expectedExamScoresArr.size();
        int actualArrayLength = testStudent.getNumberOfExamsTaken();


        Assert.assertEquals(expectedArrayLength, actualArrayLength);
        Assert.assertNotEquals(351, actualArrayLength);
    }

    @Test
    public void addExamScoreTest() {
        // : Given
        String expectedFirstName = "Kelly";
        String expectedlastName = "Porter";


        ArrayList<Double> expectedExamScoresArr = new ArrayList<Double>();
        expectedExamScoresArr.add(100.0);
        expectedExamScoresArr.add(95.0);
        expectedExamScoresArr.add(123.0);
        expectedExamScoresArr.add(96.0);
        expectedExamScoresArr.add(15.0);

        // When
        Student testStudent = new Student(expectedFirstName, expectedlastName, expectedExamScoresArr);

        // Then
        int expectedArrayLength = expectedExamScoresArr.size();
        int actualArrayLength = testStudent.getNumberOfExamsTaken();


        Assert.assertEquals(expectedArrayLength, actualArrayLength);
        Assert.assertNotEquals(351, actualArrayLength);
    }

    @Test
    public void getAverageExamScoreTest() {

    }


}