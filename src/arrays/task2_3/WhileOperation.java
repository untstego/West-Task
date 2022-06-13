package arrays.task2_3;

public class WhileOperation implements IArraysOperation {

    @Override
    public void allElemInCons(int[] arr) {
        int key = 0;
        while (key < arr.length) {
            System.out.println(arr[key]);
            key++;
        }

    }

    @Override
    public void everySecondElemInCons(int[] arr) {
        int key = 0;
        while (key < arr.length) {
            if (key % 2 != 0) {
                System.out.println(arr[key]);
            }
            key++;

        }
    }

    @Override
    public void inverseInCons(int[] arr) {
            int key = 0;
            while (key < arr.length) {
                System.out.println(arr[arr.length - key - 1]);
                key++;
            }
        }

    }

