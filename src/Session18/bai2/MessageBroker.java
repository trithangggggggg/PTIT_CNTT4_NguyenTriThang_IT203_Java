package Session18.bai2;

import java.util.*;

public class MessageBroker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập danh sách tin nhắn (cách nhau bởi dấu phẩy):");
        String input = sc.nextLine();

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        String[] arr = input.split(",");

        // Đưa vào Queue (lọc hợp lệ)
        for (String s : arr) {
            String type = s.trim().toLowerCase();

            if (type.equals("sms") || type.equals("email") || type.equals("zalo")) {
                queue.offer(type);
            }
        }

        // Xử lý Queue
        while (!queue.isEmpty()) {
            String processed = queue.poll();
            map.put(processed, map.getOrDefault(processed, 0) + 1);
        }

        // Sort theo số lượng giảm dần
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Kết quả thống kê:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey().toUpperCase() + ": " + entry.getValue());
        }
    }
}