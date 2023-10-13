package Tests;

import Exercises.Exercise3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class Exercise3Test {
    private Exercise3 exercise3;
    private int[] array1;
    private int[] array2;
    private int[] arrayException;
    private final int factor = -5;
    private final int factorException = 11;

    @Before
    public void setUp(){
        exercise3 = new Exercise3();
        array1 = new int[]{6, 4, 5, 1, 0, 0, 0, 5};
        array2 = new int[]{2, 7, 6, 9, 0, 2, 0, 9};
        arrayException = new int[]{};
    }

    @Test
    public void additionExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise3.addition(array1, arrayException));
    }

    @Test
    public void additionValueTest(){
        assertArrayEquals(new int[]{9, 2, 2, 0, 0, 2, 1, 4}, exercise3.addition(array1, array2));
    }

    @Test
    public void subtractionExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise3.subtraction(array1, arrayException));
    }

    @Test
    public void subtractionValueTest(){
        assertArrayEquals(new int[]{3, 6, 8, 1, 9, 7, 9, 6}, exercise3.subtraction(array1, array2));
    }

    @Test
    public void multiplicationExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise3.multiplication(array1, factorException));
        assertThrows(IllegalArgumentException.class, () -> exercise3.multiplication(arrayException, factor));
    }

    @Test
    public void multiplicationValueTest(){
        assertArrayEquals(new int[]{-1, 3, 8, 4, 5, 1, 0, 4, 5}, exercise3.multiplication(array2, factor));
    }

    @Test
    public void divisionExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise3.division(array1, factorException));
        assertThrows(IllegalArgumentException.class, () -> exercise3.division(arrayException, factor));
    }

    @Test
    public void divisionValueTest(){
        assertArrayEquals(new int[]{-1, 2, 9, 0, 2, 0, 0, 1}, exercise3.division(array1, factor));
    }
}
