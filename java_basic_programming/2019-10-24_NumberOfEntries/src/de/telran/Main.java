package de.telran;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Maria");
        names.add("Anna");
        names.add("Piotr");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Maria");
        names.add("Piotr");
        names.add("Piotr");
        names.add("Maria");

        Map<String, Integer> map = countNames(names);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countNames(List<String> names) {
        HashMap<String, Integer> result = new HashMap<>();

        for (String str : names) {
            if (result.containsKey(str)) {
                result.put(str, 1 + result.get(str));
            } else {
                result.put(str, 1);
            }
        }
        return result;
    }
}
