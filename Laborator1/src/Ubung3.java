import java.util.Arrays;

public class Ubung3 {
    public int[] addition(int[] array1, int[] array2){
        if (array1.length != array2.length) System.out.println("Cannot add the two elements because the " +
                "size of the two arrays are not identical");
        else{
            int[] sum = new int[array1.length + 1];

            boolean carry = false;
            for(int i = array1.length - 1; i >= 0; i--){
                int digitSum = array1[i] + array2[i] + (carry ? 1 : 0);

                if (digitSum > 9) {
                    sum[i + 1] = digitSum % 10;
                    carry = true;
                } else {
                    sum[i + 1] = digitSum;
                    carry = false;
                }
            }
            if (carry) sum[0] = 1;
            return carry ? sum : Arrays.copyOfRange(sum, 1, sum.length);
        }
        return null;
    }

}
