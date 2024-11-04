package com.javaexercise;

import java.util.List;

public class Wildcards {
     public static double sumOfList(List<? extends Number> list) {
            double sum = 0;
            for (Number number : list) {
                sum += number.doubleValue();
            }
            return sum;
     }

        public static void main(String[] args) {
            List<Integer> intList = List.of(1, 2, 3);
            System.out.println("Sum of Integers: " + sumOfList(intList));

            List<Double> doubleList = List.of(1.5, 2.5, 3.5);
            System.out.println("Sum of Doubles: " + sumOfList(doubleList));
        }
}
