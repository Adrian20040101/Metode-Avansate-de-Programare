package Tests;

import Ubungen.Ubung3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

public class Ubung3Test {
    private Ubung3 ubung3;
    private int[] array1;
    private int[] array2;
    private int[] arrayException;
    private final int factor = -5;
    private final int factorException = 11;

    @Before
    public void setUp(){
        ubung3 = new Ubung3();
        array1 = new int[]{6, 4, 5, 1, 0, 0, 0, 5};
        array2 = new int[]{2, 7, 6, 9, 0, 2, 0, 9};
        arrayException = new int[]{};
    }

    @Test
    public void additionExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung3.addition(array1, arrayException));
    }

    @Test
    public void additionValueTest(){
        assertArrayEquals(new int[]{9, 2, 2, 0, 0, 2, 1, 4}, ubung3.addition(array1, array2));
    }

    @Test
    public void subtractionExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung3.subtraction(array1, arrayException));
    }

    @Test
    public void subtractionValueTest(){
        assertArrayEquals(new int[]{3, 6, 8, 1, 9, 7, 9, 6}, ubung3.subtraction(array1, array2));
    }

    @Test
    public void multiplicationExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung3.multiplication(array1, factorException));
        assertThrows(IllegalArgumentException.class, () -> ubung3.multiplication(arrayException, factor));
    }

    @Test
    public void multiplicationValueTest(){
        assertArrayEquals(new int[]{-1, 3, 8, 4, 5, 1, 0, 4, 5}, ubung3.multiplication(array2, factor));
    }

    @Test
    public void divisionExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung3.division(array1, factorException));
        assertThrows(IllegalArgumentException.class, () -> ubung3.division(arrayException, factor));
    }

    @Test
    public void divisionValueTest(){
        assertArrayEquals(new int[]{-1, 2, 9, 0, 2, 0, 0, 1}, ubung3.division(array1, factor));
    }
}
