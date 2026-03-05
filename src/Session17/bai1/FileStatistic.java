package Session17.bai1;

import java.util.*;
import java.util.regex.*;

public class FileStatistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách file (cách nhau bởi dấu phẩy): ");
        String input = sc.nextLine();

        String[] files = input.split(",");
        Map<String, Integer> map = new HashMap<>();

        String regex = "^[a-zA-Z0-9]+\\.(pdf|png|docx)$";
        Pattern pattern = Pattern.compile(regex);

        for (String file : files) {
            file = file.trim();
            Matcher matcher = pattern.matcher(file);

            if (matcher.matches()) {
                String extension = matcher.group(1);
                map.put(extension, map.getOrDefault(extension, 0) + 1);
            }
        }

        System.out.println("Kết quả thống kê:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
