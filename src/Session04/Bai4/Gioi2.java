package Session04.Bai4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the thu vien: ");
        String cardID = sc.nextLine();

        String regex = "^TV\\d{4}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()) {
            System.out.println("Ma the hop le ");
        } else {
            if (!cardID.startsWith("TV")) {
                System.out.println("Thieu tien to TV");
            } else if (!cardID.substring(2, 6).matches("\\d{4}")) {
                System.out.println(" Nam khong hop le");
            } else if (!cardID.substring(6).matches("\\d{5}")) {
                System.out.println("Ma so cuoi khog hop le");
            } else {
                System.out.println(" Dinh dang ma the sai");
            }
        }
    }
}
