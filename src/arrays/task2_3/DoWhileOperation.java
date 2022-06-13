package arrays.task2_3;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void allElemInCons(int[] arr) {
        int key = 0;
        do {
            System.out.println(arr[key]);
            key++;
        } while (key < arr.length);

    }

    @Override
    public void everySecondElemInCons(int[] arr) {
        int key = 0;
        do {
            if (key % 2 != 0) {
                System.out.println(arr[key]);
            }
            key++;
        } while (key < arr.length);
    }

    @Override
    public void inverseInCons(int[] arr) {
        int key = 0;
        do {
            System.out.println(arr[arr.length - key - 1]);
            key++;
        } while (key < arr.length);
    }
}
