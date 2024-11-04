package com.javaexercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class LambdaPractice {

//Exercise- 1 Create a list of strings and sort it in descending order using a lambda expression.
    public static void sorting() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println(names);
    };

//Exercise- 2 Given a list of integers, use a lambda to filter out the even numbers and print only the odd numbers.
    public static void filtering(){
       List<Integer>  age = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       age.stream().filter(n-> n%2==1).forEach(System.out::println);
    }
//Exercise- 3 Using a list of words, use a lambda expression with map to convert each word to uppercase and collect the results into a new list.
    public static void map(){
        List<String> words = Arrays.asList("apple", "banana", "cherry", "Kiwi");
        List<String> results= words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(results);
    }
//Exercise- 4 Given a list of integers, filter out the numbers less than 5, double the remaining values, and collect them into a new list.
    public static void FilterAndMap(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> results = numbers.stream().filter(n-> n>=5).map(n-> n*2).toList();
        System.out.println(results);

    }
//Exercise 5: Implement a Functional Interface and Reverse a string, Convert it to lowercase and Check if it starts with a particular letter
    public static void LambdaString(){
        StringOperations reverse = input -> new StringBuilder(input).reverse().toString();
        System.out.println(reverse.apply("hello"));

        StringOperations lowercase = String::toLowerCase;
        System.out.println(lowercase.apply("HELLO"));

        StringOperations StartsWith = input -> input.startsWith("H")? "Starts with H" : "Doesn't start with H";
        System.out.println(StartsWith.apply("Hello"));
    }

//Exercise 6: Chain Lambdas Using andThen. Create two lambdas for processing integers: One that doubles the integer, Another that adds 5.
    public static void Chain(){
        Function<Integer, Integer> DoubleIt = n -> n * 2;
        Function<Integer, Integer> Add5 = n -> n+5;
        Function<Integer, Integer> Combined = (DoubleIt.andThen(Add5));
        System.out.println(Combined.apply(4));
    }

//Exercise 7: Using Predicate with Lambdas. Create a Predicate lambda expression to check if a string starts with "J".
    public static void Predicate(){
        List<String> names= Arrays.asList("james", "kris","jack","matt", "john", "will");
        Predicate<String> StartsWithJ= n -> n.startsWith("j");
        List<String> result = names.stream().filter(StartsWithJ).toList();
        System.out.println("name starts with: " +result);
    }


    public static void main(String[]args){
        sorting();
        filtering();
        map();
        FilterAndMap();
        LambdaString();
        Chain();
        Predicate();
    }


}

