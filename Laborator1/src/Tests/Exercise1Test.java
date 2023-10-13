package Tests;

import Exercises.Exercise1;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise1Test {
    private Exercise1 exercise1;
    private int[] gradesException;
    private int[] gradesValue;
    @Before
    public void setUp(){
        exercise1 = new Exercise1();
        gradesException = new int[]{34, 35, 76, 43, 0, 100, -1};
        gradesValue = new int[]{56, 89, 32, 68, 21, 34};
    }
    @Test
    public void below40GradesExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise1.below40Grades(gradesException));
    }

    @Test
    public void below40GradesTest(){
        assertArrayEquals(new int[]{32, 21, 34}, exercise1.below40Grades(gradesValue));
    }

    @Test
    public void averageGradeExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise1.averageGrade(gradesException));
    }

    @Test
    public void averageGradeValueTest(){
        assertEquals(50.5, exercise1.averageGrade(gradesValue), 0.1);  //using delta to test values of type double
    }

    @Test
    public void roundedGradesExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise1.roundedGrades(gradesException));
    }

    @Test
    public void roundedGradesValuesTest(){
        int[] expectedResult = {56, 90, 32, 70, 21, 34};
        assertArrayEquals(expectedResult, exercise1.roundedGrades(gradesValue));
    }

    @Test
    public void maxRoundedGradeExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise1.maxRoundedGrade(gradesException));
    }

    @Test
    public void maxRoundedGradeValueTest(){
        assertEquals(68, exercise1.maxRoundedGrade(gradesValue));
    }
}
