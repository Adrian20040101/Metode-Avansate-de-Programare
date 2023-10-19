package Exercises;

import java.util.Arrays;

public class Exercise4 {
    public int cheapestKeyboard(int[] keyboardPrices){
        if (keyboardPrices.length == 0) throw new IllegalArgumentException();
        int minimum = Integer.MAX_VALUE;
        for (var price : keyboardPrices){
            if (price < minimum) minimum = price;
        }
        return minimum;
    }

    public int mostExpensiveItem(int[] usbCablePrices, int[] keyboardPrices){
        if (usbCablePrices.length == 0 || keyboardPrices.length == 0) throw new IllegalArgumentException();
        int maximum = Integer.MIN_VALUE;
        for (var price : usbCablePrices){
            if (price > maximum) maximum = price;
        }
        for (var price : keyboardPrices){
            if (price > maximum) maximum = price;
        }
        return maximum;
    }

    public int mostExpensiveUSBCable(int[] usbCablePrices, int budget){
        if (usbCablePrices.length == 0 || budget < 0) throw new IllegalArgumentException();
        int maximum = Integer.MIN_VALUE;
        for (var price : usbCablePrices){
            if (price > maximum && price < budget) maximum = price;
        }
        return maximum;
    }

    public int buyTwoItems(int[] usbCablePrices, int[] keyboardPrices, int budget) {
        if (usbCablePrices.length == 0 || keyboardPrices.length == 0) throw new IllegalArgumentException();
        Arrays.sort(usbCablePrices);
        Arrays.sort(keyboardPrices);

        int maxTotal = 0;

        if (keyboardPrices[0] > budget || usbCablePrices[0] > budget) return -1; //that means the customer is not able to buy both items

        //in this nested for loop block we calculate the two most expensive items that the customer can buy, prioritizing a more expensive keyboard if possible
        for (int i = keyboardPrices.length - 1; i >= 0; i--) {
            for (int j = usbCablePrices.length - 1; j >= 0; j--) {
                int total = keyboardPrices[i] + usbCablePrices[j];

                if (total <= budget && total > maxTotal) {
                    maxTotal = total;
                }
            }
        }
        if (maxTotal == 0) return -1;  //didn't afford both items
        return maxTotal;
    }
}
