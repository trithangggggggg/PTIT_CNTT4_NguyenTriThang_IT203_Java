package Session07.Bai2;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        System.out.println("=== Primitive ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Students s1 = new Students();
        s1.setName("An");

        Students s2 = s1;
        s2.setName("Thang");

        System.out.println("\n=== Reference ===");
        System.out.println("s1.name = " + s1.getName());
        System.out.println("s2.name = " + s2.getName());
    }
}
