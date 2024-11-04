package com.javaexercise;


import java.util.Arrays;

public class GenericSorter {
    public static <T extends Comparable<T>> void sortArray(T[] array){
        Arrays.sort(array);
    }

    public static void main(String[]args){
        Integer[] IntArray = {9, 5, 10, 7, 2, 4, 6, 1, 8, 3};
        sortArray(IntArray);
        System.out.println("Sorted Array is: " + Arrays.toString(IntArray));

        String[] StringArray = {"orange", "watermelon", "apple", "mango", "banana", "kiwi", "cherry"};
        sortArray(StringArray);
        System.out.println("Sorter Array is: " + Arrays.toString(StringArray));
    }
}
