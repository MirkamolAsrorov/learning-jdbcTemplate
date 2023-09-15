package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
        maps();
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("JAllol"), new Diamond("EUR diamond"));
        System.out.println(map.get(new Person("JAllol")));
        System.out.println(new Person("JAllol").hashCode());
        System.out.println(new Person("JAllol").hashCode());
    }

    record Diamond(String name) {
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Ali"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.containsKey(1));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.remove(3);
        //1
        map.entrySet().forEach(System.out::println);

        //2
        map.entrySet().forEach(x -> System.out.println(x.getKey() + "-" + x.getValue()));
        //3
        map.forEach((key, value) -> System.out.println(key + " " + value));


        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());
        System.out.println(map.keySet());
    }

    //    record Person(String name){}

    /**
     * When using class to map's key,
     * hash code and equal method should be overriden
     * to avoid null when it comes to get value
     * by using get method
     */
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
