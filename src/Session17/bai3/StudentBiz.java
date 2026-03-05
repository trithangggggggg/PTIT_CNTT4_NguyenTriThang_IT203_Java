package Session17.bai3;

import java.util.Scanner;

public class StudentBiz extends Person {
    private double marketingScore;
    private double salesScore;

    @Override
    public void inputData(Scanner sc) {
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Điểm Marketing: ");
        marketingScore = Double.parseDouble(sc.nextLine());
        System.out.print("Điểm Sales: ");
        salesScore = Double.parseDouble(sc.nextLine());
    }

    @Override
    public double calculatePoint() {
        return (marketingScore + salesScore) / 2;
    }

    @Override
    public void displayInfo() {
        System.out.println("Biz - ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Avg: " + calculatePoint());
    }
}