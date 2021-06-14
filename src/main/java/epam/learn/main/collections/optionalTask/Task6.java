package epam.learn.main.collections.optionalTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("data/input.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
