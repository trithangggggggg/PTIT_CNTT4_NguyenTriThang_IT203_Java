package Session02.bai4;

import java.util.Scanner;

public class Gioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ID ;

        do {
            System.out.print("Moi nhap Id sach moi(>0): ");
            ID = sc.nextInt();

            if(ID < 0){
                System.out.println("Khong nhap so am, nhap lai");
            }else {
                System.out.println("Chap nhan ma sach !");
            }
        }while (ID <= 0);
    }
}
