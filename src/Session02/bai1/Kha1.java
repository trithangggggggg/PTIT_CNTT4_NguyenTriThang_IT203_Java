package Session02.bai1;

import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int age = sc.nextInt();

        System.out.print("Nhap so sach dang muon: ");
        int books = sc.nextInt();

        if (age >= 18 && books < 3){
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach Quy Hiem !!");
        }else if (age >= 18 && books >= 3){
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("Li do: Ban da muon tren 3 cuon");
        }else {
            System.out.println("Ket qua: Khong du dieu kien");
            System.out.println("Li do: Ban chua du 18 tuoi");
        }
    }
}
