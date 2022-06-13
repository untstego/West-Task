package arrays;

public class TaskCodeRu {
    public static void main(String[] args) {
    int[] kek = {1, 12, 123, 1234};
        System.out.println(summa(kek));
    }


    // возвращает сумму чётных положительных
    public static int sumEvenPositive(int[] massive) {
        int count = 0;
        for (int temp : massive) {
            if (temp % 2 == 0) {
                count += temp;
            }
        }
        return count;
    }


    // возвращает максимальный из чётных
    public static int maxEven(int[] massive) {
        int max = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0 && max < massive[i]) {
                max = massive[i];
            }
        }
        return max;
    }


    //элементы меньше среднего арифметического (выведу на экран каждый с новой строки)
    public static void lessArithmeticMean(int[] massive) {
        int arithmeticSum = 0;
        for (int temp : massive) {
            arithmeticSum += temp;
        }

        int arithmeticMean = arithmeticSum / massive.length;

        for (int temp : massive) {
            if (temp < arithmeticMean) {
                System.out.println(temp);
            }
        }

    }


    //два наименьших, выведу в консоль
    public static void twoMinimals(int[] massive) {
        int one = massive[0];
        int two = massive[0];

        int temp = 0;

        for (int i = 1; i < massive.length; i++) {
            if (one > massive[i]) {
                one = massive[i];
                temp = i;
            }
        }

        for (int i = 1; i < massive.length; i++) {
            if (i == temp) {
                continue;
            }
            if (two > massive[i]) {
                two = massive[i];
            }

        }
        System.out.printf("Minimal first = %d, minimal second = %d", one, two);
    }

    //возвращаю сжатый массив без элементов, находившихся в диапазоне
    public static int[] squeezeArray(int[] massive, int start, int end) {
        int temp = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] <= end && massive[i] >= start) {
                massive[i] = 0;
                temp++;
            }
        }

        int[] newMassive = new int[massive.length - temp];

        int temp2 = 0;

        for (int hek : massive) {
            if (hek == 0) {
                continue;
            } else {
                newMassive[temp2] = hek;
                temp2++;
            }
        }
        return newMassive;
    }


    // возвращает сумму цифр массива

    public static int summa(int[] massive) {
        int count = 0;
        for (int i = 0; i < massive.length; i++) {
            while (massive[i] != 0) {
                count += (massive[i] % 10);
                massive[i] = massive[i] / 10;
            }
        }
        return count;
    }

}
