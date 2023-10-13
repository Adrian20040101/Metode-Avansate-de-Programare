package Tests;

import Exercises.Exercise2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Exercise2Test {
    private Exercise2 exercise2;
    private int[] arrayValues;
    private int[] arrayException;

    @Before
    public void setUp(){
        exercise2 = new Exercise2();
        arrayValues = new int[]{12, 34, 21, 46, 864, 313, 54, 32, 11, 6, 85};
        arrayException = new int[]{};
    }

    @Test
    public void maximumValueExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise2.maximum(arrayException));
    }

    @Test
    public void maximumValueTest(){
        assertEquals(864, exercise2.maximum(arrayValues));
    }

    @Test
    public void minimumValueExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise2.minimum(arrayException));
    }

    @Test
    public void minimumValueTest(){
        assertEquals(6, exercise2.minimum(arrayValues));
    }

    @Test
    public void maxSumExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise2.maxSum(arrayException));
    }

    @Test
    public void maxSumValueTest(){
        assertEquals(1472, exercise2.maxSum(arrayValues));
    }

    @Test
    public void minSumExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise2.minSum(arrayException));
    }

    @Test
    public void minSumValueTest(){
        assertEquals(614, exercise2.minSum(arrayValues));
    }
}
