package com.javaexercise;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class StreamsExercise1 {

    public static void main(String[] args){

//        Exercise 1- Squaring numbers
        long StartTime= System.currentTimeMillis();
        int SumOfSquaresSequential = IntStream.rangeClosed(1, 1000000000).sequential().map(n-> n*n).sum();
        long EndTime = System.currentTimeMillis();

        System.out.println("Sequential Sum of Squares: " +SumOfSquaresSequential);
        System.out.println("Sequential Execution Time: " +(EndTime-StartTime)+ "ms");

        long StartTimeParallel = System.currentTimeMillis();
        int SumOfSquaresParallel = IntStream.rangeClosed(1, 1000000000).parallel().map(n->n*n).sum();
        long EndTimeParallel = System.currentTimeMillis();

        System.out.println("Parallel Sum of Squares: " +SumOfSquaresParallel);
        System.out.println("Parallel Execution Time: " +(EndTimeParallel -StartTimeParallel) +"ms");

//        Exercise 2- Sorting numbers
        List<Integer> randomNumbers = new Random().ints(1_000_000, 0, 1_000_000)
                .boxed()
                .toList();

        List<Integer> sortedNumbers = randomNumbers.parallelStream()
                .sorted()
                .toList();

        boolean isSorted = IntStream.range(0, sortedNumbers.size() - 1)
                .allMatch(i -> sortedNumbers.get(i) <= sortedNumbers.get(i + 1));
        System.out.println("Is sorted: " + isSorted);

//      Exercise 3-  Thread-Safe Accumulator with AtomicInteger
        AtomicInteger sum = new AtomicInteger();

        IntStream.rangeClosed(1, 1000000).parallel().forEach(sum::addAndGet);
        System.out.println("Sum using atomic integer: " +sum.get());

//        Exercise 4- Even numbers
        List<Integer> evenNumbers = new CopyOnWriteArrayList<>();

        IntStream.rangeClosed(1, 100000000).parallel().filter(n->n%2==0).forEach(evenNumbers::add);
        System.out.println("Number of Even numbers: " +evenNumbers.size());
        System.out.println("All Even? " +evenNumbers.stream().allMatch(n->n%2==0));

    }
}
