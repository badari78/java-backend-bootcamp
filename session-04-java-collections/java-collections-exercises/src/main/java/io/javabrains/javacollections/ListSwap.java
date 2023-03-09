package io.javabrains.javacollections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.*;

public class ListSwap {

    public static void main(String[] args) {
        String array[] = {"a", "b", "c", "d"};
        List<Object> list = Arrays.asList(array);
        listSwap(list, 2,3);

        Integer num[] = {10,20,30,40,50};
        List<Object> numList = Arrays.asList(num);
        listSwap(numList, 2,3);
    }

    public static void listSwap(List<Object> list, int postion1, int postion2) {
        List<Object> arrayList = new ArrayList<>(list);
        Object value1 = list.get(postion1);
        Object value2 = list.get(postion2);
        Collections.swap(arrayList, postion1, postion2);
        System.out.println(arrayList);
    }
}
