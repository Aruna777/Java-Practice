package com.javaexercise;

public class PairGeneric <T, U>{
    private final T first;
    private final U second;

    public PairGeneric(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[]args){
        PairGeneric<String, Integer> check1 = new PairGeneric<>("Hello", 3);
        System.out.println("The Result of first is " + check1.getFirst() +" and Result of Second is " + check1.getSecond());

        PairGeneric<Integer, Double> check2 = new PairGeneric<>(2, 3.2);
        System.out.println("The result of first is " +check2.getFirst() + " and the result of second is " + check2.getSecond());
    }
}
