package com.javaexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumbersOptional {

    public static Optional<Integer> findFirstEvenNumber(List<Integer> number){
        return number.stream().filter(n-> n%2 == 0).findFirst();
    }

    public static void main(String[]args){
        List<Integer> numbersWithEven = Arrays.asList(1, 2, 3, 4, 5, 7);
        List<Integer> numbersWithoutEven = List.of(1, 3, 5, 7);

        findFirstEvenNumber(numbersWithEven).ifPresentOrElse(
                num-> System.out.println("First Even number present "),
                ()-> System.out.println("even numbers not present ")
        );
        findFirstEvenNumber(numbersWithoutEven).ifPresentOrElse(
                num -> System.out.println("First Even number present"),
                ()-> System.out.println("even numbers not present ")
        );

    }
}
