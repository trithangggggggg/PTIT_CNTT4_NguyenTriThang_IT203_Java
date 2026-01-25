package Session01.bai1;

import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookId;
        String bookName;
        int publishYear;
        double price;
        boolean isAvailable;

        System.out.print("Nhap ma sach: ");
        bookId = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        publishYear = sc.nextInt();

        System.out.print("Nhập giá tiền: ");
        price = sc.nextDouble();

        System.out.print("Tình trạng còn sách (true/false): ");
        isAvailable = sc.nextBoolean();


        int bookAge  = 2026 - publishYear ;
        String booknameUpper  =  bookName.toUpperCase();
        String status  =  isAvailable  ? "Con sach" : "Het sach";

        System.out.println("\n --- THong tin sach ----");
        System.out.println("Ma sach: " + bookId);
        System.out.println("Ten sach: " + booknameUpper);
        System.out.println("Nam xuat ban: "+ publishYear);
        System.out.println("Gia tien: "+ price +"USD");
        System.out.println("Tuoi tho sach: " + bookAge +" nam");
        System.out.println("Tinh trang: "+ status);
        System.out.println("----------------------------");
    }

}
