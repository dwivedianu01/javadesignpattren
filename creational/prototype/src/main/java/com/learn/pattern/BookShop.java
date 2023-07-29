package com.learn.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books = new ArrayList<Book>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    public void loadBooks() {
        for (int i = 1; i < 100; i++) {
            Book bk = new Book();
            bk.setBookNo(i);
            bk.setBookName("Book" + 1);
            this.books.add(bk);

        }

    }
    /*
    Shallow Cloning, If we change in parent object it will also affect cloned one
     */
   /* @Override
    public BookShop clone() throws CloneNotSupportedException {
        return (BookShop) super.clone();
    }*/
    /*
    Deep Cloning
     */
    @Override
    public BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for(Book book:this.getBooks()){
            bookShop.getBooks().add(book);
        }
        return bookShop;
    }
}
