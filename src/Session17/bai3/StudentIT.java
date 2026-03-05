package Session17.bai3;

import java.util.Scanner;

public class StudentIT extends Person {
    private double javaScore;
    private double htmlScore;

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Điểm Java: ");
        javaScore = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm HTML: ");
        htmlScore = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double calculatePoint() {
        return (javaScore * 2 + htmlScore) / 3;
    }

    @Override
    public void displayInfo() {
        System.out.println("IT - ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Avg: " + calculatePoint());
    }
}