package task28_2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println("Sum             : " + list.stream().mapToInt(x -> x).sum());
        System.out.println("Arithmetic mean : " + list.stream().mapToInt(x -> x).sum() / list.size());
        Set<Integer> duplicates = new HashSet<>(list);
        for (Integer integer : duplicates) {
            System.out.println(integer + " - " + list.stream().filter(integer::equals).toList().size() + " times");
        }
    }

}
