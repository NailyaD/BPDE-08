package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(10);
        values.add(2);
        values.add(12);
        values.add(3);

        List<Integer> listOfNewValues = exceptValuesMoreThanGiven(values);
        System.out.println(listOfNewValues);
    }

    public static List<Integer> exceptValuesMoreThanGiven(List<Integer> values) {
        List<Integer> listOfNewValues = new ArrayList<>();
        for (Integer value : values) {
            if(value <= 5)
                listOfNewValues.add(value);
        }
        return listOfNewValues;
    }

}
