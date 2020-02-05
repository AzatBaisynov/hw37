package list;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        ArrayList<Cat> list1 = new ArrayList<>();
        for(int i = 0; i < 1000000; i++){
            list1.add(new Cat(i));
        }

        LinkedList<Cat> list2 = new LinkedList<>();
        for(int i = 0; i < 1000000; i++){
            list2.add(new Cat(i));
        }

        for(int i = 500000; i < 500100; i++){
            list1.add(i, new Cat(i));
        }

        LocalDateTime b = LocalDateTime.now();

        for(int i = 500000; i < 500100; i++){
            list2.add(i, new Cat(i));
        }

        LocalDateTime c = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            list1.add(i, new Cat(i));
        }

        LocalDateTime d = LocalDateTime.now();

        for (int i = 0; i < 100; i++) {
            list2.addFirst(new Cat(i));

        }

        LocalDateTime e = LocalDateTime.now();

        for (int i = 1000200; i < 1000300; i++) {
            list1.add(i, new Cat(i));
        }

        LocalDateTime f = LocalDateTime.now();

        for (int i = 1000300; i < 1000400; i++){
            list2.addLast(new Cat(i));
        }

        LocalDateTime g = LocalDateTime.now();

        for (int i = 500200; i < 1000300; i++){
            list1.get(i);
            list2.get(i);
        }
        LocalDateTime h = LocalDateTime.now();

        for (int i = 1000200; i > 500200; i--) {
            list1.get(i);
            list2.get(i);
        }
        LocalDateTime i = LocalDateTime.now();

        list1.remove(500150);
        list1.remove(100300);

        LocalDateTime j = LocalDateTime.now();

        list2.remove(500150);
        list2.removeLast();

        LocalDateTime k = LocalDateTime.now();

        System.out.println("Statistics: \n" +
                "Array list result 1: \n" + a + "" +
                "\nLinked list result 1: \n" + b
        + "\nArray list result 2: \n" + c + "\nLinked list result 2:\n"
         + d + "\nArray list result 3:\n" + e + "\nLinked list result 3: \n" +
                f + "\nArray list result 4:\n" + g + "\nLinked list result 4:\n" + h +
                "\nArray list result 5:\n" + i + "\nLinked list result 5:\n" + j + "\n" + k);
    }
}
