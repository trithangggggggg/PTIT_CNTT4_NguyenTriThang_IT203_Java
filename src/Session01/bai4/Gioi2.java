package Session01.bai4;

import java.util.Scanner;

public class Gioi2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print(" nhap gia tien : ");
            double giaTien = sc.nextDouble();

            System.out.print("Nhap ti gia: ");
            float tiGia = sc.nextFloat();

            double vnd = giaTien * tiGia;
            long total = (long)vnd;

            System.out.println("Gia sach: "+ giaTien + "USD");
            System.out.println("Ti gia: "+ tiGia + "VND/USD");
            System.out.println("Tong tien: "+ total + "VND");
        }
}
