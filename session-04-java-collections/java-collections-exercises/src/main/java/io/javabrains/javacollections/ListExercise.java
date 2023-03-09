package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60));
        int sum =0;
        for (Integer integer : numberList) {
            sum += integer;
        }
        System.out.println(sum);

    }

}
