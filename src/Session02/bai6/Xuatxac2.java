package Session02.bai6;

import java.util.Scanner;

public class Xuatxac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int luotMuon;
        int max = -1;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int soNgayMoCua = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhap so luot muon sach cua ngay thu " + i + ": ");
            luotMuon = sc.nextInt();

            if (luotMuon == 0) {
                continue;
            }

            tong += luotMuon;
            soNgayMoCua++;

            if (luotMuon > max) {
                max = luotMuon;
            }

            if (luotMuon < min) {
                min = luotMuon;
            }
        }

        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);

        if (soNgayMoCua > 0) {
            double trungBinh = (double) tong / soNgayMoCua;
            System.out.println("Trung binh luot muon (ngay mo cua): " + trungBinh);
        } else {
            System.out.println("Khong co ngay nao mo cua de thong ke!");
        }
    }
}
