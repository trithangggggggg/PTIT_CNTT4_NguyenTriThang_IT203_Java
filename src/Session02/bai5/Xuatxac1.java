package Session02.bai5;

import java.util.Scanner;

public class Xuatxac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diemUyTin = 100;
        int soNgayTre;

        System.out.println("Nhap so ngay tre cua moi lan tra sach (999 de ket thuc)");

        while (true) {
            System.out.print("So ngay tre: ");
            soNgayTre = sc.nextInt();

            if (soNgayTre == 999) {
                break;
            }
            if (soNgayTre <= 0) {
                diemUyTin += 5;
            } else {
                diemUyTin -= soNgayTre * 2;
            }
        }
        System.out.println("Tong diem uy tin: " + diemUyTin);

        if (diemUyTin > 120) {
            System.out.println("Xep loai: Doc gia Than thiet");
        } else if (diemUyTin >= 80) {
            System.out.println("Xep loai: Doc gia Tieu chuan");
        } else {
            System.out.println("Xep loai: Doc gia can luu y");
        }
    }
}
