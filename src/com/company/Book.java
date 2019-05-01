package com.company;

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

    public String getDisplayText(){
        String Author  = getAuthor();
        String Title = getBookTitle();
        String Description = getDescription();

        return  Author+ " " + Title+" " + Description;
    }

}
