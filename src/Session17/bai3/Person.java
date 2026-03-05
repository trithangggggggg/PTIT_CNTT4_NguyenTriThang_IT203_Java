package Session17.bai3;

import java.util.Scanner;

public abstract class Person {
    protected String id;
    protected String name;
    protected int age;

    public abstract double calculatePoint();
    public abstract void displayInfo();
    public abstract void inputData(Scanner sc);
}