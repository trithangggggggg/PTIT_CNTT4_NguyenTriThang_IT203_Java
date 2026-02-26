package Session13.bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gioi1 {
    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {

        List<T> ketQua = new ArrayList<>(listA);
        ketQua.retainAll(listB);

        return ketQua;
    }

    public static void main(String[] args) {

        List<Integer> khoaNoi = Arrays.asList(101, 102, 105);
        List<Integer> khoaNgoai = Arrays.asList(102, 105, 108);

        System.out.println("Test Case 1 Output: "
                + findCommonPatients(khoaNoi, khoaNgoai));

        List<String> bhytNoi = Arrays.asList("DN01", "DN02", "DN03");
        List<String> bhytNgoai = Arrays.asList("DN02", "DN04");

        System.out.println("Test Case 2 Output: "
                + findCommonPatients(bhytNoi, bhytNgoai));
    }
}