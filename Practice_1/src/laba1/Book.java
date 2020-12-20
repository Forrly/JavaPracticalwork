package laba1;
import java.lang.*;

public class Book {
    String name, author;
    int pages, price;
    public Book(String name, String author, int pages, int price){
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name is " + name  + ", author is " + author  + ", pages are " + pages + ", price is " + price ;
    }
}
