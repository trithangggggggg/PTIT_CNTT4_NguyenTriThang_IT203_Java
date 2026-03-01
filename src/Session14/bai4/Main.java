package Session14.bai4;

import java.lang.reflect.Array;
import java.util.*;


public class Main {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cúm A");
        list.add("Sốt xuất huyết");
        list.add("Cúm A");
        list.add("Covid-19");
        list.add("Cúm A");

        Map<String, Integer> report = new TreeMap<>();

        for(String disease : list) {
            if(report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);
            } else {
                report.put(disease, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
