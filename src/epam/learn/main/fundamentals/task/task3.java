package epam.learn.main.fundamentals.task;

import java.util.concurrent.ThreadLocalRandom;

public class task3 {
    public static void main(String[] args) {
//        System.out.println("5 " + "\n12 " + "\n16");
//        System.out.println("5 " + "12 " + "16");

//        Random rand = new Random();
//        int bound = 20;
//        int random = rand.nextInt(bound);
//        int random1 = rand.nextInt(bound);
//        int random2 = rand.nextInt(bound);
//        int random3 = rand.nextInt(bound);
//        System.out.println(random);
//        System.out.println(random1);
//        System.out.print(random2);
//        System.out.print(" " + random3);

        String str = new String();

        for (int i = 0; i < 10; i++) {
            str += ThreadLocalRandom.current().nextInt(1, 20) + " ";
        }
        for (int i = 0; i < 10; i++) {
            str += "\n" + ThreadLocalRandom.current().nextInt(30, 50);
        }

        System.out.println(str);

//        int length = 16;
//        Random r = new Random();
//        String s = r.ints(48, 122)
//                .filter(i -> (i < 57 || i > 65) && (i < 90 || i > 97))
//                .mapToObj(i -> (char) i)
//                .limit(length)
//                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
//                .toString();
//        System.out.println(s);

//        Random myRandom = new Random();
//        String result = "";
//
//        for(int i = 0; i < 10; i++){
//            result += (myRandom.nextInt()) + "\n";
//        }
//        System.out.println(result);
    }
}