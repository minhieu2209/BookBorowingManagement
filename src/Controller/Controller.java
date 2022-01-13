package Controller;

import model.Book;
import model.Reader;

import java.util.Scanner;

public class Controller {
    public static int numBook;
    public static int numReader;
    private Book[] lBook;
    private Reader[] lReader;

    public Controller() {
    }
//    public Book addBook(){
//        Scanner scanner = new Scanner(System.in);
//        String[] specs = {"Khoa học tự nhiên", "Văn học – Nghệ thuật", "Điện tử Viễn"
//                + "thông", "Công nghệ thông tin"};
//        String bookName, author, specialization;
//        int sp, publishYear, quantity;
//        System.out.print("Nhập tên sách: ");
//        bookName = scanner.nextLine();
//
//        System.out.print("Nhập tên tác giả: ");
//        author = scanner.nextLine();
//
//        do {
//            System.out.println("Nhập thể loại sách: ");
//            System.out.println("1. Khoa học tự nhiên.\n2. Văn học – Nghệ thuật.\n3. Điện tử Viễn thông.\n4. Công nghệ thông tin.");
//            sp = scanner.nextInt();
//        } while (sp < 1 || sp > 4);
//
//        specialization = specs[sp - 1];
//
//        System.out.print("Nhập năm xuất bản: ");
//        publishYear = scanner.nextInt();
//
//        System.out.print("Nhập số lượng: ");
//        quantity = scanner.nextInt();
//        Book b = new Book(Book.getId(), bookName, author, specialization, publishYear, quantity);
//        return b;
//    }
    public void addLBook(){
        lBook = new Book[numBook];
        for(int i = 0; i < lBook.length; i++){
            Book newBook = new Book();
            newBook.addBook();
            this.lBook[i] = newBook;
        }
        System.out.println(numBook);
    }
    public void addLReader(){
        lReader = new Reader[numReader];
        for(int i = 0; i < lReader.length; i++){
            Reader newReader = new Reader();
            newReader.addReader();
            this.lReader[i] = newReader;
        }
    }
    public void inLBook(){
        for(int i = 0; i < lBook.length; i++){
            lBook[i].inBook();
        }
    }
    public void inLReader(){
        for(int i = 0; i < lReader.length; i++){
             lReader[i].inReader();
        }
    }
}
