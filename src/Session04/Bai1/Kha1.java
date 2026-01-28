package Session04.Bai1;

import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten sach:");
        String book = sc.nextLine();
        System.out.println("Nhap ten tac gia:");
        String author = sc.nextLine();

        book = book.trim().replaceAll("\\s+", " ").toUpperCase();

        author = author.trim().replaceAll("\\s+", " ").toLowerCase();
        author = formatAuthorName(author);

        String result = book + " - Tac gia: " + author;
        System.out.println(result);
    }

    public static String formatAuthorName(String author) {
        String[] words = author.split(" ");
        String result = "";

        for (String word : words) {
            result += word.substring(0, 1).toUpperCase()
                    + word.substring(1) + " ";
        }
        return result.trim();
    }
}
