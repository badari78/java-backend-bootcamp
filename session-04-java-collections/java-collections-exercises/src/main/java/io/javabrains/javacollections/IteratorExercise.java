package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {
    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruitCollection = fruitSupplier.getFruits();
        for (String s : fruitCollection) {
            System.out.println(s);
        }
    }
}


class FruitSupplier {
    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}