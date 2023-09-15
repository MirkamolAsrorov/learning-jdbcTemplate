package org.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors =  new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};

        //1
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //2
        for (String color:
             colors) {
            System.out.println(color);
        }

        //3
        Arrays.stream(colors).forEach(System.out::println);

    }
}
