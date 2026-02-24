package Session09.demo;

import java.util.Scanner;

public class Animal {
    public String animalName;
    public int numberOfLegs;
    public String furColor;
    public int everageLifeExpectancy;

    public Animal(int everageLifeExpectancy, String furColor, int numberOfLegs, String animalName) {
        this.everageLifeExpectancy = everageLifeExpectancy;
        this.furColor = furColor;
        this.numberOfLegs = numberOfLegs;
        this.animalName = animalName;
    }

    public Animal() {
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setEverageLifeExpectancy(int everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dong vat: ");
        animalName = sc.nextLine();

        System.out.print("Nhap so chan: ");
        numberOfLegs = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap mau long: ");
        furColor = sc.nextLine();

        System.out.print("Nhap tuoi tho trung binh: ");
        everageLifeExpectancy = sc.nextInt();
    }

    public void display() {
        System.out.println("Ten dong vat: " + animalName);
        System.out.println("So chan: " + numberOfLegs);
        System.out.println("Mau long: " + furColor);
        System.out.println("Tuoi tho trung binh: " + everageLifeExpectancy);
    }

}
