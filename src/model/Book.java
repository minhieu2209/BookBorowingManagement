package model;

import java.util.Scanner;

public class Book {
    private static int id = 100000;
    private int bookID;
    private String bookName;
    private String author;
    private String specialization;
    private int publishYear;
    private int quantity;

    public Book() {
        this.bookID = id++;
    }

    public Book(int bookID, String bookName, String author,
                String specialization, int publishYear, int quantity) {

        this.bookName = bookName;
        this.author = author;
        this.specialization = specialization;
        this.publishYear = publishYear;
        this.quantity = quantity;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Book.id = id;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        String[] specs = {"Khoa học tự nhiên", "Văn học–Nghệ thuật", "Điện tử Viễn"
                + "thông", "Công nghệ thông tin"};

        int sp;
        System.out.print("Nhập tên sách: ");
        this.bookName = scanner.nextLine();

        System.out.print("Nhập tên tác giả: ");
        this.author = scanner.nextLine();

        do {
            System.out.println("Nhập thể loại sách: ");
            System.out.println("1. Khoa học tự nhiên.\n2. Văn học – Nghệ thuật.\n3. Điện tử Viễn thông.\n4. Công nghệ thông tin.");
            sp = scanner.nextInt();
        } while (sp < 1 || sp > 4);

        this.specialization = specs[sp - 1];

        System.out.print("Nhập năm xuất bản: ");
        this.publishYear = scanner.nextInt();

        System.out.print("Nhập số lượng: ");
        this.quantity = scanner.nextInt();
    }
    public void inBook() {
        System.out.println("------------------------------------------");
        System.out.println( this.getBookID() + " \t|\t " + this.bookName + " \t|\t " + this.author + " \t|\t "
                + this.specialization + " \t|\t " + this.publishYear);
    }
}
