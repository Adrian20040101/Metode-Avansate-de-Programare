package Tests;

import Ubungen.Ubung2;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Ubung2Test {
    private Ubung2 ubung2;
    private int[] arrayValues;
    private int[] arrayException;

    @Before
    public void setUp(){
        ubung2 = new Ubung2();
        arrayValues = new int[]{12, 34, 21, 46, 864, 313, 54, 32, 11, 6, 85};
        arrayException = new int[]{};
    }

    @Test
    public void maximumValueExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung2.maximum(arrayException));
    }

    @Test
    public void maximumValueTest(){
        assertEquals(864, ubung2.maximum(arrayValues));
    }

    @Test
    public void minimumValueExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung2.minimum(arrayException));
    }

    @Test
    public void minimumValueTest(){
        assertEquals(6, ubung2.minimum(arrayValues));
    }

    @Test
    public void maxSumExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung2.maxSum(arrayException));
    }

    @Test
    public void maxSumValueTest(){
        assertEquals(1472, ubung2.maxSum(arrayValues));
    }

    @Test
    public void minSumExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> ubung2.minSum(arrayException));
    }

    @Test
    public void minSumValueTest(){
        assertEquals(614, ubung2.minSum(arrayValues));
    }
}
