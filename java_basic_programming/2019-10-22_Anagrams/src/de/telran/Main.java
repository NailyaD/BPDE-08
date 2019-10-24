package de.telran;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<String> anagrams = new ArrayList<>();
	    anagrams.add("anna");
        anagrams.add("nana");
        anagrams.add("naan");
        anagrams.add("aann");
        anagrams.add("nnaa");
        anagrams.add("piotr");
        anagrams.add("ivan");
        anagrams.add("vani");
        anagrams.add("inav");
        anagrams.add("navi");
        anagrams.add("vian");
        anagrams.add("niav");
        anagrams.add("vina");
        anagrams.add("naiv");
        anagrams.add("niva");

        List<String> setWithAnagramsFromDictionary = isAnagram(anagrams,"navi");
        System.out.println(setWithAnagramsFromDictionary);


    }
    public static List<String> isAnagram (List<String> anagrams, String word) {
        List<String> setWithAnagramsFromDictionary = new ArrayList<>();
        Map<String, String> mapWIthAnagrams = new HashMap<>();
        for (int i = 0; i < anagrams.size(); i++) {
            char[] c = anagrams.get(i).toCharArray();
            Arrays.sort(c);
            mapWIthAnagrams.put(anagrams.get(i), Arrays.toString(c));
        }

        Map<String, ArrayList<String>> reverseMap = new HashMap<>();

        for (Map.Entry<String,String> entry : mapWIthAnagrams.entrySet()) {
            if (!(reverseMap.containsKey(entry.getValue()))) {
                reverseMap.put(entry.getValue(), new ArrayList<>());
            }
            ArrayList<String> keys = reverseMap.get(entry.getValue());
            keys.add(entry.getKey());
            reverseMap.put(entry.getValue(), keys);
        }
        for (Map.Entry<String, ArrayList<String>> entry : reverseMap.entrySet()) {
            char[] w = word.toCharArray();
            Arrays.sort(w);
            if(entry.getKey().equals(Arrays.toString(w))) {
                setWithAnagramsFromDictionary = entry.getValue();
            }
        }
        return setWithAnagramsFromDictionary;
    }
}
