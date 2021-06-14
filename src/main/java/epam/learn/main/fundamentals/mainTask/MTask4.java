package epam.learn.main.fundamentals.mainTask;

import java.util.Arrays;
import java.util.Scanner;

public class MTask4 {
    public static void main(String[] args) {
        String line = getLineFromConsole();
        String[] splitedLine = line.split(" ");


        System.out.println("Reversed array: " + Arrays.toString(splitedLine));
    }
    private static String getLineFromConsole() {
        System.out.println("Please, enter array");
        return new Scanner(System.in).nextLine();
    }
}
