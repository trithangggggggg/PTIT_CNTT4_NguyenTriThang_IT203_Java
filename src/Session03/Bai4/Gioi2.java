package Session03.Bai4;

public class Gioi2 {
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // đổi chỗ
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] books = {105, 23, 89, 12, 77, 3};

        System.out.println("Danh sach ma sach trc khi sap xep:");
        displayBooks(books);

        sortBooks(books);

        System.out.println("Danh sach ma sach sau khi sap xep:");
        displayBooks(books);
    }
}
