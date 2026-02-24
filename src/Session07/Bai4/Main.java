package Session07.Bai4;

public class Main {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("Thang");
        ClassRoom s2 = new ClassRoom("Tien");
        ClassRoom s3 = new ClassRoom("Minh");

        s1.contribute(100);
        s2.contribute(200);
        s3.contribute(150);

        System.out.println("Tong quy lop: " + ClassRoom.getClassFund());
    }
}
