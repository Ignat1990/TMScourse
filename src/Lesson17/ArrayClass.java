package Lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ArrayClass {
    public static void main(String[] args) {

        List<Integer> littleInt = new ArrayList<>();


        littleInt.add(0, 2);
        littleInt.add(1, 0);
        littleInt.add(2, 4);
        littleInt.add(3, 5);
        littleInt.add(4, 6);
        littleInt.add(5, 7);
        littleInt.add(6, 2);
        littleInt.add(7, 9);
        System.out.println(littleInt);
        List<Integer> filterListInteger = littleInt
                .stream().distinct()
                .collect(Collectors.toList());
        System.out.println(filterListInteger);


        System.out.println(filterListInteger.stream()
                .filter(number -> number > 7 && number <= 17 && number % 2 == 0).collect(Collectors.toList()));
        System.out.println(filterListInteger.stream().map(i -> i * 2).collect(Collectors.toList()));







    }
}
