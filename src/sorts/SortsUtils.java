package sorts;

import java.util.Arrays;

public class SortsUtils {

    public static int[] bubble(int[] arr) {
        
        int[] copy = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; (j < copy.length - 1); j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return copy;
    }

    public static void shake(int[] arr) {
        int left = 0;
        int right = (arr.length - 1);
        int control = right;

        while (left < right) {

            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    control = i;
                }
            }
            right = control;

            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    control = i;
                }
            }
            left = control;
        }
    }
}
