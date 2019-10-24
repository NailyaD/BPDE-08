package de.telran;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String text = "Медведь подошёл к большому дубу. Медведь засунул лапу в дупло. " +
                      "Медведь зачерпнул пригоршню мёда, а пчёлы, нехорошие такие пчёлы, начали кусать медведя! " +
                      "Медведь побежал к речке. ";

	    Set<String> setOfUnnecessaryWords = new HashSet<>();
	    setOfUnnecessaryWords.add("к");
        setOfUnnecessaryWords.add("в");
        setOfUnnecessaryWords.add("а");

        List<String> setOfNecessaryWords = isAppropriateSetOfNecessaryWords(text,setOfUnnecessaryWords);
        Map<String, Integer> frequencyOfWords = frequencyDictionaryConverter(setOfNecessaryWords);
        Map<String, Integer> theMostFrequentWord = isTheMostFrequentWord(frequencyOfWords);

	    System.out.println(theMostFrequentWord);
    }

    public static List<String> isAppropriateSetOfNecessaryWords (String text, Set<String> setOfUnnecessaryWords) {
        text = text.replaceAll("\\p{Punct}","");
        String[] array = text.toLowerCase().split(" ");
        List<String> setOfNecessaryWords = new ArrayList<>(Arrays.asList(array));
        setOfNecessaryWords.removeAll(setOfUnnecessaryWords);

        return setOfNecessaryWords;
    }

    public static Map<String, Integer> frequencyDictionaryConverter(List<String> setOfNecessaryWords) {
        Map<String, Integer> frequencyOfWords = new HashMap<>();
        for (String str : setOfNecessaryWords) {
            if (frequencyOfWords.containsKey(str)) {
                frequencyOfWords.put(str, 1 + frequencyOfWords.get(str));
            } else {
                frequencyOfWords.put(str, 1);
            }
        }

        return frequencyOfWords;
    }

    public static Map<String, Integer> isTheMostFrequentWord (Map<String, Integer> frequencyOfWords) {
        Map<String, Integer> theMostFrequentWord = new HashMap<>();
        int maxValueInMap = (Collections.max(frequencyOfWords.values()));
        for (Map.Entry<String, Integer> entry : frequencyOfWords.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                theMostFrequentWord.put(entry.getKey(), entry.getValue());
            }
        }

        return theMostFrequentWord;
    }
}
