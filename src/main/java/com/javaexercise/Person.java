package com.javaexercise;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public record Person(String name, int age) {

    public static List<Person> filterAdults(List<Person> people, Predicate<Person> predicate) {
        return people.stream()
                .filter(predicate)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Mark", 32),
                new Person("Tim", 17),
                new Person("Kate", 40)
        );

        List<Person> adults = filterAdults(people, person -> person.age() >= 18);
        adults.forEach(person -> System.out.println(person.name()));
    }
}
