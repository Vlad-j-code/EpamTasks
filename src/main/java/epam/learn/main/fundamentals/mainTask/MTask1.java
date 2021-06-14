package epam.learn.main.fundamentals.mainTask;

import java.util.Scanner;

public class MTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
