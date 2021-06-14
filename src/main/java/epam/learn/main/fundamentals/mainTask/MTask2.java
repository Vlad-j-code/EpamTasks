package epam.learn.main.fundamentals.mainTask;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MTask2 {
    public static void main(String[] args) {
//        String str = "Hello, ";
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter name: ");
//        String name = in.nextLine();
//        String reverse = new StringBuffer(str+name).reverse().toString();
//        System.out.println(str+name);
//        System.out.println(reverse);

        String line = getLineFromConsole();
        String[] splitedLine = line.split(" ");
        Collections.reverse(Arrays.asList(splitedLine));

        System.out.println("Reversed array: " + Arrays.toString(splitedLine));
    }
    private static String getLineFromConsole() {
        System.out.println("Please, enter array");
        return new Scanner(System.in).nextLine();

//        Collections.reverse(Arrays.asList(args));
//        System.out.println("Reversed array: " + Arrays.toString(args));
    }
}
