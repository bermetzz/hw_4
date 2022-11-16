import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter 5 names:");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
             String names = scanner.next();
             list.add(names);
        }
        System.out.println("First list: " + list);

        System.out.println("Please enter 5 more names:");
        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String names = scanner.next();
            list1.add(names);
        }
        System.out.println("Second list: " + list1);

        Collections.reverse(list1);
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list.get(i));
            list2.add(list1.get(i));

        }
        System.out.println("Third list: " + list2);
        list2.sort(Comparator.comparingInt(String::length));
        System.out.println(list2);
    }
}
