package task28_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(new Random().nextInt(1,100));
        }
        System.out.println(integerList);
        Optional<Integer> max = integerList.stream().filter(x -> x % 2 == 0).
                map(x -> x * x).max(Comparator.comparingInt(y -> y));
        System.out.println("\nBiggest number of squares of even numbers in array: " + max.stream().toList());
    }
}