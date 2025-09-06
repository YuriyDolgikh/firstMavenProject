package com;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Thinking in Java 4th Edition", "Bruce Eckel", 2012, 540);
        System.out.println("Lombok library demo:");
        System.out.println("Author: " + book.getAuthor());
        System.out.println(book);
        System.out.println();
        System.out.println("Gson library demo:");
        Gson gsonBook = new Gson();
        String jsonBook = gsonBook.toJson(book);
        System.out.println(jsonBook);
    }
}
