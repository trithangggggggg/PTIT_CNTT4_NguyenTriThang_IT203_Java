package Session10.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh hinh tron: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Dien tich hinh tron: " + circle.getArea());
        System.out.println("Chu vi hinh tron: " + circle.getPerimetert());
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        double width = sc.nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
        System.out.println("Chu vi hinh chu nhat: " + rectangle.getPerimetert());
    }
}
