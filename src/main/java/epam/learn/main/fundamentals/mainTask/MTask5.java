package epam.learn.main.fundamentals.mainTask;

import java.util.Scanner;

public class MTask5 {
    public static void main(String[] args) {
        System.out.println("Enter the month number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(number(num));
    }
    public static String number(int n) {
        String []month = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        if (n > 0 && n < month.length) return month[n];
        return "Incorrect number";
    }
}
