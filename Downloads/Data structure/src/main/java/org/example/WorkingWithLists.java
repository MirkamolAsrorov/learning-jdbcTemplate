package org.example;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colorsUnmodifiable = List.of("blue", "yellow");
        System.out.println(colorsUnmodifiable);

        List<String> colors = new ArrayList<>();
        colors.add("yellow");
        colors.add("purple");
        colors.add("red");
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("flight"));
        System.out.println(colors.size());

        System.out.println("traditional for loop");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println("enhanced for loop");
        for (String color:
              colors) {
            System.out.println(color);
        }

        System.out.println("for each");
        colors.forEach(System.out::println);

        System.out.println(colors);
    }
}
