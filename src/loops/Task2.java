package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
    public static void CycleFromSecondTask() throws IOException {
        System.out.println("Enter an integer");

        Scanner scanner = new Scanner(System.in);
        long usersInput = 0;

        if (scanner.hasNextLong()) {
            usersInput = scanner.nextLong();
            } else if (scanner.hasNextDouble()) {
                System.out.println("Введено не целое число");
                scanner.close();
            } else if (scanner.hasNextLine()) {
                System.out.println("Введено не число");
                scanner.close();
            } else {
                System.out.println("Что ты вообще ввёл?");
                scanner.close();
            }

        if (usersInput == 0) {
            return;
        }

        int[] massive = new int[String.valueOf(usersInput).length()];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (usersInput % 10);
            usersInput /= 10;
        }

        StringBuilder builder = new StringBuilder();
        long result = 1;
        for (int i = massive.length - 1; i >= 0; i--) {
            result = result * massive[i];
            builder.append(massive[i] + " * ");
        }

        System.out.println(builder.replace(builder.length() - 2, builder.length(), "= " + result));
    }
}
