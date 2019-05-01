package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Book {
    private String BookTitle;
    private String Author;
    private String Description;
    private double Price;
    private int QtyInStock;
    private boolean isInStock;

    public String getBookTitle() {
        return BookTitle;
    }

    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getQtyInStock() {
        return QtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        QtyInStock = qtyInStock;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public Book() {
    }

    public Book(String bookTitle, String author, String description, double price, int qtyInStock, boolean isInStock) {
        BookTitle = bookTitle;
        Author = author;
        Description = description;
        Price = price;
        QtyInStock = qtyInStock;
        this.isInStock = isInStock;
    }

    public String getDisplayText() {
        String Author = getAuthor();
        String Title = getBookTitle();
        String Description = getDescription();

        return Author + " " + Title + " " + Description;
    }

        public double bookCalc(int qtyOfBooks,double priceOfBooks){

            double calc = qtyOfBooks * priceOfBooks;

            return calc ;


        }

        public void bookValid(){
            Scanner keyboard = new Scanner(System.in);
            boolean inStock = isInStock();


            if (inStock == true){
                System.out.println("Please enter the Qty of books you would like to purchase:");
                int qtyOfBooks = keyboard.nextInt();
                keyboard.nextLine();
                System.out.println("Please enter the price on the book");
                double priceOfBooks = keyboard.nextDouble();
                keyboard.nextLine();
                System.out.println("The price is $" + bookCalc(qtyOfBooks,priceOfBooks));

            }

            else{
                System.out.println("This book is out of stock");
            }

        }


    }


