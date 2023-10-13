package Tests;

import Ubungen.Ubung1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ubung1Test {
    private Ubung1 ubung1;
    private int[] notenException;
    private int[] notenValues;
    @Before
    public void setUp(){
        ubung1 = new Ubung1();
        notenException = new int[]{34, 35, 76, 43, 0, 100, -1};
        notenValues = new int[]{56, 89, 32, 68, 21, 34};
    }
    @Test
    public void nichtAusreichendExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung1.nichtAusreichend(notenException));
    }

    @Test
    public void nichtAusreichendNotenTest(){
        int[] expectedResult = {32, 21, 34};
        assertArrayEquals(expectedResult, ubung1.nichtAusreichend(notenValues));
    }

    @Test
    public void averageGradeExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung1.averageGrade(notenException));
    }

    @Test
    public void averageGradeValueTest(){
        assertEquals(50.5, ubung1.averageGrade(notenValues), 0.1);  //using delta to test values of type double
    }

    @Test
    public void roundedGradesExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung1.roundedGrades(notenException));
    }

    @Test
    public void roundedGradesValuesTest(){
        int[] expectedResult = {56, 90, 32, 70, 21, 34};
        assertArrayEquals(expectedResult, ubung1.roundedGrades(notenValues));
    }

    @Test
    public void maxRoundedGradeExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung1.maxRoundedGrade(notenException));
    }

    @Test
    public void maxRoundedGradeValueTest(){
        assertEquals(68, ubung1.maxRoundedGrade(notenValues));
    }
}
