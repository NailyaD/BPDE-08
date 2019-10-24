package de.telran;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        LinkedList<String> list2 = new LinkedList<>();

        list1.add("dd");
        list1.add("ee");
        list1.add("ff");
        list1.add("gg");

        list2.add("dd");
        list2.add("ff");
        list2.add("ee");
        list2.add("gg");

        System.out.println(isCycleVersion(list1, list2));

    }

    public static boolean isCycleVersion(LinkedList<String> list1, LinkedList<String> list2) {
        boolean isCycle = false;
        if (list1.containsAll(list2) && list1.size() == list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                String s = list1.peekLast();
                list1.addFirst(s);
                list1.removeLast();
                if (list1.equals(list2)) {
                    isCycle = true;
                    break;
                } else {
                    isCycle = false;
                }
            }
        }

        return isCycle;
    }
}
