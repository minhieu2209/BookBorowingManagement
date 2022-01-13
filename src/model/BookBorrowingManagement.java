package model;

import java.awt.print.Book;

public class BookBorrowingManagement {
    private Book book;
    private Reader reader;
    private int numOfBorrow;
    private int totalBorrowed;

    public BookBorrowingManagement() {
    }

    public BookBorrowingManagement(Book book, Reader reader,
                                   int numOfBorrow, int totalBorrowed) {
        this.book = book;
        this.reader = reader;
        this.numOfBorrow = numOfBorrow;
        this.totalBorrowed = totalBorrowed;
    }

    public BookBorrowingManagement(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public int getNumOfBorrow() {
        return numOfBorrow;
    }

    public void setNumOfBorrow(int numOfBorrow) {
        this.numOfBorrow = numOfBorrow;
    }

    public int getTotalBorrowed() {
        return totalBorrowed;
    }

    public void setTotalBorrowed(int totalBorrowed) {
        this.totalBorrowed = totalBorrowed;
    }
}
