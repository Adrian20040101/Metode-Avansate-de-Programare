package Ubungen;

import java.util.Arrays;

public class Ubung4 {
    public int cheapestKeyboard(int[] keyboardPrices){
        int minimum = Integer.MAX_VALUE;
        for (var price : keyboardPrices){
            if (price < minimum) minimum = price;
        }
        return minimum;
    }

    public int mostExpensiveItem(int[] usbCablePrices, int[] keyboardPrices){
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
        int maximum = Integer.MIN_VALUE;
        for (var price : usbCablePrices){
            if (price > maximum && price < budget) maximum = price;
        }
        return maximum;
    }

    public int buyTwoItems(int[] usbCablePrices, int[] keyboardPrices, int budget) {
        Arrays.sort(usbCablePrices);
        Arrays.sort(keyboardPrices);

        int maxTotal = 0;

        if (keyboardPrices[0] > budget || usbCablePrices[0] > budget) return -1; //that means he is not able to buy both items

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
