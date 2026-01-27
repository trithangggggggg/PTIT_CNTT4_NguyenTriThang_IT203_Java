package Session03.Bai1;

import java.util.Scanner;

public class Kha1 {
    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];
        System.out.printf("Nhap ma so cho %d cuon sach: \n", n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap ma sach thu %d:  ", i + 1);
            books[i] = sc.nextInt();
        }
        return books;
    }

    public static void displayBookToLibraries(int[] arr) {
        System.out.println("Danh sach ma sach : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, \t",  arr[i]);
        }
    }


    public static void main(String[] args) {
        System.out.print("Nhap so luong sach can quan li: ");
        int n = new Scanner(System.in).nextInt();
        int[] books = addBookToLibraries(n);
        displayBookToLibraries(books);
    }

}
