package Session17.bai2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class WordReversal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập câu:");
        String input = sc.nextLine();

        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();

        // Tách từ
        String[] words = input.split(" ");

        // Đưa vào Queue
        for (String word : words) {
            queue.offer(word);
        }

        // Từ Queue sang Stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // In ra từ Stack
        System.out.print("Câu sau khi đảo: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
