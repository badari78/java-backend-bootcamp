package io.javabrains.javacollections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:

1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

public class ListHomework1 {


    public static void main(String[] args) throws IOException {

        List<Integer> numberList = new ArrayList<>();

        while (true) {


            System.out.println("1. Add an element to the list");
            System.out.println("2. Remove an element from the list");
            System.out.println("3. Find the minimum element in the list");
            System.out.println("4. Find the maximum element in the list");
            System.out.println("5. Print the contents of the list");
            System.out.println("6. Quit the program");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int choice = Integer.parseInt(bufferedReader.readLine());

            if (choice == 1) {
                System.out.println("Enter a number to be added");
                int number = Integer.parseInt(bufferedReader.readLine());
                numberList.add(number);

            } else if (choice == 2){
                System.out.println("Enter a number to be removed");
                int number = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Number removed " + numberList.remove(Integer.valueOf(number)));

            } else if(choice == 3) {
                System.out.println(Collections.min(numberList));
            } else if (choice == 4) {
                System.out.println(Collections.max(numberList));
            } else if (choice == 5) {
                numberList.forEach(System.out::println);
            } else if (choice == 6){
                break;
            }
        }
    }

}
