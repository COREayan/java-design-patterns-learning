package com.ayan.prateekNarang;

import java.util.Iterator;

public class ClientV2 {
    public static void main(String[] args) {
        BookCollectionV2 bookCollection = new BookCollectionV2();
        bookCollection.addBook(new Book("C++"));
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("Python"));

        Iterator<Book> iterator = bookCollection.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
//            System.out.print("Book Title " + book.getTitle());
            System.out.println(book);
        }
    }
}
