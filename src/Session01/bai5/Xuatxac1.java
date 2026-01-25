package Session01.bai5;

import java.util.Scanner;

public class Xuatxac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach (4 chu so): ");
        int bookCode = sc.nextInt();

        int thousands = bookCode / 1000;
        int hundreds = (bookCode % 1000) / 100;
        int dozens = (bookCode % 100) / 10;
        int units = bookCode % 10;

        int sumOfFirstThree = thousands + hundreds + dozens;

        boolean isValid = (sumOfFirstThree % 10) == units;

        System.out.println("Chu so kiem tra ki vong: " + units);
        System.out.println("Kết quả: " + isValid);
        sc.close();
    }
}
