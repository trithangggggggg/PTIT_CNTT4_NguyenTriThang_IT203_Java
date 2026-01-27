package Session03.Bai5;

import java.util.Scanner;

public class Xuatsac1 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int flag = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                flag = i;
                break;
            }
        }
        if (flag == -1) {
            System.out.println("Khong tim thay ma sach can xoa!");
            return n;
        }
        for (int i = flag; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n--;
        System.out.println("Da xoa ma sach: " + bookId);
        return n;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Kho sach rong!");
            return;
        }
        System.out.print("Danh sach ma sach: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 202, 303, 404, 505};
        int n = books.length;

        while (true) {
            displayBooks(books, n);
            if (n == 0) {
                break;
            }

            System.out.print("Nhap ma sach can xoa: ");
            int bookId = sc.nextInt();

            n = deleteBook(books, n, bookId);

            System.out.print("Ban co muon tiep tuc xoa? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            }
        }
        System.out.println("Ket thuc chuong trinh.");
    }
}
