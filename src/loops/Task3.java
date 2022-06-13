package loops;

/*1.3. Возведение в степень. Через консоль пользователь вводит два числа.
Первое число это число которое мы будем возводить,
Второе число это степень в которую возводят первое число.
Степень - только положительная и целая.
Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
        1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
        1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Task3 {
    public static void exponentiation() throws IOException {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();


        System.out.println("Enter a degree");
        int degree = 0;
        if (scanner.hasNextInt()) {
            degree = scanner.nextInt();
        }

        if (degree <= 0) {
                System.out.println("Try again, the degree must be an integer and positive");
                return;
        }

        double result = 1;
        for (int i = 1; i <= degree; i++) {
            result *= num;
        }
        System.out.printf("%f ^ %d = %f", num, degree, result);

    }
}
