package com.ayan.prateekNarang;

import java.util.*;

public class BookCollectionV3 implements Iterable<Book> {
    public Set<Book> books = new TreeSet<>();

    public void addBook(Book book) {
        books.add(book);
    }


    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }
}
