package com.colucy;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================================");


    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println(newCity);

            }
        }

    }
}
