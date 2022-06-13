package arrays.task2_3;

public class ForEachOperation implements IArraysOperation {

    @Override
    public void allElemInCons(int[] arr) {
        for (int temp : arr) {
            System.out.println(temp);
        }
    }

    @Override
    public void everySecondElemInCons(int[] arr) {
        int key = 0;
        for (int temp : arr) {
            if (key % 2 != 0) {
                System.out.println(temp);
            }
            key++;
        }
    }

    @Override
    public void inverseInCons(int[] arr) {
        String result = "";
        for (int temp : arr) {
            result = temp + "\r \n" + result;
        }
        System.out.println(result);
    }
}
