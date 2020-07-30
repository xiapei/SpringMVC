package com.demo.bean;

/**
 * @author xiapp
 * @version 1.0
 * @date 2020/7/30 10:04
 */
public class Book {

    private String bookName;
    private String author;
    private Double price;
    private Integer stock;

    public Book(String bookName, String author, Double price, Integer stock) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
