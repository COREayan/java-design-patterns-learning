package com.ayan.prateekNarang;

public class ClientV1 {
    public static void main(String[] args) {
        BookCollectionV1 bookCollection = new BookCollectionV1();
        bookCollection.addBook(new Book("C++"));
        bookCollection.addBook(new Book("Java"));
        bookCollection.addBook(new Book("Python"));

        for (int i=0; i<bookCollection.getBooks().size(); i++) {
            System.out.println(bookCollection.getBooks().get(i));
        }
    }
}
