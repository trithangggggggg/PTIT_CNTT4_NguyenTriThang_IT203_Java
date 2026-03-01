package Session14.bai3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        Set<String> thanhPhan = new HashSet<>();
        thanhPhan.add("Aspirin");
        thanhPhan.add("Caffeine");
        thanhPhan.add("Paracetamol");

        Set<String> diUng = new HashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");

        Set<String> warning = new HashSet<>(thanhPhan);
        warning.retainAll(diUng);

        Set<String> safe = new HashSet<>(thanhPhan);
        safe.removeAll(diUng);

        System.out.println("Canh bao di ung : " + warning);
        System.out.println("Thanh phan an toan : " + safe);
    }
}
