package Session12.HN_KS24_CNTT4_NguyenTriThang_02.cau1;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Phanmot {
    static void main() {
        // Tách số và tính tổng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Loi khong nhap noi dung ");
            return;
        }
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        int sum = 0;
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        System.out.println(sum);
        sc.close();
    }
}
