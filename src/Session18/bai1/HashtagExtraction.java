package Session18.bai1;

import java.util.*;
import java.util.regex.*;

public class HashtagExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đoạn văn bản:");
        String input = sc.nextLine();

        Set<String> set = new HashSet<>();

        Pattern pattern = Pattern.compile("#\\S+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String tag = matcher.group();   // ví dụ: #java

            String content = tag.substring(1); // bỏ dấu #

            // Kiểm tra bằng code
            if (content.length() >= 2 && content.matches("[a-zA-Z0-9]+")) {
                set.add(content.toLowerCase()); // không phân biệt hoa thường
            }
        }

        // Sort theo thứ tự tự nhiên
        List<String> sorted = new ArrayList<>(set);
        Collections.sort(sorted);

        System.out.println("Danh sách hashtag hợp lệ:");
        for (String s : sorted) {
            System.out.println("#" + s);
        }
    }
}