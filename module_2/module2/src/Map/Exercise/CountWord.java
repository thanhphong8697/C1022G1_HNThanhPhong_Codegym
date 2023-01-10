package Map.Exercise;

import java.security.Key;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String string = scanner.nextLine().toLowerCase();
        String array[] = string.split(" ");
        for (String element : array) {
            if (treeMap.containsKey(element)) {
                int value = treeMap.get(element);
                value++;
                treeMap.replace(element, value);
            } else {
                treeMap.put(element, 1);
            }
        }
        System.out.println("Số lần xuất hiện các từ là" + treeMap.toString());
    }
}

