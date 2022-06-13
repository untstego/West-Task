package arrays;

	/*2.2 Создать класс ArraysIteration. В этом клссе написать перебор
	массива при помощи do....while, while, for, foreach.
	Вызывая ранее созданный метод arrayFromConsole (ArraysUtils.arrayFromConsole()) получить массив.
	Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода:
            2.2.1. Вывести все элементы в консоль.
            2.2.2. Вывести каждый второй элемент массива в консоль.
            2.2.3. Вывести все элементы массива в консоль в обратном порядке.*/

import java.io.IOException;

public class ArraysIteration {

    //2.2.1. Вывести все элементы в консоль
    public static void allElemInCons(int[] arr) {
        int key = 0;
        while (key < arr.length) {
            System.out.println(arr[key]);
            key++;
        }

        key = 0;
        do {
            System.out.println(arr[key]);
            key++;
        } while (key < arr.length);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        for (int temp : arr) {
            System.out.println(temp);
        }
    }



    //2.2.2. Вывести каждый второй элемент массива в консоль.
    public static void everySecondInCons(int[] arr) {
        int key = 0;
        while (key < arr.length) {
            if (key % 2 != 0) {
                System.out.println(arr[key]);
            }
            key++;
        }

        key = 0;
        do {
            if (key % 2 != 0) {
                System.out.println(arr[key]);
            }
            key++;
        } while (key < arr.length);


        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        key = 0;
        for (int temp : arr) {
            if (key % 2 != 0) {
                System.out.println(temp);
            }
            key++;
        }
    }


    //2.2.3. Вывести все элементы массива в консоль в обратном порядке.

    public static void inverseInCons(int[] arr) {
        int key = 0;
        while (key < arr.length) {
            System.out.println(arr[arr.length - key - 1]);
            key++;
        }

        key = 0;
        do {
            System.out.println(arr[arr.length - key - 1]);
            key++;
        } while (key < arr.length);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - i - 1]);
        }

        //вариант номер 1, с копированием массива
        int[] copy = new int[arr.length];
        int i = 1;
        for (int temp : arr) {
            copy[copy.length - i] = temp;
            i++;
        }
        for (int temp : copy) {
            System.out.println(temp);
        }

        //вариант номер 2, без нового массива
        String result = "";
        for (int temp : arr) {
            result = temp + "\r \n" + result;
        }
        System.out.println(result);
    }



}
