package de.telran;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    List<String> names = new ArrayList<>();
	    names.add("Ivan");
        names.add("Maria");
        names.add("Piotr");
        names.add("Anna");
        names.add("Maria");
        names.add("Ivan");

        List<String> dedupedNames = removeDuplicates(names);
        System.out.println(dedupedNames);

        List<String> duplicateNames = getDuplicates(names);
        System.out.println(duplicateNames);
    }

    public static List<String> removeDuplicates(List<String> input) {
        Set<String> set = new HashSet<>();
        for (String string : input) {
            set.add(string);
        }
        return new ArrayList<>(set);
    }

    public static List<String> getDuplicates(List<String> input) {
        Set<String> setWithUniqueNames = new HashSet<>();
        Set<String> setWithDuplicateNames = new HashSet<>();
        for (String string : input) {
            if (!setWithUniqueNames.add(string)) {
                setWithDuplicateNames.add(string);
            }
        }
        return new ArrayList<>(setWithDuplicateNames);
    }
}
