package com.javaexercise;

import java.util.Optional;

public record BookOptional(String title, String author) {

    public Optional<String> getAuthorName(){
        return Optional.ofNullable(author);
    }

    public void printName(){
        getAuthorName().ifPresentOrElse(
                author-> System.out.println("Author Name: " +author),
                ()-> System.out.println("Author Name not found")
        );
    }

    public static void main(String[] args){
        BookOptional book1 = new BookOptional("atomic habits", "clear");
        BookOptional book2 =  new BookOptional("rich dad poor dad", null);

        book1.printName();
        book2.printName();
    }
}
