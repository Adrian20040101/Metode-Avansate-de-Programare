package Tests;

import Exercises.Exercise4;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Exercise4Test {
    private Exercise4 exercise4;
    private int[] keyboardPrices;
    private int[] usbCablePrices;
    private int[] arrayException;
    private final int budget = 41;
    private final int budgetException = -2;

    @Before
    public void setUp(){
        exercise4 = new Exercise4();
        keyboardPrices = new int[]{30, 25, 45, 75, 100, 60};
        usbCablePrices = new int[]{15, 20, 18, 37, 50, 12};
        arrayException = new int[]{};
    }

    @Test
    public void cheapestKeyboardExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise4.cheapestKeyboard(arrayException));
    }

    @Test
    public void cheapestKeyboardValueTest(){
        assertEquals(25, exercise4.cheapestKeyboard(keyboardPrices));
    }

    @Test
    public void mostExpensiveItemExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise4.mostExpensiveItem(arrayException, keyboardPrices));
        assertThrows(IllegalArgumentException.class, () -> exercise4.mostExpensiveItem(usbCablePrices, arrayException));
    }

    @Test
    public void mostExpensiveItemValueTest(){
        assertEquals(100, exercise4.mostExpensiveItem(usbCablePrices, keyboardPrices));
    }

    @Test
    public void mostExpensiveUsbCableExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise4.mostExpensiveUSBCable(arrayException, budget));
        assertThrows(IllegalArgumentException.class, () -> exercise4.mostExpensiveUSBCable(usbCablePrices, budgetException));
    }

    @Test
    public void mostExpensiveUsbCableValueTest(){
        assertEquals(37, exercise4.mostExpensiveUSBCable(usbCablePrices, budget));
    }

    @Test
    public void buyTwoItemsExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> exercise4.buyTwoItems(arrayException, keyboardPrices, budget));
        assertThrows(IllegalArgumentException.class, () -> exercise4.buyTwoItems(usbCablePrices, arrayException, budget));
    }

    @Test
    public void buyTwoItemsValueTest(){
        assertEquals(40, exercise4.buyTwoItems(usbCablePrices, keyboardPrices, budget));
    }
}
