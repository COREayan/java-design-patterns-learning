package com.ayan.prateekNarang;

import java.util.Iterator;

public class ClientV3 {
    public static void main(String[] args) {
        BookCollectionV3 bookCollection = new BookCollectionV3();
        bookCollection.addBook(new Book("C++"));
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("Python"));

        Iterator<Book> iterator = bookCollection.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
//            System.out.print("Book Title " + book.getTitle());
            System.out.println(book);
        }
    }
}
