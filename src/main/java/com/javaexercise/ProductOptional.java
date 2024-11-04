package com.javaexercise;

import java.util.Optional;

public class ProductOptional {
    private final int id;
    private final String name;
    private final String description;

    public ProductOptional(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Integer> getID() {
        return Optional.ofNullable(id);
    }

    public void printID(){
        getID().ifPresentOrElse(
                id -> System.out.println("Id is: " +id),
                ()-> System.out.println("ID is not available")
        );
    }

    public void printDescription() {
        getDescription().ifPresentOrElse(
                desc -> System.out.println("Description: " + desc),
                () -> System.out.println("Description not available.")
        );
    }

    public static void main(String[] args) {
        ProductOptional product1 = new ProductOptional(1, "Laptop", "High-end gaming laptop.");
        ProductOptional product2 = new ProductOptional(0, "Mouse", null);

        product1.printDescription();
        product2.printDescription();
        product1.printID();
        product2.printID();
    }
}
