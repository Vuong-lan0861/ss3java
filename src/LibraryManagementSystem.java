import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    static ArrayList<Author> authors = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static int authorIdCounter = 1;
    static int bookIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu chính");
            System.out.println("1. Quản lý tác giả");
            System.out.println("2. Quản lý sách");
            System.out.println("3. Thoát");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    AuthorManager.manageAuthors(scanner);
                    break;
                case 2:
                    BookManager.manageBooks(scanner);
                    break;
                case 3:
                    System.out.println("Đã thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
