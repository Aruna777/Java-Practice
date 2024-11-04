package com.javaexercise;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class CustomThreadPool {
    public static void main(String[] args) throws Exception{
        ForkJoinPool customThreadPool = new ForkJoinPool(4);
        List<Integer> randomNumbers = new Random().ints(1_000_000, 0, 1000000)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> evenNumbers = customThreadPool.submit(() ->
                randomNumbers.parallelStream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList())
        ).get();
        System.out.println("Number of even numbers: " + evenNumbers.size());
    }
}
