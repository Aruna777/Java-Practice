package com.javaexercise;

import java.util.*;

public class CollectionsExercise {

    public static void main(String[]args){
//        List Operations
        List<Integer> numbers = new ArrayList<>(Arrays.asList(16,13,14,15,1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        numbers.add(11);
        numbers.add(12);
        System.out.println("Added  few numbers to the list: " +numbers);

        numbers.removeFirst();
        System.out.println("Removed the first value of the list: " +numbers);

        Collections.sort(numbers);
        System.out.println("Sorted the list in ascending order: " +numbers);

        boolean exists = numbers.contains(15);
        System.out.println("Contains 15? : " +exists);

//        Sets Operations
        Set<String> fruits = new HashSet<>(Arrays.asList("apple", "banana", "kiwi", "papaya", "mango", "mango"));
        System.out.println("Unique elements of the set:" +fruits);

        fruits.remove("mango");
        System.out.println("Removed an element of the set:" +fruits);

       boolean check=  fruits.contains("mango");
       System.out.println("Is the element present: " +check);

        for(String fruit :fruits){
            System.out.println(fruit);
        }
//        Map Operations
        Map<Integer, String> Employee = new HashMap<>();
        Employee.put(1, "john");
        Employee.put(2, "bob");
        Employee.put(3, "kim");
        Employee.put(4, "Lily");
        System.out.println(Employee);

        Employee.remove(4);
        System.out.println(Employee);

       boolean checkKey=  Employee.containsKey(3);
       System.out.println("Contains key? :" +checkKey);

       boolean checkValue = Employee.containsValue("john");
       System.out.println("Contains Value? : " +checkValue);

       String name = Employee.get(3);
       System.out.println("Value of the given key is: " +name);

        for (Map.Entry<Integer, String> entry : Employee.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

//        Queue Operations
        Queue<Integer> queue = new LinkedList<>();
        queue.add(15);
        queue.add(16);
        queue.add(17);
        System.out.println("Contents of the queue are: " +queue);

        while(!queue.isEmpty()){
            System.out.println("Serving: " +queue.poll());
        }

//       Sorting without duplicates
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5));
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);

        Collections.sort(list);
        System.out.println("Sorted list without duplicates: " + list);
    }

}
