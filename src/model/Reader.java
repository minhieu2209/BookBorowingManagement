package model;

import java.util.Scanner;

public class Reader {
    private static int id = 10000;
    private int readerID;
    private String fullName;
    private String address;
    private String type;
    private String phoneNumber;

    public Reader() {
        this.readerID = id++;
    }

    public Reader(int readerID) {
        this.readerID = readerID;
    }

    public Reader(int readerID, String fullName, String address, String phoneNumber, String type) {
        this.readerID = readerID;
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Reader.id = id;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public String getFullName() {
        return fullName;
    }

    public Reader(String type) {
        this.type = type;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addReader() {
        Scanner scanner = new Scanner(System.in);
        String[] aType = {"Sinh viên", "Học viên", "Giáo viên"};
        int t;
        System.out.print("Nhập tên bạn đọc: ");
        this.fullName = scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();

        System.out.print("Nhập sđt: ");
        this.phoneNumber = scanner.nextLine();
        do {
            System.out.print("Nhập loại bạn đọc: ");
            System.out.println("1. Sinh viên.\n2. Học viên.\n3. Giáo viên");
            t = scanner.nextInt();
        } while (t < 1 || t > 4);

         this.type = aType[t - 1];
    }
    public void inReader() {
        System.out.println("------------------------------------------");
        System.out.println( this.readerID + " \t|\t " + this.fullName + " \t|\t " + this.address + " \t|\t "
                + this.type + " \t|\t " + this.phoneNumber);
    }
}
