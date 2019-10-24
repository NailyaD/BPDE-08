package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> reversedList = reverseList(list);
        System.out.println(reversedList);

        List<Integer> newList = new ArrayList<>();
        newList.addAll(list);
        newList.addAll(reversedList);
        System.out.println(newList);

    }

    public static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
