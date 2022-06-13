package sorts;

/*4.2. Создать класс SortsMain. Все проверки пишутся в main.
        4.2.1. После каждого теста в консоль вы должны распечатать сообщение формата
        "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
        Для преобразования массива в текст можно использовать класс Arrays.

        4.2.2. Для тестов используем предварительно созданные массивы:
        4.2.2.1. new int[]{1,2,3,4,5,6}
        4.2.2.2. new int[]{1,1,1,1}
        4.2.2.3. new int[]{9,1,5,99,9,9}
        4.2.2.4. new int[]{}
        4.2.2.5. new int[]{6,5,4,3,2,1}
        4.2.2 После предварительных тестов пишем тест с рандомным заполнением массива.
        Вызывая ранее созданный метод arrayRandom (ArraysUtils.arrayRandom(50, 100)) получить массив. Отсортировать.
        4.2.3 После теста с рандомно заполненным массивом пишем тест с массивом полученным через консоль.
        Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив. Отсортировать.*/

import arrays.ArraysUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

class SortsMain {
    public static void main(String[] args) throws IOException {

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 1, 1, 1};
        int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] arr4 = new int[]{};
        int[] arr5 = new int[]{6, 5, 4, 3, 2, 1};
        int[] arr6 = ArraysUtils.arrayRandom(50, 100);
        int[] arr7 = ArraysUtils.arrayFromConsole();


        int[] sortedBubble1 = SortsUtils.bubble(arr1);
        printResult(arr1, SortsUtils.bubble(arr1));

        int[] sortedBubble2 = SortsUtils.bubble(arr2);
        printResult(arr2, sortedBubble2);

        int[] sortedBubble3 = SortsUtils.bubble(arr3);
        printResult(arr3, sortedBubble3);

        int[] sortedBubble4 = SortsUtils.bubble(arr4);
        printResult(arr4, sortedBubble4);

        int[] sortedBubble5 = SortsUtils.bubble(arr5);
        printResult(arr5, sortedBubble5);

        int[] sortedBubble6 = SortsUtils.bubble(arr6);
        printResult(arr6, sortedBubble6);

        int[] sortedBubble7 = SortsUtils.bubble(arr7);
        printResult(arr7, sortedBubble7);
    }



    public static void printResult(int[] arrBefore, int[] arrAfter) {
        System.out.println(Arrays.toString(arrBefore) + " -> " + Arrays.toString(arrAfter));
    }
}
