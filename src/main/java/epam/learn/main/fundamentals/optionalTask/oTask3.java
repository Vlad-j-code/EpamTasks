package epam.learn.main.fundamentals.optionalTask;

import java.util.*;

public class oTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Input %d element: ", i);
            arr[i] = scan.nextLine();
        }
        double avg = 0;
        for (String s : arr) {
            avg += s.length();
        }
        if (arr.length > 0) avg /= arr.length;
        System.out.printf("Средняя длина введенных чисел: %.2f", avg);
        System.out.println("\nЧисла с длиной больше среднего:");
        for (String s : arr) {
            if (s.length() > avg) System.out.println(s + " Длина: " + s.length());
        }
        System.out.println("Числа с длиной меньше среднего:");
        for (String s : arr) {
            if (s.length() < avg) System.out.println(s + " Длина: " + s.length());
        }
    }
}
