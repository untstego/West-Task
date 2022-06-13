package loops;

public class Task4 {
    public static void multiplyLongPositive(long b) {
        long a = 1;
        long result = a;
        long temp = a;

        while(true) {
            temp = result;
            result *= b;
            if (result < 0) {
                System.out.println("Overflow!");
                System.out.printf("Result before overflow: %d, result after overflow: %d \n \n", temp, result);
                break;
            }
        }
    }

    public static void multiplyLongNegative(long b) {
        long a = 1;
        long result = a * b;
        long temp = 1;

        while(true) {
            temp = result;
            result *= b;
            if ((result > 0 && temp > 0) || (result < 0 && temp < 0)) {
                System.out.println("Overflow!");
                System.out.printf("Result before overflow: %d, result after overflow: %d \n \n ", temp, result);
                break;
            }
        }

    }
}
