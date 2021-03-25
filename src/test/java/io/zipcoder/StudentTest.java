package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {

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
    public void testToString() {
        // Arrange
        String expectedFirstName = "Monali";
        String expectedLastName = "Litouka";
        Double[] testNewArray = {100.0, 95.0, 123.0, 96.0};
        Student testStudent = new Student(expectedFirstName, expectedLastName, testNewArray);
        Student testStudent2 = new Student(expectedFirstName, expectedLastName, testNewArray);
        String expected = testStudent.toString();
        // Act
        String returned = testStudent2.toString();
        // Assert
        Assert.assertEquals(expected, returned);
    }
}