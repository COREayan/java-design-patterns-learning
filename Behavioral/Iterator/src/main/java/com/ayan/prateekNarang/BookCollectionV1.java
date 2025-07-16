package com.ayan.prateekNarang;

import java.util.*;

public class BookCollectionV1 {
    public List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
