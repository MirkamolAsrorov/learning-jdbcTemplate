
package org.example;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("A");
        dynamicArray.add("b");
        dynamicArray.add("c");
        dynamicArray.add("d");
        dynamicArray.add("e");
        dynamicArray.add("f");

        System.out.println("Before " + dynamicArray);
//        dynamicArray.insert(0,"0");
        dynamicArray.delete("A");
        dynamicArray.delete("b");
        dynamicArray.delete("c");
//        dynamicArray.search("d");
        System.out.println("Then " + dynamicArray);
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);

        dynamicArray.insert(3, "C");
        System.out.println("Final " + dynamicArray);

    }
}