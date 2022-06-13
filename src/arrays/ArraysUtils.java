package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ArraysUtils {
        public static int[] arrayFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the massive size");
        int[] massive = new int[Integer.parseInt(reader.readLine())];

        System.out.println("Enter the values of the array elements");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = Integer.parseInt(reader.readLine());
        }

        reader.close();
        return massive;
        }


        public static int[] arrayRandom(int size, int maxValueExclusion) {
            Random random = new Random();

            int[] massive = new int[size];

            for (int i = 0; i < massive.length; i++) {
                massive[i] = random.nextInt(100);
            }

            return massive;
        }
}
