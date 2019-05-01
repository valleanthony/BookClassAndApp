package com.company;

public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book("I love java","Ant Valle","Fun with Java",10.00,5,true);

        System.out.println(b1.getDisplayText());
       b1.bookValid();


    }
}
