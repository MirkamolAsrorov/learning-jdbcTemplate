package org.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueus {
    public static void main(String[] args) {
    LinkedList<Person> linkedList = new LinkedList<>();
    linkedList.add(new Person("Alex", 22));
    linkedList.add(new Person("Alexa", 22));
    linkedList.addFirst(new Person("Ali", 22));

        ListIterator<Person> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Amali", 12));
        supermarket.add(new Person("Ali", 100));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
    }

    record Person(String name, int age){}
}
