package arrays.task2_3;

public class ForOperation implements IArraysOperation {
    @Override
    public void allElemInCons(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Override
    public void everySecondElemInCons(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    @Override
    public void inverseInCons(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[arr.length - i - 1]);
        }
    }
}
