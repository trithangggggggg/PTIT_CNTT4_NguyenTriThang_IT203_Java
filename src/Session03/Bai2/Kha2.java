package Session03.Bai2;

import java.util.Scanner;

public class Kha2 {
    static String[] books = {"Doraemon","OnePiece", "Dragon Ball", "Conan", "Harry Potter"};

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();

        int index = searchBooks(books, search);

        if (index != -1) {
            System.out.println("Tim thay tai vi tri " + index);
        } else {
            System.out.println("Sach khong ton tai");
        }
    }
}
