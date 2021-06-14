package epam.learn.main.collections.optionalTask;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(new File("data/input.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNext()){
            list.add(s.next());
        }
        s.close();
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
