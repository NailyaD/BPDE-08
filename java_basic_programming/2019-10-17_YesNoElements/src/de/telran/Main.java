package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<Integer> list1 = new ArrayList<>();
	    List<Integer> list2 = new ArrayList<>();

	    list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(8);

        List<String> yesNoList = getYesNo(list1, list2);
        System.out.println(yesNoList);
    }

    public static List<String> getYesNo (List<Integer> list1, List<Integer> list2) {
        List<String> yesNoList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i))) {
                yesNoList.add("Yes");
            } else {
                yesNoList.add("No");
            }
        }
        return yesNoList;
    }

}
