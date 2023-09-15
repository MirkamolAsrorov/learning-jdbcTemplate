package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.remove(new Ball("red"));
        System.out.println(balls.size());

        balls.forEach(System.out::println);
    }

    //    record Ball(String color){}
    static class Ball {
        String name;

        public Ball(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Ball ball)) return false;
            return Objects.equals(name, ball.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
