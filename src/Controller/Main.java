package Controller;

import model.Book;

import java.util.Scanner;

/*
    Viết menu cho phép thực hiện các chức năng 1, 2
 */
public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("_______________MENU_______________");
            System.out.println("1. Nhập danh sách đầu sách mới. In ra danh sách các đầu sách đã có.");
            System.out.println("2. Nhập danh sách bạn đọc mới. In ra danh sách bạn đọc đã có.");
            System.out.println("3. Theo tên bạn đọc");
            System.out.println("4. Theo Số lượng cuốn sách được mượn (giảm dần)");
            System.out.println("5. Tìm kiếm và hiển thị danh sách mượn sách theo tên bạn đọc.");
            System.out.println("0. Thoát khỏi ứng dụng.");

            choice = scanner.nextInt();
            scanner.nextLine();// doc bo dong chua lua chon
            Controller controller = new Controller();
            switch (choice) {
                case 0:
                    System.out.println("Hẹn gặp lại!!!");
                    System.exit(0);
                case 1:
                    System.out.print("Nhập số lượng sách cần nhập: ");
                    Controller.numBook = scanner.nextInt();
                    controller.addLBook();
                    controller.inLBook();
                    break;
                case 2:
                    System.out.print("Nhập số lượng bạn đọc cần nhập: ");
                    Controller.numReader = scanner.nextInt();
                    controller.addLReader();
                    controller.inLReader();
                    break;
            }
        } while (choice != 0);
    }
}
