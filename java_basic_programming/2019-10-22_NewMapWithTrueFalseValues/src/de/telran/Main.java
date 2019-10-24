package de.telran;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] letters = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> newMap = mapWithTrueFalseValues(letters);
        System.out.println(newMap);

    }
    public static Map<String, Boolean> mapWithTrueFalseValues(String[] letters) {
        Map<String, Boolean> newMap = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            for (int j = i + 1; j < letters.length; j++) {
                if (letters[i].equals(letters[j])) {
                    newMap.put(letters[i], true);
                    break;
                }
            }
        }
        ArrayList<String> newList = new ArrayList<>(Arrays.asList(letters));
        for (int i = 0; i < newList.size(); i++) {
            if (!(newMap.containsKey(newList.get(i)))) {
                newMap.put(newList.get(i), false);
            }
        }
        return newMap;
    }
}
